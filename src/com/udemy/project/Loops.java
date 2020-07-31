package com.udemy.project;

public class Loops {
    public static void main(String[] args)
    {
        String[] jakZycBezKawy =
        {
            "Kawa",
            "od rana, jak śmietana",
            "Dzień bez kawy",
            "Jest dniem straconym",
            "Nie mów do mnie",
            "Dopóki nie będę gotowa :)"
        };

        //int i = 0;
        /* while (i < jakZycBezKawy.length) {
            System.out.println(jakZycBezKawy[i]);
            i++;
        } */

        /* do {
            System.out.println(jakZycBezKawy[i]);
            i++;
        }
        while
        (i < jakZycBezKawy.length); */

        /* for (int i = 0; i < jakZycBezKawy.length; i++)
        {
            System.out.println(jakZycBezKawy[i]);
        } */

        //enhanced for loop
        /* for (String newKawka: jakZycBezKawy)
        {
            System.out.println(newKawka);
        } */

        //pętla w pętli
        /* for (int j = 1; j <=10; j++)
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
        } */

        //break and continue

        for (int i = 0; i <10; i++)
        {
            if (i == 3) // (i % 2 == 0) tylko nieparzyste
                continue; // break; spowoduje wyjscie z biezacej petli
            System.out.println(i);
        }

    }
}
