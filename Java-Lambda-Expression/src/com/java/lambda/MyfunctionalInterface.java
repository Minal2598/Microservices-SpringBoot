package com.java.lambda;

// Functional Interface

@FunctionalInterface
public interface MyfunctionalInterface {

    void print(String s);

   // void m();    // We can't add more than 1 abstract method bczOf @FunctionalInterface -> created functional Interface

    //  We can add any number of default and static method in Functional Interface but contain only one abstract method

    default void m1(){
        System.out.println(" default method 1");
    }

    static void m2(){
        System.out.println("Static method 2");
    }
}
