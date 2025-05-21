public class prim {
    
    public static void main(String[] args) {
        int n =10;//anzahl der zahlen die gefunen werden sollen 
        int count=0; //zähler 
        int num =2; //die erste zahl die übeprüft wird da 1 nicht benutzt werden soll 
        while (count <n) {
            boolean isPrim = true;//num wird erstmal auf trrue gesetzt 
            //die zahl wird durch jede kleiner zahl geteilt 
            for(int i=2; i<num;i++){ //ist num eine primzahl ?
                if (num%i==0) {//wenn num bei der teilung keinen rest hat ist es keine primzahl und die schleife wird abgebrochen 
                    isPrim =false;
                    break;

                    
                }
            }
            if (isPrim) {// wenn num eine primzahl ist wird sie ausgegeben und der Zähler wir erhöht
                System.out.println(num);
                count++;
                
            }
            num++;

            
        }
        
    }
    
}
