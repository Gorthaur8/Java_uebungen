package arrays;

public class goodWeather {
    public static void main(String[] args) {
        int[] temp = {12,14,10,7,11,13,12,15,15,18,16,13,10,12};
        System.out.println("Tag\tTemperatur");
        for(int day =0; day< temp.length; day++){
            System.out.println(day + "\t" + temp[day]);
            


        }
        int maxDiff =0;
        int day1 =0;
        int day2 =0;
        for(int i=0; i< temp.length -1; i++){
            int diff= temp[i] - temp[i +1];//direkter vergleich zwischen 2 tagen
            if (diff < 0) {//falls der untrschied negativ ist wird er damit umgekehrt 
                diff = -diff;
                
            }
            if (diff > maxDiff) {
                maxDiff = diff;
                day1 = i;
                day2 = i + 1;
                
            }


        }
        System.out.println("\n Die beiden Tage mit den größten Unterschieden sind: ");
        System.out.println("Tag " + day1 + " (Temperatur: " + temp[day1] + "°C) und Tag " + day2 + " (Temperatur: " + temp[day2] + "°C)" );
        System.out.println("unterschied zusammengefasst: " + maxDiff+ "°C");
        
    }
    
}/* nächste Spalte - TAB - \t */
/* Sie haben eine Wetterstation, die Ihnen die Temperatur der letzten 14 Tage zurückliefert. Diese Werte wollen Sie nun mit Hilfe eines Programms näher untersuchen. In der untenstehenden Tabelle finden Sie die aufgezeichneten Temperaturen.  

Tag 
	

0 
	

1 
	

2 
	

3 
	

4 
	

5 
	

6 
	

7 
	

8 
	

9 
	

10 
	

11 
	

12 
	

13 

Temperatur 
	

12 
	

14 
	

10 
	

7 
	

11 
	

13 
	

12 
	

15 
	

15 
	

18 
	

16 
	

13 
	

10 
	

12 

 

    Speichern Sie die Temperaturen mit einem geeigneten Datentyp ab. 

    Schreiben Sie nun ein Programm, welches die Tage und Temperaturen in einer Tabelle ausgibt. 

    Erweitern Sie ihr Programm so, die beiden aufeinanderfolgenden Tage ausgegeben werden, welche den größten Temperaturunterschied haben. 

 

 
 */