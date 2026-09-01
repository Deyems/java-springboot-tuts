package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//class Student {
//    int rollno;
//    String name;
//    int marks;
//}

class Mobile {
    String brand;
    String network;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("Inside the static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Inside the constructor");
    }

    void show(){
        System.out.println(brand + " : " + price + " :" + name);
    }

    public static void show1(){
        System.out.println("added static method in mobille");
//        System.out.println(brand + " " + price + "last & name" + name);
    }
}

class Human {
    private int age;
    private String name = "Adesola";

    public Human(){
        age = 12;
        name = "Default";
        System.out.println("values in the human constructor!");
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
//        Human obj1 = new Human();
//        Human obj1 = obj;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) throws ClassNotFoundException {
    // SpringApplication.run(StoreApplication.class, args);
    // int nums [][] = new int[3][4];
    // using class to load a class
    // Class.forName("com.codewithmosh.store.Mobile");
        Human humanObj = new Human();
        humanObj.setAge(23);
        humanObj.setName("Mavin Beacon");
        System.out.println(humanObj.getName() + " " + "Your age is: " + humanObj.getAge());

    }
}
