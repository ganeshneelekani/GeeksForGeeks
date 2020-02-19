package com.gfg.array;

import java.util.LinkedList;

public class ConsumerProducer {

    public static void main(String[] args){


        PCImpl pc=new PCImpl();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    pc.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    pc.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();



        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class PCImpl{

    LinkedList linkedList=new LinkedList();
    int capacity=2;

    public void producer() throws InterruptedException {



        while(true){

            synchronized (this){

                while(linkedList.size()==capacity)
                   wait();

                 linkedList.add(1);
                System.out.println("Adding element......."+1);

                 notify();

                Thread.sleep(1000);
            }

        }

    }

    public void consumer() throws InterruptedException {

        while(true){

            synchronized (this){

                while(linkedList.size()==0)
                wait();

                linkedList.removeFirst();
                System.out.println("Removing element......."+1);

                notify();

                Thread.sleep(2000);
            }

        }

    }


}