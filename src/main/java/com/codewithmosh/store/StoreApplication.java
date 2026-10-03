package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

class A{
    public void show(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Show in A");
        }
    }
}

class B{
    public void show(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Show in B");
        }
    }
}

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        int num = 0;
        A objA = new A();
        B objB = new B();
        objA.show();
        objB.show();
    }
}
