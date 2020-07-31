package com.udemy.project;

public class LoopPractice {
    public static void main(String[] args)
    {
        /* int[] liczby = {1, 12, 41, 12, 51, 12};

        int suma = 0;

        for (int liczba : liczby)
        {
            suma += suma + liczba;
        }
        System.out.println(suma); */


        for (int j = 1; j <= 10; j++)
        {
            for (int i = 1; i <= 10; i++)
            {
                if (j % 2 == 0)
                    continue;
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
