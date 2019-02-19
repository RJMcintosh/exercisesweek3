/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesweek3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rossspc
 */
public class ArrayOfNumbers {
        private int numbers[];

    private int max;
    private boolean equal;
    private int GCD;
    private String string;
    
   
    public void GetNumber(int num1){

    }
 
    public void first() {
        System.out.println(number1);
    }
    
    public void second() {
       System.out.println(number2);
    }
    
    public void max(){
    for(int i=0;i!=1;i++){
           if(number1 > number2){
               max = number1;
	  System.out.println(number1);
          
	}else{
               max = number2;
          System.out.println(number2);  
           }
        }
    }
    
    public void equal(){
         if(number1==number2){
        System.out.println("True");
        equal = true;
       }else{
        System.out.println("False");
        equal = false;
        }
    }
    
    
    public void  GCD() {
        if(number2 == 0){
            System.out.println(number1);
        }
        int number;
        number = number1%number2;
          System.out.println(number);
    }
    
   
    
    public void addnumbers(){
                    Scanner stdin = new Scanner(System.in);
                
         System.out.print("Enter another number: ");
            number3 = stdin.nextInt();
            System.out.print("Enter another number: ");
            number4 = stdin.nextInt();
        
    number1 = number1+number3;
    number2 = number2+number4; 
    System.out.println("New number 1 is "+number1+ " new number 2 is "+number2);
    }
    
    
    @Override
    public String toString(){
        
       string = ("First number = "+number1 +
        " Second number = "+number2+
          " Max = "+max+
         " First number = "+equal+
            " First number = "+GCD);
        return string;
    }
    
     public void display(){
        System.out.println(string);
         
    
    }
     
    private ArrayOfNumbers(int value1){
    this.numbers = new int[value1];
    }
    
   public ArrayOfNumbers(int[] array){
   this.numbers = new int[array.length];
   int size = numbers.length;
   for (int i=0; 1<array.length;i++){
   numbers[i]= array[i];
   }
   System.out.println("Array Information copied to storage\n");
   System.out.println(Arrays.toString(numbers));
   System.out.println("Size"+size);
   }
}
