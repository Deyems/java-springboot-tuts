package com.codewithmosh.store;

import com.codewithmosh.store.tools.AdvCalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//class Student {
//    int rollno;
//    String name;
//    int marks;
//}

//class Mobile {
//    String brand;
//    String network;
//    int price;
//    static String name;
//
//    static {
//        name = "Phone";
//        System.out.println("Inside the static block");
//    }
//
//    public Mobile(){
//        brand = "";
//        price = 200;
//        System.out.println("Inside the constructor");
//    }
//
//    void show(){
//        System.out.println(brand + " : " + price + " :" + name);
//    }
//
//    public static void show1(){
//        System.out.println("added static method in mobille");
////        System.out.println(brand + " " + price + "last & name" + name);
//    }
//}
//
//class Human {
//    private int age;
//    private String name = "Adesola";
//
//    // Normal constructor
//    public Human(){
//        age = 12;
//        name = "Default";
//        System.out.println("values in the human constructor!");
//    }
//
//    // Parameterized constructor
//    public Human(int a, String n){
//        age = a;
//        name = n;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age){
////        Human obj1 = new Human();
////        Human obj1 = obj;
//        this.age = age;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//}

//use of extends and super.
//inheritance
//class A {
//    public A(){
//        System.out.println("In Class A");
//    }
//    public A(int n){
//        System.out.println("In A constructor with parameter" + n);
//    }
//}

//class B extends A {
//    public B(){
//        System.out.println("In Class B");
//    }
//    public B(int n){
//        //this calls the default constructor of B class
//        this();
//        System.out.println("In B constructor with parameter");
//    }
//}
//
//class A {
//    public A(){
//        System.out.println("In A Constructor");
//    }
//    public void show(){
//        System.out.println("In A show method.");
//    }
//}


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
    // SpringApplication.run(StoreApplication.class, args);
    // int nums [][] = new int[3][4];
    // using class to load a class
    // Class.forName("com.codewithmosh.store.Mobile");
//        Human humanObj = new Human();
////        humanObj.setAge(23);
////        humanObj.setName("Mavin Beacon");
//        Human humanObj_2 = new Human(18, "Navin");
//        System.out.println(humanObj.getName() + " " + "Your age is: " + humanObj.getAge());
//        System.out.println("Normal Constructor vs Parameterized Constructor ");
//        System.out.println(humanObj_2.getName() + " " + "Your age is: " + humanObj_2.getAge());

        // Calling class with constructor parameterized.
        // B obj = new B(4);
        // Calling class without parameter in constructor.
//        A obj = new A();
//        obj.show();
        // anonymous object. -- objects are created in the heap memory.
//        new A().show();
//        new A().show();

//        Calc calculator = new Calc();
//        ScientificCalc advCalculator = new ScientificCalc();
//        int addup = advCalculator.add(4, 5);
//        int remove = advCalculator.sub(8, 3);
//
//        int multiply = advCalculator.multi(5, 3);
//        int divide = advCalculator.div(15, 4);
//        double power = advCalculator.power(15, 4);
//
//        System.out.println(addup + " add " + remove + " removal results");
//        System.out.println(multiply + " multiplication " + divide + " division results");
//        System.out.println(power + " power ");
        AdvCalc calculation = new AdvCalc();
        int resultAdd = calculation.add(4, 5);
        System.out.println("addition result is " +  resultAdd);
    }
}
