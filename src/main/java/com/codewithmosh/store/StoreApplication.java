package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //Exceptions!
        int i = 45;
        int j = 3;
        int nums[] = new int[5];

        try {
            int output = i / j;
            System.out.println("array value at position One " + nums[1]);
            System.out.println("array value at position five " + nums[5]);
            System.out.println("The result of the division" + output);
        }catch (Exception e){
//            System.out.println();
            System.out.println("Execution could have stopped here due to this error \"" + e.getMessage() + "\"");
        }
        System.out.println("Execution continues.");

    }
}
