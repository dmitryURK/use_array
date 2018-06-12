package com.dimaUKR;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] intArrVar;
        intArrVar = new int[10];            // виділити па'мять для 10 єлементів масива

        short[] shrtArrVar = new short[10];
        shrtArrVar[0] = 126;                // ініціалізація окремого єлементу масіва

        int[] intArrVar1 = new int[] {10,20,30,40,50}; // виділиння па'мяті  та ініціалізація масиву типу int з 5 єлементів
        float[] fltArrVar1 = new float[] {10.10f,20.20f,30.30f,40.40f,50.50f}; // виділиння па'мяті  та ініціалізація масиву типу int з 5 єлементів

        System.out.println("intArrVar1[0] = "+intArrVar1[0]);
        System.out.println("fltArrVar1[0] = "+fltArrVar1[0]);

        int[] intArrUserdata;
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Введи кількість єлементів масиву:");
        n = in.nextInt();
        intArrUserdata = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("enter Array[" + i + "] = ");
            intArrUserdata[i] = in.nextInt();
        }

        int arrayLenght = intArrUserdata.length;

        for (int i=0; i < arrayLenght;i++){
            System.out.println("Arr data ["+i+"]="+intArrUserdata[i]);
        }
    }
}
