package com.java.lambda.functional;

import java.util.function.Function;

//Interface Function<T,R>:
//Type Parameters:
//T - the type of the input to the function
//R - the type of the result of the function

/*@FunctionalInterface
public interface Function<T,R>
Represents a function that accepts one argument and produces a result.
This is a functional interface whose functional method is apply(Object).*/

// above part is myNotes purpose

// Traditional way

/*class FunctionImpl implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function = new FunctionImpl();
        System.out.println(function.apply("Minal"));
    }

}*/

// Functional Way (using Lambda)
public class FunctionDemo {
    public static void main(String[] args) {

        Function<String,Integer> function = (s) -> s.length();
        System.out.println(function.apply("Minal"));
    }


}
