// Challenge
// Make a program that asks for a number corresponding to a certain year and then informs if this year is a leap year or not

// Input
// The input consists of an integer value referring to the requested year.

// Output
// The output should return whether the year will be a leap year or not, as shown in the example below.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano = ent.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println("Leap year");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println("Leap year");
        } else{
            System.out.println("Not leap year");
        }
    }
}