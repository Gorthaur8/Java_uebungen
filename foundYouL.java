package arrays;

import java.util.Scanner;

public class foundYouL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Einlesen der Anzahl der Werte
        System.out.print("Geben sie die anzahl der werte an:  ");
        int number = scan.nextInt();

        int[] ori = new int[number];

        // Einlesen der Werte
        System.out.println("Geben Sie " + number + " Zahlen ein:");
        for (int i = 0; i < number; i++) {
            System.out.print("Wert " + (i + 1) + ": ");
            ori[i] = scan.nextInt();
        }

        // Suche nach den Werten
        boolean found = false;

        while (!found) {

            System.out.print("Geben Sie den gesuchten Wert ein: ");
            int sNumber = scan.nextInt();

            // Durchsuche das Array nach der Zahl
            for (int i = 0; i < ori.length; i++) {
                if (ori[i] == sNumber) {
                    System.out.println("Zahl " + sNumber + " gefunden an Index Position: " + i + ".");
                    found = true; // Zahl gefunden, Schleife beenden
                    break; // Schleife zum Durchsuchen des Arrays abbrechen
                }
            }

            // Wenn die Zahl nicht gefunden wurde
            if (!found) {
                System.out.println("Der gesuchte Wert konnte nicht gefunden werden.");
                // ermöglicht eine neue suche
            }
        }

        scan.close();
    } 
}
