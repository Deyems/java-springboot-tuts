package com.codewithmosh.store;

import com.codewithmosh.store.tools.AdvCalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

enum Status {
    Pending, Running, Failed, Success
}

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        Status s = Status.Pending;
        System.out.println(s + ": check the status printed in the enum");
        Status [] states = Status.values();
        for (Status state : states){
            System.out.println("Status " + state + ": and the rank is " + state.ordinal());
        }

    }
}
