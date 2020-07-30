package com.udemy.project;

public class Loops {
    public static void main(String[] args) {
        String[] jakZycBezKawy =
        {
            "Kawa",
                    "od rana, jak śmietana",
                    "Dzień bez kawy",
                    "Jest dniem straconym",
                    "Nie mów do mnie",
                    "Dopóki nie będę gotowa :)"
        } ;
        int i = 0;
        /* while (i < jakZycBezKawy.length) {
            System.out.println(jakZycBezKawy[i]);
            i++;
        } */

        i = 0;
        do {
            System.out.println(jakZycBezKawy[i]);
            i++;
        }
        while
        (i < jakZycBezKawy.length);
    };
}
