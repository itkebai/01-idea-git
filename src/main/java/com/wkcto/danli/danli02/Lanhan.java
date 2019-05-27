package com.wkcto.danli.danli02;

public class Lanhan {

    private static Lanhan lanhan;

    private Lanhan() {

    }

    public static Lanhan getLanhan() {

            if (null == lanhan) {
                synchronized (Lanhan.class) {
                    if (lanhan == null) {
                        lanhan = new Lanhan();
                    }
                }
            }


        return lanhan;
    }

}
