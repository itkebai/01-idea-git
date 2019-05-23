package com.wkcto.danli;

public class LanhanSingleton {

    private static LanhanSingleton instance;

    private LanhanSingleton() {

    }


    public static LanhanSingleton getInstance() {
        if (null == instance) {
            instance = new LanhanSingleton();
        }
        return instance;
    }
}
/**
 * 优点：实现起来比较简单，当LanhanSingleton被加载的时候，静态变量的instance并没有被创建并分配内存空间，当getInstance方法被调用
 *      初始化内存空间，节约了内存。
 *  缺点：在多线程的情况下，这种方法不能保证单例
 */
