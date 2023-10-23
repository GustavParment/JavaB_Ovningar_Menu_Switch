package com.Gustav.demo;

import java.util.Scanner;

class Stone extends MagicalStones {

    protected boolean stoneOptionMenu(Scanner sc, MagicalStones stone){


        message("\nBenny choose a magical stone (red, blue green or yellow), or type 'exit' to quit ");
        String choseStone = sc.nextLine();


        switch (choseStone) {

            case "red stone"    -> castSpell(getRedStone(),getBlueStone(),sc);

            case "yellow stone" -> castSpell(getYellowStone(),getRedStone(),sc);

            case "blue stone"   -> castSpell(getBlueStone(),getGreenStone(),sc);

            case "green stone"  -> castSpell(getGreenStone(),getYellowStone(),sc);

            default -> stone.errorMessage();

            case "exit" -> {message("Fridas heart is lost forever..."); return true;}

        }

        return false;
    }

    protected void castSpell(String chosenStone, String transformedStone, Scanner sc ){
        message("You chose the " + chosenStone);
        message("\nPress enter to cast a spell and impress Frida ");

        if (sc.nextLine().isEmpty()){

            message(chosenStone + " turned in to a " + transformedStone);

            message("\nFrida was very impressed by Benny's magic");
        }

    }

    protected void message(String message){

        System.out.println(message);
    }
}
