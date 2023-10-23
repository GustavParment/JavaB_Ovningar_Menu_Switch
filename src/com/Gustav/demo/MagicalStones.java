package com.Gustav.demo;


class MagicalStones {

    private final String redStone    = "\u001B[31m" + "Red Stone"    + "\u001B[0m";
    private final String blueStone   = "\u001B[34m" + "Blue stone"   + "\u001B[0m";
    private final String greenStone  = "\u001B[32m" + "Green stone"  + "\u001B[0m";
    private final String yellowStone = "\u001B[33m" + "Yellow stone" + "\u001B[0m";


    void errorMessage(){
        System.out.println(" Wrong input! please type 'red stone, yellow stone, blue stone  or green stone");
    }

    protected String getRedStone() {
        return redStone;
    }

    protected String getBlueStone() {
        return blueStone;
    }

    protected String getGreenStone() {
        return greenStone;
    }

    protected String getYellowStone() {
        return yellowStone;
    }




}
