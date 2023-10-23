package com.Gustav.demo;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) { bennysAdventure(); }

    public static void bennysAdventure(){

        Scanner sc = new Scanner(System.in);
        Stone stone = new Stone();
        boolean exit;

        do exit = stone.stoneOptionMenu(sc, stone); while (!exit);

    }

}













