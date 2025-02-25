package com.java.lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String email = null;
        //String email = "minal@gmail.com";

        // of, empty, ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> emailOptional = Optional.of(email); // Use if you are sure for value otherwise it will give nullPointerException
//        System.out.println(emailOptional);

        Optional<String> stringOptional = Optional.ofNullable(email);
       // System.out.println(stringOptional.get());

        // in real life project we can't call get() method directly
        // we need to first check whether Optional class contain value or not
        //for that we use isPresent() method

//        if(stringOptional.isPresent()){
//            System.out.println(stringOptional.get());
//        }else {
//            System.out.println("No value Present");
//        }

        // How to get default value from Optional
        Optional<String> stringOptional1 = Optional.ofNullable(email);
         String defaultOptional = stringOptional1.orElse("dafault@gmail.com");
        System.out.println(defaultOptional);

        String defaultOptional2 = stringOptional1.orElseGet(() -> "default@gmail.com");
        System.out.println(defaultOptional2);

//        String optionalObject =  stringOptional1.orElseThrow(() -> new IllegalArgumentException("Email is not Exist"));
//        System.out.println(optionalObject);

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptional1 = Optional.empty();

        gender.ifPresent((s) -> System.out.println("value is present"));
        emptyOptional1.ifPresent((s) -> System.out.println("no value present")); // bcz value in object is empty

        // without using Optional
        String result = " abc ";
        if(result != null && result.contains("abc")){
            System.out.println(result);
        }

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter((res) -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res));


        // map mrthod in optional provides a way to transform value in Optional from one type to another

    }
}
