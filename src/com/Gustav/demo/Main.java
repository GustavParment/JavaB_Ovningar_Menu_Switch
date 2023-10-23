package com.Gustav.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        boolean exit = false;

        do {

            System.out.print("Add letters or 'quit' to exit: ");
            String input = sc.nextLine();

            switch (input) {

                case "quit" -> exit = true;
                default -> stringList.add(input);

            }

        }while(!exit);
        String listToStr = String.join("", stringList);
        System.out.println(listToStr);






    }
}



