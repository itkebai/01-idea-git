package com.wkcto.demo.demo3;

import java.util.concurrent.BlockingQueue;

/**
 * 生产者
 */
public class ProducerQueue implements Runnable {

    private final BlockingQueue blockingQueue;

    public ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }


    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                System. out .println("生产者生产的苹果编号为 : " +i);  //放入十个苹果编号 为1到10
                blockingQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
