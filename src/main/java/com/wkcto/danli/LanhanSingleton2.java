package com.wkcto.danli;

public class LanhanSingleton2 {
    private static LanhanSingleton2 instance2;

    private LanhanSingleton2() { }

    public static LanhanSingleton2 getInstance() {
        if (null == instance2) {
            synchronized (LanhanSingleton2.class) {
                if (instance2 == null) {
                    instance2 = new LanhanSingleton2();
                }
            }
        }
        return instance2;
    }
}
