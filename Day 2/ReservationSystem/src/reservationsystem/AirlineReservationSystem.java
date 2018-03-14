/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservationsystem;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class AirlineReservationSystem {
    
    boolean[] seating = new boolean[11];
    Scanner input = new Scanner(System.in);
    
    
    public void start()
    {       
        while ( true )
        {
            makeReservation();
        }   
    }
    
    public void makeReservation()
    {
        System.out.println("Please type 1 for Smoking or 2 for NonSmoking: ");
        int section = input.nextInt();
        if ( section == 1 )
        {
            Smoking();
        }
        else if(section == 2)
        {
            NonSmoking();
        }
        else
        {
            System.out.println("Invalid Reservatiopn");
        }
    }
    
    
    public void NonSmoking() // assign an non smoking seat
    {
        for ( int count = 6; count <= 10; count++ )
        {
            if ( seating[count] == false ) // if false, then a seat is available for assignment
            {
                seating[count] = true; // assign seat
                System.out.printf("Economy. Seat# %d\n", count);
                break;
            }
            else if ( seating[10] == true ) // If seating[10] is true then economy is fully booked
            {
                if ( seating[5] == true) // If seating[5] is true then first class is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
                }
                else // ask if passenger would like a first class ticket instead
                {
                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        Smoking();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }
    
    
    
    
    public void Smoking() // assign a smoking seat
    {
        for ( int count = 1; count <= 5; count++ )
        {
            if ( seating[count] == false )  // if false, then a seat is available for assignment
            {
                seating[count] = true;  // assign seat
                System.out.printf("Smoking Seats. Seat# %d\n", count);
                break;
            }
            else if ( seating[5] == true ) 
            {
                if ( seating[10] == true) 
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else
                {
                    System.out.println("Smoking is fully booked. Would you like Non Smoking? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        NonSmoking();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }
                }
            }
        }
    }
    
}
