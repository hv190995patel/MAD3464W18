/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10_multithreading;

import java.util.Random;

/**
 *
 * @author macstudent
 */
public class Receiver implements Runnable {
     private Carrier carrier;
     
    Receiver(Carrier carrier){
        this.carrier = carrier;
    }
    
     @Override
    public void run() {
        Random random = new Random();
        String message = carrier.receiveMessage();
        
        while(!message.equals("Over n Out")){
            message = carrier.receiveMessage();
            System.out.println("Receing the message");
            
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
