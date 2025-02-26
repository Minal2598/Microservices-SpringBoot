package com.java.lambda.defaultstatic;

interface Vehicle {
    
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "turning vehicle alarm On!!";
    }

    default String turnAlarmOff() {
        return "turning vehicle alarm off!!";
    }

    static String getCompany() {
        return "BMW";
    }
}

class Car implements Vehicle{
    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "the Car is speeding up";
    }

    @Override
    public String slowDown() {
        return "the car is slowing down";
    }
}

public class DefaultStaticDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());

        // automatically available in implemented class(Car)
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());

        //Static method call
        System.out.println(Vehicle.getCompany());
    }

  //  Note: static method in interface , called using InterfaceName.static method in interface
}
