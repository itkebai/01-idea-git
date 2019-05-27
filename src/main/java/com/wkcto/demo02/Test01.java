package com.wkcto.demo02;

public class Test01 {

    public static void main(String[] args) {
        /**
         * 这两中种方法还是有区别的，
         * 1.第一种方法是在常量池中拿数据
         * 2.第二种方法是在堆中创建了一个对象
         *
         * 记住 只要是new 创建的都是一个新的对象。
         */
        String a = "asd";

        String b = new String("asd");

        System.out.println("结果" + a .equals(b) );

    }


}
