package com.gfg.thread;

public class Sam implements Runnable {


    @Override
    public synchronized void run() {

        System.out.println("===1");

    }
}
