package com.java.lambda;

interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{
    // Traditional Way

    @Override
    public int addition(int a, int b) {
        return (a + b);
    }
}

// How to convert Traditional way into the functional programming using Lambda Exppression
public class LambdaParameters {

    public static void main(String[] args) {

//        Addable add = ( a, b) -> (a + b);
//       int result = add.addition(10,20);
//        System.out.println(result);

        Addable abc = (a,b) ->{
          int c = a + b;
          return c;
        };
        System.out.println(abc.addition(10,20));
    }


}

