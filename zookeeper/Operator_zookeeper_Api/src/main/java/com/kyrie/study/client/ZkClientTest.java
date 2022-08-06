package com.kyrie.study.client;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/20 22:19
 */
public class ZkClientTest {
    /**
     * 连接路径
     */
    private String connectionString="192.168.101.101:2181,192.168.101.102:2181,192.168.101.103:2181";
    /**
     * 超时时间单位毫秒
     */
    private int sessionTimeout=100000;

    private ZooKeeper zookeeper;
    /**
     * 初始化zookeeper
     */
    @Before
    public void init() throws IOException {
        //创建连接zookeeper
            zookeeper = new ZooKeeper(connectionString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                List<String> children = null;
                try {
                    children = zookeeper.getChildren("/", true);
                } catch (KeeperException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (String child : children) {
                    System.out.println(child);
                }
            }
        });
    }

    @Test
    public void create() throws InterruptedException, KeeperException {
        //创建一个zookeeper节点
        String node = zookeeper.create("/kyrie", "kyrie.avi".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    /**
     * 获取节点信息
     */
    @Test
    public void getChildren() throws InterruptedException, KeeperException {
        //获取/下面所有的节点信息
        List<String> children = zookeeper.getChildren("/", true);
        for (String child : children) {
            System.out.println(child);
        }
        //延时处理,让当前方法一直在执行中，方法会调用 Watcher的process方法，方法中获取的时候
        // children = zookeeper.getChildren("/", true); 让监听器一直执行，所以每次有节点变化的时候，就会监听到
        Thread.sleep(Integer.MAX_VALUE);
    }


    /**
     * 判断zookeeper中是否存在节点
     * @throws InterruptedException
     * @throws KeeperException
     */
    @Test
    public void exists() throws InterruptedException,KeeperException {
        Stat exists = zookeeper.exists("/kyrie", false);
        System.out.println(exists==null?"没有获取数据":"存在该节点");
    }
}
