package arrays;
import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie die anzahl der Waren ein: ");
        int amount = scan.nextInt();// anzahl der Produkte
        double[] values = new double[amount];
        for (int i = 0; i < amount; i++){//schleife zur eingabe der jeweilligen Preise 
            System.out.println("Geben sie den Preis der Ware " + (i +1) + " ein: ");// i+1 um eine logische auflistung der Produkte zu ermöglichen 
            values[i] = scan.nextDouble();//befüllung des arrays 
        }
        double total = 0; //berechnug der summe foreach währe auch eine möglickeit gewesen 
        for (int i = 0; i < values.length; i++){
            total += values[i];
        }
        System.out.println("Die summe ihres einkaufs beträgt: " + total);
        
            
          
        
        



        

        
    }
    
}
