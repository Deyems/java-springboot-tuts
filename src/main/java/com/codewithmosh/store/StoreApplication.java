package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;


//@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        List<Integer> students = Arrays.asList(4,5,7,3,8);

        int result = students.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .reduce(0, (c, e) -> c+e);

        System.out.println(result + " sum of even numbers in the array");
    }
}
