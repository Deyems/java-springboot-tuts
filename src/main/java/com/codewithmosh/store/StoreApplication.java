package com.codewithmosh.store;

import com.codewithmosh.store.tools.AdvCalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

enum Laptop {

    Mac(2000), lenovo(1800), hewlettPackard(1500), xps(1200);

    private int price;

    Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        //Enum Constructor.
        Laptop laptop = Laptop.Mac;
        System.out.println(laptop + " goes for N" + laptop.getPrice());

        //printing all enums below:
        for(Laptop eachLaptop : Laptop.values()){
            System.out.println("this brand of laptop called " + eachLaptop + " costs about " + eachLaptop.getPrice() + " what is the name too? " + eachLaptop
                    .name());
        }
    }
}
