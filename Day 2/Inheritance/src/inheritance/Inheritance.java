/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author macstudent
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person one = new Person();
        one.read();
        
        Person sreejith = new Person("HP","Patel",10);
        sreejith.display();
        
        Person sreejith2 = new Person(sreejith);
        sreejith2.display();
        
      //  Employee e1 = new Employee(1450.05);
     //   e1.display();
        
        Employee E2 = new Employee();
        E2.display();
        
        E2.firstName = "HP";
        E2.lastName = "PA";
        E2.age = 22;
        E2.salary = 1000;
        E2.display();
       // System.out.println("Last Name : " + E2.lastName);
       
       //Method Overriding
       Employee E3 = new Employee();
       E3.read();
       E3.display();
    }
    
}
