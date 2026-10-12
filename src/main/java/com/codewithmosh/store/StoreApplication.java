package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age) return 1;
        return -1;
    }
}

//@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        //define the comparator for sorting students.
        Comparator<Student> sortFactor = new Comparator<Student>() {
            public int compare (Student s1, Student s2){
                if (s1.name.length() > s2.name.length()) return 1;
                return -1;
            }
        };

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(17, "tadebee"));
        students.add(new Student(27, "ade"));
        students.add(new Student(14, "sade vowe"));
        students.add(new Student(21, "bade folawiyo"));

        //students becomes sorted because the Student class implements Comparable and uses the compareTo method.
        Collections.sort(students);

        System.out.println(students + "raw form");

        for(Student s : students){
            System.out.println("Iterating through Student with name: " + s.name + " and age: " + s.age);
        }

    }
}
