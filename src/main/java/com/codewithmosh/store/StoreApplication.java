package com.codewithmosh.store;

import com.codewithmosh.store.tools.AdvCalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.Objects;

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

//class AParent {
//    public void show() {
//        System.out.println("In A show");
//    }
//}
//
//class Achild extends AParent {
//
//    public void show() {
//        System.out.println("In B show::");
//    }
//}
//
//class AChildTwo extends AParent {
//    public void show() {
//        System.out.println("In C show::");
//    }
//}

//class Laptop {
//    String model;
//    int price;
//
//    public String toString(){
//        return model + ": " + price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Laptop laptop = (Laptop) o;
//        return price == laptop.price && Objects.equals(model, laptop.model);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(model, price);
//    }
//}

//class A {
//    public void show1(){
//        System.out.println("Inside A show");
//    }
//}
//
//class B extends A {
//    public void show2(){
//        System.out.println("Inside B show");
//    }
//}

// Abstract class.
// abstract class Car {
//    public abstract void drive();
//    public abstract void fly();
//
//    public void playMusic(){
//        System.out.println("This is playing music");
//    }
// }
//
//class WagonR extends Car {
//    @Override
//    public void drive() {
//        System.out.println("We must drive");
//    }
//
//    @Override
//    public void fly() {
//        System.out.println("Start flying ...");
//    }
//}

//// InnerClass
//class A {
//    int age;
//    public void show(){
//        System.out.println("In show mtd");
//    }
//
//    class B {
//        public void config(){
//            System.out.println("inner class config mthd");
//        }
//    }
//
//    static class C {
//        public void config(){
//            System.out.println("inner static class config mthd");
//        }
//    }
//
//}

//abstract class A {
//    public abstract void show();
//
//}

interface A {
    // variables are final, static
    int age = 44;
    String area = "Mumbai";
    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X{

}

class B implements A, Y {

    @Override
    public void show() {
        System.out.println("In show.....");
    }

    @Override
    public void config() {
        System.out.println("In config...");
    }

    @Override
    public void run() {
        System.out.println("method from another interface implemented");
    }
}

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
//        AdvCalc calculation = new AdvCalc();
//        int resultAdd = calculation.add(4, 5);
//        System.out.println("addition result is " +  resultAdd);
//        AParent obj = new AParent();
//        obj.show();
//
//        obj = new Achild();
//        obj.show();
//
//        obj = new AChildTwo();
//        obj.show();

//        final int num = 8;
////        num = 9;
//        System.out.println("priting the final int num" + num);
//        Laptop obj1 = new Laptop();
//        obj1.model = "Lenovo";
//        obj1.price = 1010;
//
//        Laptop obj2 = new Laptop();
//        obj2.model = "Lenovo";
//        obj2.price = 1010;
//
//        Boolean result = obj1.equals(obj2);
//        System.out.println(result);
//        A obj = new A();
        //upcasting.
//        A obj = (A) new B();
//        obj.show1();

//        //downcasting
//        A obj = new B();
//        obj.show1();
//
//        //upcasting.
//        B obj1 = (B) obj;
//        obj1.show2();

//        Car obj = new WagonR();
//        obj.drive();
//        obj.playMusic();
//        obj.fly();

//        A obj = new A();
//        obj.show();

        //to access the class in A, we now use
//        A.B obj1 = obj.new B();
//        obj1.config();
//        obj1 is ruling currently - -Tinubu.

        //calling the static inner class.
//        A.C obj2 = new A.C();
//        obj2.config();

        //Anonymous class
//        A anonymousObj = new A(){
//            public void show(){
//                System.out.println("In anonymous new show mtd");
//            }
//        };
//        anonymousObj.show();

        //Instantiating abstract class using anonymous inner class
//        A anonymousObj = new A(){
//            public void show(){
//                System.out.println("In anonymous new show mtd");
//            }
//        };
//
//        anonymousObj.show();


        //JOptionPane to create textbox.
//        String name = JOptionPane.showInputDialog("What is your name?");
//
//        // create the message
//         String message = String.format("Welcome, %s, to Java Programming!", name);
//        // display the message to welcome the user by name
//         JOptionPane.showMessageDialog(null, message);
        A obj;
        B b = new B();
        b.show();
        b.config();
        b.run();
//        this below is how we intend to re-assign area but the compiler complains that you
//                cant re-assign final variable.
        // A.area = "This life";
        System.out.println(A.area + " : testing using interface variables - static");
    }
}
