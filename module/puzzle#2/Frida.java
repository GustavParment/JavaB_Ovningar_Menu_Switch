import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Frida {

    List<String> fridasMode = new ArrayList<>(mode());


     default String loveMeter(List<String> fridasMode, int currentBalance) {

        if (currentBalance >= 19_000) return fridasMode.get(0);

        else if (currentBalance >= 10_000) return fridasMode.get(2);

        else if (currentBalance <= 2000) return fridasMode.get(3);

        else return fridasMode.get(1);
    }


  static List<String> mode() {

        return Arrays.asList("Frida is happy and likes Benny a little",/*0*/
                "Frida is Satisfied and thinks Benny is cute",/*1*/
                "Frida is impressed by Benny's economi",/*2*/
                "Frida is head over heels for Benny");/*3*/
    }


}
