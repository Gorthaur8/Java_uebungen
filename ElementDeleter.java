package arrays;

public class ElementDeleter {
    public  int[] delElement(int[] a, int w) { // diese methode löscht den gesuchten weert W aus dem array A
        int removeValue = -1; // der index des zu entfernenden wertes wird erstmal auf -1 gesetzt ( nicht gefunden )
        for(int i =0; i < a.length; i++){ // eine schleife um den gesuchten wert w in array a zu finden 
            if (a[i]==w) {
                removeValue = i; // den gesuchten wert auf seinem index in eine zwischen variable speichern 
                break;  // sobald der wert gefunden wurde wird die schleife beendet 
                
            }

        } // wenn der wert nicht gefunen wurde bleibt die variable auf -1 (nicht gefunden)
        if (removeValue == -1) {
            return a; // falls der wert nicht gefunden wurde wird das ursprüngliche array ausgegeben 
            
        }
        int[] result = new int[a.length - 1];// erstellung des neuen arrays mit der -1 um eine stelle aufzurutschen 
        for (int i = 0, j = 0; i < a.length; i++) { // durchlauf durch das ursprüngliche array um alle werte ausser das gelöschte zu kopieren 
            if (i != removeValue) {// wenn der aktuelle index nicht der index des zu löschenden wertes ist wird es ins neue array kopiert 
                result[j++] = a[i]; 
            }
        }

        return result; // return gibt das neue array ohne den entfernten wert zurück 

    }
    public static void main(String[] args) {
        int[] a = {3, 4, 1, 9, -5, 4}; // ursprungsarray 
        int w = 9; // der zu löschende wert als w bestimmen 
        ElementDeleter ele = new ElementDeleter();
        int[] newArray = ele.delElement(a, w); // aufruf der methode um den wert zu löschen 
        System.out.println("new array: ");
        for (int num : newArray) { // foreach schleife um jedes element aus dem array wieder zu geben 
            System.out.println(num + " ");
            
        }
    }
    
}
// aufgabenstellung 
/* Implementieren Sie eine Methode delElement(int[] a, int w), welche einen Wert w aus dem Array a löscht. Die eventuell entstehende leere Stelle soll durch „Aufrutschen“ beseitigt werden. Die Methode gibt das neue Feld zurück. 

Beachte die Möglichkeit, dass das Element nicht vorhanden ist. 

Beispiel: Der Funktion wird das Array a=[3,4,1,9,−5,4] übergeben und folgendermaßen modifiziert: 

Array: 3 4 1 9 -5 4 
zu löschendes Element: 9 
neues Array: 3 4 1 -5 4 
 */
