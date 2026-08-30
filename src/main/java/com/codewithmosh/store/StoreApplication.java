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

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        Human obj1 = new Human();
        obj1.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) throws ClassNotFoundException {
//        SpringApplication.run(StoreApplication.class, args);
//        int nums [][] = new int[3][4];

//.
    // working with string.
//    String name = new String("Adeyemi");
//        String name = "Adeyemi";
//        System.out.println(name);
////        System.out.println(name.hashCode());
//        System.out.println("char at: " + name.charAt(2));
//        System.out.println(name.concat(" Adeola"));
        // String pool constants.
//        mutable strings
//        immutable strings - String buffer, String builder.

//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());


//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 1500;
//
//        Mobile obj2 = new Mobile();
//        obj2.brand = "Samsung";
//        obj2.price = 1700;
//
//        Mobile.name = "SmartPhone";
//
//        obj1.show();
//        obj2.show();

        //using class to load a class
//        Class.forName("com.codewithmosh.store.Mobile");
        Human humanObj = new Human();
        humanObj.setAge(23);
        humanObj.setName("Mavin Beacon");
        System.out.println(humanObj.getName() + " " + "Your age is: " + humanObj.getAge());

    }
}
