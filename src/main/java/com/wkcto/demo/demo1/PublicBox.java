package com.wkcto.demo.demo1;

public class PublicBox {

    private int apple = 0;

    //生产
    public synchronized void increace() {
        while (apple ==5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        apple++;
        System. out .println("生成苹果成功！" );
        notify();
    }
    //消费
    public synchronized void decreace() {
        while (apple ==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        apple--;
        System. out.println( "消费苹果成功！" );
        notify();
    }

    public static void main(String []args)
    {
        PublicBox box= new PublicBox();

        Consumer con= new Consumer(box);
        Producer pro= new Producer(box);

        Thread t1= new Thread(con);
        Thread t2= new Thread(pro);

        t1.start();
        t2.start();


    }
}
