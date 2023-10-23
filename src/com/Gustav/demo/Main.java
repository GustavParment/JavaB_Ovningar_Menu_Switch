package com.Gustav.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int weekday;

        findWeekday();



    }

    public static void findWeekday(){

        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        do {

            System.out.println("Username? , type '8' to exit : ");

            switch (sc.nextInt()) {
                case 1 -> System.out.println("I'ts Monday");
                case 2 -> System.out.println("It's Tuesday");
                case 3 -> System.out.println("It's Wednesday ");
                case 4 -> System.out.println("It's Thursday");
                case 5 -> System.out.println("It's Friday");
                case 6 -> System.out.println("It's Saturday ");
                case 7 -> System.out.println("It's Söndag");
                default -> System.out.println("That's not an correct input");
                case 9 -> {
                    exit = false;
                    sayGoodbye("Arnold");
                }

            }
        }while (exit);

    }
    public static void sayGoodbye(String username){

        System.out.println("Goodbye " + username);


    }
}
