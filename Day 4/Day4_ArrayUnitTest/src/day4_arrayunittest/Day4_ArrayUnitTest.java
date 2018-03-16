/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_arrayunittest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class Day4_ArrayUnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //////-----Books------////
        Books book1 = new Books(1, "The Sky",8);
        Books book2 = new Books(2, "Necklase",3);
        Books book3 = new Books(3, "Milk",2);
        Books book4 = new Books(4, "Journey",3);
        Books book5 = new Books(5, "Wonderer",4);
        
        ArrayList<Books> library = new ArrayList<Books>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        
        System.out.println("No of Books: " + library.size());
        
        
        for(Books bk: library) {
          //  bk.displayInfo();
        }
        
        library.add(2,new Books(10,"Pacific",9));
        
        Collections.sort(library, new bookTitleComparator());
        
        library.forEach( bk -> {
           // bk.displayInfo();
        });
        
        Collections.sort(library, new bookRatingComparator());
        library.forEach( bk -> {
            bk.displayInfo();
        });
        //////-----Books------////
        
        System.out.println("--------------------------------------------");
        
        //////-----Student------////
        Student student1 = new Student(1,"Harsh",80);
        Student student2 = new Student(2,"Patel",90);
        Student student3 = new Student(3,"Demo",70);
        
        ArrayList<Student> std = new ArrayList<Student>();
        std.add(student1);
        std.add(student2);
        std.add(student3);
        
        System.out.println("No of Students: " + std.size());
        Collections.sort(std, new studentNameComparator());
        std.forEach( bk -> {
            bk.displayInfo();
        });
        //////-----STUDENT------////
    }
    
}
