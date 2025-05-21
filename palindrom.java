package Methods;

public class palindrom {
    public static void main(String[] args) {
        
        String[] text = {"Annasusanna", "Dreieck", "Bruggrub", "handnah", "Palindrom", "Malajalam", "Apfelsaft"};
        
        // Schleife über jedes Wort im Array text 
        for (int i = 0; i < text.length; i++) {
            String s = text[i];  // Hole das Wort an stelle-i aus dem Array
            // Überprüfe, ob das aktuelle Wort ein Palindrom ist, und gebe das Ergebnis aus
            if (isPalindrom(s, 0, s.length() - 1)) {
                System.out.println(s + " ist ein Palindrom.");
            } else {
                System.out.println(s + " ist kein Palindrom.");
            }
        }
    }

    // Rekursive Methode, die überprüft, ob der String s ein Palindrom ist
    // start ist der Index des ersten Zeichens und end ist der Index des letzten Zeichens im String
    public static boolean isPalindrom(String s, int start, int end) {
        // Wenn start >= end, wurde der gesamte String überprüft
        if (start >= end) {
            return true;  // Wenn der Startindex gleich oder größer als der Endindex ist, ist der String ein Palindrom
        }

        // Vergleiche das erste Zeichen (s.charAt(start)) mit dem letzten Zeichen (s.charAt(end))
        if (s.charAt(start) != s.charAt(end)) {
            return false;  // false wenn das wort kein Palindrom ist 
        }

        // Prüfe den inneren Teil des Strings, indem start um 1 erhöht und end um 1 verringert wird
        return isPalindrom(s, start + 1, end - 1);
    }
}
//komische lösung, sollte nochmal gelernt werden. nicht ganz verständlich 
