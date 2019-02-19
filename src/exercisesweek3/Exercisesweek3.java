/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesweek3;

import java.util.Scanner;

/**
 *
 * @author Rossspc
 */
public class Exercisesweek3 {

     public static void main(String[] args) {
        int choice;
                Scanner stdin = new Scanner(System.in);
                
                int numbers[] = {34,67,2,4,89,1,3,78};
          
                

        ArrayOfNumbers n1 = new ArrayOfNumbers(numbers);




        System.out.println("Welcome to the Tally Counter application");
        System.out.println("1 = Get Number, 2 = First Number, 3 = Find the biggest Number, 4 = Are they equal? 0 = Exit");
        do {
            System.out.print("Next action: ");
            choice = stdin.nextInt();
            if (choice == 1) {
                n1.first();
            } else if (choice == 2) {
                n1.second();
            } else if (choice == 3) {
                n1.max();
            } else if (choice == 4) {
                n1.equal();
             } else if (choice == 5) {
                n1.GCD();
                n1.addnumbers();
                } else if (choice == 6) {
                n1.toString();
                }
             else if (choice != 0) {
                System.out.println("Error: Valid choices are 0, 1 or 2");
            }
        } while (choice != 0);
        System.out.println("Goodbye");
    }

}
