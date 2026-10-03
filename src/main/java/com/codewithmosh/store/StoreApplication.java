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
        int num = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a Number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println("Number entered is " + num);
        }
    }
}
