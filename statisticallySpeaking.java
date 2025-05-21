package Methods;

import java.util.Scanner;
public class statisticallySpeaking {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie die gewünschte menge an zahlen ein: ");
        int size = scan.nextInt();
        double[] numbers = new double[size];
        System.out.println("geben sie die einzelnen zahlen ein; ");
        for(int i =0; i< numbers.length; i++){
            numbers[i] = scan.nextDouble();

        }
        System.out.println("der maximalwert beträgt: " + maximum(numbers) );
        System.out.println("der mittelwert beträgt: " + mean(numbers));
        System.out.println("der minimalwert beträgt: "+ minimum(numbers));
        
    }
    public static double minimum(double[] numbers) {//methode um den minimal wert zu ermitteln 
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) {
                min = num;
                
            }
            
        }
        
        
       

        
       
        return min;


    } 
    public static double maximum(double[] numbers) { 
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
                
            }
            
        }
        return max;

    } 
    public static double mean(double[] numbers) { 
        int sum = 0;
        for (double num : numbers) {
            sum += num;
            
        }
        double mid = sum / numbers.length;
        return mid;

    } 
    
}







      
 
 
 
 
 
 
 
 

