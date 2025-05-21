package wiederholung;

public class pot {
    public static void main(String[] args) {
        int base = 2;
        
        int[] result = new int[20];
        for(int i = 1; i < 20; i++){
            base = base*2;
            
            result[i]= base;
            System.out.println(result[i]);
            

        }
    }
    
}