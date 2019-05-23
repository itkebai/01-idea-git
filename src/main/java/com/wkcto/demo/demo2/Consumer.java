package com.wkcto.demo.demo2;

public class Consumer implements Runnable {

    private Utils utils;

    public Consumer(Utils utils) {
        this.utils = utils;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Con: i " + i);
                Thread.sleep(3000);                // 这里设置跟上面30不同是为了 盒子中的苹果能够增加，不会生产一个马上被消
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        utils.decreace();
    }
}
