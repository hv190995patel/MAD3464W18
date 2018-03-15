/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_interface;

/**
 *
 * @author macstudent
 */
public class Day3_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Addition op1 = new Addition();
        op1.display();
        
        Counting cn1 = new Counting();
        cn1.display();
        
        A a1 = new A();
        a1.display();
        a1.calcMultiplication();
        
        B b1 = new B();
        b1.display();
        b1.calcDivision();
        b1.calcMultiplication();
        
        C c1 = new C();
        c1.display();
        c1.calcDivision();
        c1.calcMultiplication();
    }
    
}

interface Arithmetic {
    int n1 = 10;
    int n2 = 10;
    void display();
}

class Addition implements Arithmetic{
    
   // int n1 = 20;
    // int n2 = 30;
    @Override
    public void display() {
       System.out.println("Inside Addition Class");
    }
}

class Counting extends Addition {
    
}

interface multiplication extends Arithmetic {
    void calcMultiplication();
}

class A implements multiplication {
    @Override
   public void display() {
        System.out.println("n1 = " + n1 + " n2 = " + n2);
    }
    
    @Override
    public void calcMultiplication() {
        System.out.println("Multiplication : " + (n1 * n2));
    }
}

interface division extends Arithmetic {
    void calcDivision();
    
}

class B  extends Addition implements division, multiplication {
    @Override
    public void calcDivision(){
        System.out.println("Division : " + (n1 / n2));
    }
    
    @Override
    public void display() {
        System.out.println("Inside Class B");
        System.out.println("n1 = " + n1 + " n2 = " + n2);
    }
    
    @Override
    public void calcMultiplication() {
        System.out.println("Multiplication : " + (n1 * n2));
    }
}

class C extends B {
    int c1 = 20;
}