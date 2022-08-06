package com.kyrie.study.client.lock;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/23 14:14
 */
public class DistributedLock {

    private final String connectionString="192.168.101.101:2181,192.168.101.102:2181,192.168.101.103:2181";

    private final  int sessionTimeout=10000;

    private final ZooKeeper keeper;

    private CountDownLatch connectLatch=new CountDownLatch(1);

    public DistributedLock() throws IOException, InterruptedException, KeeperException {
        // 获取连接
        keeper = new ZooKeeper(connectionString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {

            }
        });

        //等待zk正常连接后，继续往下执行
        connectLatch.await();

        //判断是否存在/locks节点，不存在创建节点
        Stat exists = keeper.exists("/locks", false);
        if(exists==null){
            //创建永久节点
            keeper.create("/locks","locks".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
        }
    }

    /**
     * 加锁
     */
    public void zkLock(){
        //创建临时节点

        //判断创建的节点是否是最小的序号节点，如果是获取到锁，如果不是，监听序号前一个节点
        
    }

    /**
     * 解锁
     */
    public void unLock(){
        //删除临时节点
    }

    /**
     * 判断根节点locks是否存在
     */
    public boolean existsLocks(){
        return false;
    }
}
