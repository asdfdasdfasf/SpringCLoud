package com.kyrie.study.client.demo;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/23 13:46
 * 监听服务是否上线
 */
public class ZkDynClient {
    private static String connectionString = "192.168.101.101:2181,192.168.101.102:2181,192.168.101.103:2181";

    private static int sessionTimeout = 100000;

    private static ZooKeeper zooKeeper;

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        //1. 连接zookeeper集群
        zooKeeper = new ZooKeeper(connectionString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                try {
                    getServerList();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (KeeperException e) {
                    e.printStackTrace();
                }
            }
        });
        //2. 监听指定路径的节点增加和减少
        getServerList();
        //3. sleep 保证process方法一直能够监听执行
        Thread.sleep(Integer.MAX_VALUE);

    }

    private static void getServerList() throws InterruptedException, KeeperException {
        //保存所有节点信息
        ArrayList<Object> arrayList = new ArrayList<>();
        List<String> children = zooKeeper.getChildren("/servers", true);
        for (String child : children) {
            byte[] data = zooKeeper.getData("/servers/" + child, false, null);
            arrayList.add(new String(data));
        }
        System.out.println("当前上线的服务列表:"+arrayList);
    }
}
