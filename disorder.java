package arrays;

public class disorder {
    public static void main(String[] args) {
        int[] myNumbers = { 9, 3, 2, 8, 6, 7, 5, 4, 1 };
        for (int i = 0; i < myNumbers.length - 1; i++) {
            for (int j = 0; j < myNumbers.length - 1 - i; j++) {// - i um die bereits sortierten elemente nicht nochmal zu checken 
                if (myNumbers[j] > myNumbers[j + 1]) {
                    int temp = myNumbers[j];// temp variable um werte an index position nicht zu verlieren wenn sie überschrieben werden 
                    myNumbers[j] = myNumbers[j + 1];
                    myNumbers[j + 1] = temp;

                }

            }

        }
        for (int number : myNumbers) { // foreach schleife um das sortierte array aus zu geben 
            System.out.println(number + " ");
            
        }
    }

}
/*
 * Unglaublich! Sie waren nur kurz weg und schon hat jemand sämtliche Zahlen in
 * ihrem Array vertauscht. Dabei ist das Ordnen der Zahlen immer so
 * zeitaufwendig. Sie beschließen ein Programm zu schreiben, was Ihnen diese
 * nervige Arbeit abnimmt. Das Programm soll hierbei das Array durchlaufen und
 * die jeweils nebeneinander liegenden Zahlen miteinander vergleichen. Sollte
 * die kleinere Zahl an der Stelle mit dem größeren Index stehen, so werden die
 * beiden Zahlen getauscht. Am Ende soll das Array aufsteigend sortiert sein.
 * Zum Überprüfen können sie das Array ausgeben.
 * 
 * Ihr durcheinander gebrachtes Array sieht wie folgt aus:
 * 
 * int[] myNumbers = { 9, 3, 2, 8, 6, 7, 5, 4, 1 };
 * 
 */
