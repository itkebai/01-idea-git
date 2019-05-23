package com.wkcto.demo.demo3;

import java.util.concurrent.LinkedBlockingQueue;

public class PublicBoxQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(5);
        Thread thread1 = new Thread(new ProducerQueue(linkedBlockingQueue));
        Thread thread2 = new Thread(new ConsumerQueue(linkedBlockingQueue));

        thread1.start();
        thread2.start();
    }
}
