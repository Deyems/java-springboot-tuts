package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;


class A {
    public void show() {

            Class.forName("StoreApplication");
//        try {
//        }catch(ClassNotFoundException e){
//            System.out.println("Not able to find the class Error occurred" + e);
//        }
    }
}

@SpringBootApplication
public class StoreApplication {

    static {
        System.out.println("Class Loaded!");
    }

    public static void main(String[] args) throws ClassNotFoundException{
        A obj = new A();
        System.out.println("Inside Store Application Class.");
        obj.show();
    }
}
