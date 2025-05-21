package arrays;

import java.util.Random;

public class fillArray2 {
    public static void main(String[] args) {
        Random random = new Random();
        // Array nummer 1 wird nur mit geraden zahlen befüllt
        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 2 * random.nextInt(51);// erstellung einer geraden zahl

        }
        // Array nummer 2 wird nur mit zufälligen ganzen zahlen befüllt (aufsteigent
        // sortiert)
        int[] array2 = new int[20];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(101);// zufallszahl zwischen 0 und 100

        }
        // aufsteigend 
        for (int i = 1; i < array2.length; i++) {
            int test = array2[i];
            int j = i - 1;
            while (j >= 0 && array2[j] > test) {
                array2[j + 1] = array2[j];
                j = j - 1;
            }
            array2[j + 1] = test;
        }
        int[] array3 = new int[20];
        for(int i = 0; i < array3.length; i++){
            array3[i] = random.nextInt(101);// wieder zufallszahlen zwischen 0 und 100 aber absteigend 


        }
        for (int i = 0; i < array3.length - 1; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] < array3[j]) {
                    int temp = array3[j];
                    array3[i] = array3[j];
                    array3[j] = temp;

                }

            }

        }
        // die ausgabe der Arrays
        System.out.println(" Array 1 (gerade Zahlen): ");
        for (int pos : array1) {//foreach als test 
            System.out.println(pos + " ");// ausgabe der werte und ein space als platzhalter

        }
        System.out.println(); // abstand 
        System.out.println("\nArray2 (aufsteigend sortiert): ");
        for (int pos : array2) {
            System.out.println(pos + " ");

        }
        System.out.println();
        System.out.println("\nArray3 (absteigend sortiert):");
        for (int pos : array3) {
            System.out.println(pos + " ");

        }
        System.out.println();

    }

}
