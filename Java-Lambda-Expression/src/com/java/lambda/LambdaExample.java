package com.java.lambda;

interface Shape{
    void draw();
}

// Traditinal Way (OOP)

/*
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method ");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class: draw() method ");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class: draw() method ");
    }
}*/

// Converted above OOP to into functional programming using Lambda expression
public class LambdaExample {

    // Traditional Way

   /*
   public static void main(String[] args) {
        Shape rectangleShape = new Rectangle();
        rectangleShape.draw();

        Shape squareShape = new Square();
        squareShape.draw();

        Shape circleShape = new Circle();
        circleShape.draw();

    }*/

    //Lambda expression to implements functional interface
    // functional way (Using lambda expression)

    public static void main(String[] args) {

    // refference variable ->  functional interface shape

      /*Shape rectangle =  () -> System.out.println("Rectangle class : draw() method ");
      //rectangle.draw();

      Shape square = () -> System.out.println("Square class: draw() method ");
       // square.draw();

      Shape circle = () -> System.out.println("Circle class: draw() method ");
     // circle.draw();*/

//      print(rectangle);
//      print(square);
//      print(circle);

        // OR

        print(() -> System.out.println("Rectangle class : draw() method "));
        print(() -> System.out.println("Square class: draw() method "));
        print(() -> System.out.println("Circle class: draw() method "));
    }

    // How to pass labda expression as a method parameter

    private static void  print(Shape shape){
        shape.draw();
    }


}
