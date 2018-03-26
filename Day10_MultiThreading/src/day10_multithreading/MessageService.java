/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10_multithreading;

/**
 *
 * @author macstudent
 */
public class MessageService {
    public static void main(String args[]){
        Carrier carrier = new Carrier();
        (new Thread(new Sender(carrier))).start();
        (new Thread(new Receiver(carrier))).start();
    }
}
