package com.codewithmosh.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class NavinException extends Exception{
    public NavinException(String message){
        super(message);
    }
}

//@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //Exceptions!
        int i = 45;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {
//            if(j == 0) throw new ArithmeticException("You can't perform that operation");
            if(j == 0) throw new NavinException("You can't perform that operation");
            int output = i / j;


            System.out.println("The length of the string is given as "+ str.length());
            System.out.println("array value at position One " + nums[1]);
            System.out.println("array value at position five " + nums[5]);
            System.out.println("The result of the division" + output);
        }catch (NavinException e){
            System.out.println("custom exception caught. \"" + e + "\"");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception caught. \"" + e.getMessage() + "\"");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Catch Index Out of bound exception \"" + e.getMessage() + "\"");
        }
        catch (Exception e){
            System.out.println("Catch other exceptions not handled error \"" + e + "\"");
        }
        System.out.println("Execution continues.");

    }
}
