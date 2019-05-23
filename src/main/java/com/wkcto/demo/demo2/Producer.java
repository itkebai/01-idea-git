package com.wkcto.demo.demo2;

/**
 * 生产者
 */
public class Producer implements Runnable {
    Utils utils;

    public Producer(Utils utils) {
        this.utils = utils;
    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("pro  i:" + i);
                Thread.sleep(30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        utils.increace();
    }
}
