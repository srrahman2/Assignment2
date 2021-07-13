
package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String YN;
        do{
            int count = 0;
            int guess = 0;

            //Scanner getInput = new Scanner(System.in);
            //String guess = getInput.nextLine();
            //int x = Math.floor(Math.random() * (max - min) + min);
            System.out.println();

            System.out.println("Hello! What is your name?");
            String name = input.nextLine();
            System.out.println();
            System.out.println("Well, " + name + " I am thinking of a number between 1 and 20.");
            //System.out.println("Take a guess.");

            int num = (int) Math.floor(Math.random() * (20 - 1) + 1);
            boolean win = false;

            while (!win){
                count++;
                //Scanner getInput = new Scanner(System.in);
                System.out.println("Take a guess.");
                guess = Integer.parseInt(input.nextLine());
                //System.out.println(guess);
                //System.out.println(num);
                if (guess < num) {
                    System.out.println("Your guess is too low.");
                    //System.out.println("Take a guess.");
                    win = false;
                }
                else if (guess > num) {
                    System.out.println("Your guess is too high.");
                    //System.out.println("Take a guess.");
                    win = false;
                }
                else {
                    win = true;
                }
            }
            System.out.println();
            System.out.println("Good job " + name + ". You win the game with " + count + " tries");
            System.out.println("Would you like to play again? (y or n)");
            //Scanner getYN = new Scanner(System.in);
            YN = input.nextLine().toLowerCase();

        }while(YN.equals("y"));
    }
}

