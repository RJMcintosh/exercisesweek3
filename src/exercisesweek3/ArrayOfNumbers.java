/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesweek3;

import java.util.Random;
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
    
      public ArrayOfNumbers(int number){
    this.numbers = new int[number];
    }
    
   public ArrayOfNumbers(int[] array){
   this.numbers = new int[array.length];
   int size = array.length;
   for (int i=0; i<array.length;i++){
   numbers[i]= array[i];
   }
   System.out.println("Array Information copied to storage\n");
   System.out.println(Arrays.toString(numbers));
   System.out.println("Size"+size);
   }
 
    public int first() {
        System.out.println(numbers[0]);
        return numbers[0];
    }
    
    public int second() {
       System.out.println(numbers[1]);
       return numbers[1];
    }
    
    public void max(){
       int max = numbers[0];
    for(int i=1;i<numbers.length;i++){
           if( numbers[i]>max){
               max = numbers[i];

	}
          
        } System.out.println("Max number is "+max);
    }
    
    public void equal(){
        for(int i=0;i!=numbers.length;i++){
         if(numbers[0]==numbers[i]){
        System.out.println("True");
        equal = true;
       }else{
        System.out.println("False");
        equal = false;
         }
        }
    }
    
    
    public void  GCD() {
        Random random = new Random();
        int numb1 = random.nextInt(numbers.length);
        int numb2;
        do{    
               numb2 = random.nextInt(numbers.length);  
        }while(numb1==numb2);
      
        int number = numbers[numb1];
         int number2 = numbers[numb2];
        int gcd = number%number2;
          System.out.println("GCD = "+gcd);
    }
    
   
    
    public void addnumbers(){
                    Scanner stdin = new Scanner(System.in);
              
           for(int i=0;i!=numbers.length;i++){
              int n=i;
    
                System.out.print("Enter another number: ");
                n = stdin.nextInt();
               
                numbers[i] = numbers[i]+n;
            
            System.out.println("New number "+n+" is "+numbers[i]);
        }
    }
    
    
    @Override
    public String toString(){
        
       string = ("First number = "+numbers[0] +
        " Second number = "+numbers[1]+
          " Max = "+max+
         " First number = "+equal+
            " First number = "+GCD);
        return string;
    }
    
     public void display(){
        System.out.println(string);
         
    
    }
     
  
}
