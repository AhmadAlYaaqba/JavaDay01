package com.company;

import java.util.*;

public class MyClass {

    public void printMsg (String msg) {
        System.out.println(msg);
    }

    public void guessMyNumber () {
        int counter = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to guessing Game\n please enter your guessing number between 0 and 10");
        Boolean win = false;
        Random rand = new Random();
        int random =  rand.nextInt(10);
        while (!win) {
            int userGuess=sc.nextInt();
            if ( userGuess == random) {
                System.out.println("Congratulation!! You win!!");
                win = true;
            } else {
                counter++;
                System.out.println("Wrong, Please try again :)");
            }
            if (counter == 3 ) {
                System.out.println("Game Over!!");
                win = true;
            }
        }
    }
}
