package com.wkcto.danli;

/**
 * 饿汉式
 */
public class Singleton {

    /**
     * （1）将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
     * <p>
     * （2）在该类内部产生一个唯一的实例化对象，并且将其封装为private static类型。
     * <p>
     * （3）定义一个静态方法返回这个唯一对象。
     */

    private static final Singleton singleton = new Singleton();

    private  Singleton() { }

    public static Singleton getSingleton() {
        return singleton;
    }
}
