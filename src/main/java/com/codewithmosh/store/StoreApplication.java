package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;


class A extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++) {
            System.out.println("Show in A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++) {
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
        A objA = new A();
        B objB = new B();
        //To get the priority of the thread.
        System.out.println(objA.getPriority() + "priority of Thread A");

        //you can alter the priority of a thread by using its setPriority method
        objA.setPriority(Thread.MAX_PRIORITY);
        objA.start();
        objB.start();
    }
}
