package com.udemy.project;

public class Start {
    public static void main(String[] args) {

        int a = 5, b = 2;
        double c = 12;

        if (a > b && b < c)

            System.out.println(a != b);
            System.out.println("true");

            /* switch (przełącznik) - pozwala przełączać pomiędzy różnymi stanami wartość, która została do niego przesłana. */
        
            switch (a)
            {
                case 5:
                    System.out.println("a jest równe 5");
                    break; /* wyjscie z przelacznika */
                case 100:
                    System.out.println("a jest równe 100");
                    break;
                default:
                    System.out.println("a nie jest równe ani 5 ani 100");
            }

        /* tablica - kontener do rpzechowania wielu zmiennych */

        int [] tab;

        tab = new int[5];

        tab[0] = 20;
        tab[1] = 3;
        tab[2] = 56;
        tab[3] = 12;
        tab[4] = 6;

        int[] tab2 = {4, 14, 21, 56, 78}; /* bardziej optymalnie */

        System.out.println(tab2[3]);

        /* Tworzenie tabeli wielowymiarowej */


        /* Tablice wielowymiarowe

        Kolumna:               1                      2                        3

                        ------------------------------------------------------------
                            tab[0][0] |         tab [0][1] |              tab[0][2] |
                        ------------------------------------------------------------
                        ------------------------------------------------------------
                            tab[1][0] |         tab [1][1] |              tab[1][2] |
                        ------------------------------------------------------------
                        ------------------------------------------------------------
                            tab[2][0] |         tab [2][1] |              tab[2][2] |
                        ------------------------------------------------------------
                        ------------------------------------------------------------
                            tab[3][0] |         tab [3][1] |              tab[3][2] |
                        ------------------------------------------------------------

         */

        int[][] tab3 = new int [4][3];
        tab3 [0][1] = 25;

        /* Odwołanie do wiersza 0, kolumny 1 to: */

        System.out.println(tab3[0][1]);

        int[][]tab4=
                {
                        {4, 15, 17},
                        {2, 154, 170},
                        {41, 125, 174}
                };

        /* Aby odwołać się np. do 1-szej kolumny  i 1-szego wiersza */
        System.out.println(tab4[0][0]);

    }
}
