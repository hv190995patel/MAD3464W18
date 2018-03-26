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
public class Sender implements Runnable{
    private Carrier carrier;
    
    Sender(Carrier carrier){
        this.carrier = carrier;
    }

    @Override
    public void run() {
        Random random = new Random();
        String messagesToSend []= {
            "Hello",
            "I hope You are fine",
            "Lets meet for a coffee",
            "See you at Tim at 3 o'clock",
            "Bye..!"
        };
        
        for (int i=0; i<messagesToSend.length ; i++){
            carrier.sendMessage(messagesToSend[i]);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        carrier.sendMessage("Over n Out");
    }
}