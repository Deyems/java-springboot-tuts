package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number: ");

        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        System.out.println("You entered: " + (num));
        reader.close();
    }
}
