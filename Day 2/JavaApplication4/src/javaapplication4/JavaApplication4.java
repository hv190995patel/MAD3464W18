/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank myBank = new Bank();
        System.out.println("Bank Id Is :" + myBank.bankID);
        System.out.println("Bank Name Is :" + myBank.bankName);
        
        Bank yourBank = new Bank();
        
        myBank.bankID = 123;
        myBank.bankName = "RBC";
        System.out.println("Bank Id Is :" + myBank.bankID);
        System.out.println("Bank Name Is :" + myBank.bankName);
        
        yourBank.setBankName("ICICI");
        yourBank.getBankName();
        
        Scanner myInput = new Scanner(System.in);
        String name;
        
        System.out.println("Enter Bank Name : ");
        name = myInput.nextLine();
        
        yourBank.setBankName(name);
        yourBank.getBankName();
        
        
        //Object For Arithmetic Class
        Arithmetic operation1 = new Arithmetic();
        //operation1.addition(10, 20);
        System.out.println("Output of Integer Addition : " + operation1.addition(10, 20));
        
        System.out.println("Output of Integer Addition : " + operation1.addition(10.23f, 20.23f));
        
        System.out.println("Output of three Integer Addition : " + operation1.addition(10, 20, 30));
        
        System.out.println("Output of Multiplication : " + operation1.multiplication(10, 30));
        
        Arithmetic.multiplication(10,20);
        
        Arithmetic.n1 = 20;
        //Arithmetic.n2 = 20;
        System.out.println(Arithmetic.n1 + " " + Arithmetic.n2);
    }
    
}
