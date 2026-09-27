package com.codewithmosh.store;

import com.codewithmosh.store.tools.AdvCalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }
}


class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show");
    }
}

//@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
       //Annotations.
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
