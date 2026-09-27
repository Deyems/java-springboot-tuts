package com.codewithmosh.store;

import com.codewithmosh.store.tools.AdvCalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

interface A {
    void show();
}


//class B implements A {
//    public void show(){
//        System.out.println("In B show");
//    }
//}

//@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
       //Annotations.
        A obj = new A(){
            @Override
            public void show() {
                System.out.println("implementing interface directly....");
            }
        };

        obj.show();

        A obj_2 = () -> {
            System.out.println("implementing interface using lambda....");
        };
    }
}
