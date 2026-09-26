package com.codewithmosh.store;

import com.codewithmosh.store.tools.AdvCalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

enum Status {
    Pending, Running, Failed, Success
}

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        Status s = Status.Failed;
//        System.out.println(s + ": check the status printed in the enum");
//        Status [] states = Status.values();
//        for (Status state : states){
//            System.out.println("Status " + state + ": and the rank is " + state.ordinal());
//        }

        switch(s) {
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Done");
        }

    }
}
