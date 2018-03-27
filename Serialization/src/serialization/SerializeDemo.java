/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author macstudent
 */
public class SerializeDemo {
    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "HP";
        e.address = "Toronto";
        e.SSN = 111111111;
        e.number = 101;
        
        try 
        {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(e);
            
            out.close();
            fileOut.close();
            
            System.out.println("Serialized data is saved as employee.txt");
        }catch(IOException i) {
            i.printStackTrace();
        }
    }
}
