package com.kyrie.study.client.demo;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/23 13:36
 * 服务动态上下线案例
 */
public class ZkDynService {
    private static String connectionString="192.168.|101.101:2181,192.168.101.102:2181,192.168.101.103:2181";

    private static int sessionTimeout=100000;

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        //1. 连接zookeeper信息
       ZooKeeper zooKeeper=new ZooKeeper(connectionString, sessionTimeout, new Watcher() {
           @Override
           public void process(WatchedEvent watchedEvent) {

           }
       });
        //2. 注册服务器到zk集群
        zooKeeper.create("/servers/xixi","xixi".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);
        zooKeeper.create("/servers/haha","haha".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);
        zooKeeper.create("/servers/hehe","hehe".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);
        //3. 业务逻辑
        Thread.sleep(Integer.MAX_VALUE);
    }
}
