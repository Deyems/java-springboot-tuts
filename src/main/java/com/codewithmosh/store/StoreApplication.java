package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number: ");

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfNumber = new BufferedReader(reader);
        int num = Integer.parseInt(bfNumber.readLine());

        System.out.println("You entered: " + (num));
        bfNumber.close();
    }
}
