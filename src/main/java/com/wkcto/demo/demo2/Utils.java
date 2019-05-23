package com.wkcto.demo.demo2;

public class Utils {
    private int apple = 0;

    //生产
    public synchronized void increace() {
        if (apple == 3) {
            try {
                wait();
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
        apple++;

        System.out.println("生产苹果成功");
        notify();
    }

    //消费
    public synchronized void decreace() {
        if (apple == 0) {
            try {
                wait();

            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
        apple--;
        System.out.println("消费苹果成功");
        notify();
    }

    public static void main(String[] args) {
        Utils utils = new Utils();
        Producer producer = new Producer(utils);
        Consumer consumer = new Consumer(utils);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();

    }
}
