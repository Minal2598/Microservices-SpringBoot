package com.java.lambda.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//Interface Supplier<T>
//Type Parameters:
//T - the type of results supplied by this supplier

/*@FunctionalInterface
public interface Supplier<T>
Represents a supplier of results.
There is no requirement that a new or distinct result be returned each time the supplier is invoked.

This is a functional interface whose functional method is get().*/

//  above part is myNotes purpose

// Traditional Way (OOP)
/*
class SupplierImpl implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now() ;
    }
}

public class SupplierDemo{
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = new SupplierImpl();
        System.out.println(supplier.get());
    }

}*/

public class SupplierDemo{
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }

}

