package com.wkcto.demo.demo3;

import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable {

    private final BlockingQueue blockingQueue;

    public ConsumerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }


    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                System. out .println("消费者消费的苹果编号为 ：" +blockingQueue .take());
                Thread. sleep(3000);  //在这里sleep是为了看的更加清楚些
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
