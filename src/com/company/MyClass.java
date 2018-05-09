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

    public void acceptAndReverse (){
        int[] arrOfInts = new int [5];
        Scanner sc=new Scanner(System.in);

        for (int i = arrOfInts.length - 1; i >= 0; i--){
            System.out.println("please enter a number");
            int userInput=sc.nextInt();
            arrOfInts[i]=userInput;
        };
        System.out.println(Arrays.toString(arrOfInts));
    }

    public void acceptAndReversMe (){
        int[] arrOfInts = new int [10];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i < 5;i++){
            System.out.println("please enter a number");
            int userInput=sc.nextInt();
            arrOfInts[i]=userInput;
        }
        int counter = 0;
        for (int i =arrOfInts.length -1 ; i >= 5 ; i--) {
            arrOfInts[i]=arrOfInts[counter];
            counter++;
        }
        System.out.println(Arrays.toString(arrOfInts));
    }
    public void repeatString(String str, int count) {
            String str1="";
        while (count>0){
            str1+=str;
            count--;
        }
        System.out.println(str1);
    }

}

