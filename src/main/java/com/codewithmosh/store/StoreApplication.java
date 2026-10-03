package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;


class A implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println("Show in A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println("Show in B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        int num = 0;
        Runnable objA = new A();
        Runnable objB = new B();
        // To get the priority of the thread.
        // System.out.println(objA.getPriority() + "priority of Thread A");

        //you can alter the priority of a thread by using its setPriority method
//        objA.setPriority(Thread.MAX_PRIORITY);

        // When the classes are Runnable, we have to create Thread objects that we then pass the
        // runnable instances.
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();
    }
}
