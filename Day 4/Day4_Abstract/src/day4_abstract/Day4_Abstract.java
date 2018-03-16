/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_abstract;

/**
 *
 * @author macstudent
 */
public class Day4_Abstract {

    public static void main(String[] args) {
       // MyShape obj1 = new MyShape();
       Circle c1 = new Circle();
       c1.draw();
       c1.display("Its A Circle");
    }
}
abstract class MyShape {
        int x;
        int y;
        abstract void draw();
        
        void display(String msg) {
            System.out.println(msg);
        }
}

class Circle extends MyShape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
        super.x = 20;
        super.y = 30;
        System.out.println("x = " + super.x + "y = " + super.y);
    }
}

abstract class Rectangle extends MyShape {
    int h;
    abstract void draw();
}