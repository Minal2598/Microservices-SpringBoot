package com.java.lambda.methodref;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

// type 2.

interface Printable{
    void print(String msg);
}

public class MethodReferencesDemo {
    // type 2:
    // Note: Parameter and return type of display method should have same with parameter and return type of interface method i.e. print()
    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    //eg.2) type 1.
    public static int addition(int a, int b){
        return (a + b);
    }


    public static void main(String[] args) {

        // Type 1. Method Refrence to a static method
        // eg.1) type 1.
        // lambda expression
        Function<Integer,Double> functionLambda = (input) -> Math.sqrt(input); // <- static method Math.sqrt()
        System.out.println(functionLambda.apply(4));

        // Using method reference
        Function<Integer,Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

        // eg. 2) type 1.
        /*Interface BiFunction<T,U,R>
                Type Parameters:
        T - the type of the first argument to the function
        U - the type of the second argument to the function
        R - the type of the result of the function*/

        // type 1 . lambda expression
        BiFunction<Integer,Integer,Integer> biFunctionLambda = (a,b) -> MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(10,20));

        //  type 1. using method reference
        BiFunction<Integer,Integer,Integer> biFunctionMethodRef = MethodReferencesDemo::addition;
        System.out.println(biFunctionMethodRef.apply(10,20));

        // Type 2. method reference to an instance method of an Object

        // type 2.create object of main class
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

        // type 2. lambda expression

        Printable printableLambda = (msg) -> methodReferencesDemo.display(msg);
        printableLambda.print("hello world!!!");

        // type 2: Using method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("hello World!!!");

        // Type 3: Reference to an instance method of an arbitrary object of specific type
                // Sometimes , we call a method of argument in the lambda expression
                // In that case we can use a method reference to call an instance method
                // of arbitrary object of specific type

        // type 3. e.g.1) lambda expression
        Function<String,String> stringFunction = (input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Java Guides"));

        // type 3: e.g.1) Using method reference
        Function<String,String> stringFunctionMethodRef = String::toLowerCase;
        System.out.println(stringFunctionMethodRef.apply("Java Guides"));

        // type 3. e.g. 2)
        String[] myArray = {"A","E","I","O","u","a","e","i","o","u"};

        // type 3. e.g. 2) lambda expression

        Arrays.sort(myArray, (s1,s2)-> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(myArray));

        // type 3: e.g.1) Using method reference
        Arrays.sort(myArray,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(myArray));

       //  Type 4 : reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("watermelon");
        fruits.add("mango");
        System.out.println("List of fruits: " + fruits);

        // Lambda expression
        Function<List<String>, Set<String>> setFunctionLambda = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunctionLambda.apply(fruits));

        // Using  Method Reference
        Function<List<String>,Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));

    }
}
