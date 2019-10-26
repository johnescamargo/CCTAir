/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.Scanner;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class Menu {
    
    public Menu(Pilot[] Pilots) 
    {

        String choice = null;
        Scanner scan = new Scanner(System.in);
        SetUp setup = new SetUp();
        

        System.out.println("Welcome to Airline \nMENU");
        System.out.println("Select one option:");
        System.out.println("1: Show a particular flight");
        System.out.println("2: Show all the available aircraft");
        System.out.println("3: Show a particular aircraft");
        System.out.println("4: Show all Pilots");
        System.out.println("5: Show a particular Pilot");
        System.out.println("6: Create a flight");
        System.out.println("7: Quit");

        do {
            choice = scan.nextLine();
            switch (choice) 
            {
                case "1": 
                {
                    break;
                }
                case "2": 
                {
                    break;
                }
                case "3": 
                {
                    break;
                }
                case "4": 
                {        
                    setup.setPilots(Pilots);
                    break;
                }
                case "5": 
                {
                    break;
                }
                case "6": 
                {
                }
                case "7": 
                {
                    System.exit(0);
                }
                default: 
                {
                    System.out.println("You chose and invalid option. Please, try again.\n");
                    break;
                }

            } 
            // end of switch

        } while (!choice.equals("6")); 
        // end of do-while

    }

}
