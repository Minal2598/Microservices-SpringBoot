package com.java.lambda.functional;

import java.util.function.Consumer;

//Interface Consumer<T>
//Type Parameters:
//T - the type of the input to the operation


/*@FunctionalInterface
public interface Consumer<T>
Represents an operation that accepts a single input argument and returns no result.
Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
This is a functional interface whose functional method is accept(Object).*/

// above part is myNotes purpose

// Traditional Way (OOP)

/*
// Consumer<T> -> T - the type of input
class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Minal");
    }
}
*/

// Functional Way (Lambda)...
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Minal");
    }
}
