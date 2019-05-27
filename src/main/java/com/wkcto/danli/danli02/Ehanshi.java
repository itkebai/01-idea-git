package com.wkcto.danli.danli02;

public class Ehanshi {

    private static Ehanshi ehanshi = new Ehanshi();

    private Ehanshi() { }

    public static Ehanshi getEhanshi() {
        return ehanshi;
    }
}
