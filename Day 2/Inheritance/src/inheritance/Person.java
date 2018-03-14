/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
final public class Person {
    String firstName;
    String lastName;
    int age;
    
    Person(){
        this.firstName = "Unknown";
         this.lastName = "Unknown";
         this.age = 1;
    }
    Person(String fNm, String lNm, int age) {
        this.firstName = fNm;
         this.lastName = lNm;
         this.age = age;
    }
    
    //Copy Constructor
    Person(Person object) {
        this.firstName = object.firstName;
        this.lastName = object.lastName;
        this.age = object.age;
    }
    
    void read() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Name : ");
        this.firstName = input.nextLine();
        
        System.out.println("Enter Last Name : ");
        this.lastName = input.nextLine();
        
        System.out.println("Enter Your Age : ");
        this.age = input.nextInt();
    }
    
    void display() {
        System.out.println("firstname:"+this.firstName);
        System.out.println("lastname:"+this.lastName);
        System.out.println("age:"+this.age);
    }
}
