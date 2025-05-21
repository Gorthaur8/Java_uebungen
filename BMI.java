public class BMI {

    public static void main(String[] args) {

        double weight, height;
        double bmi;
        // deklaration der user eingabe
        weight = InOut.readDouble("Geben sie ihr Gewicht in KG an.");
        height = InOut.readDouble("Geben sie ihre Größe in Meter an.");
        // alternativ zu Math.pow könnte man height * height verwenden
        bmi = (weight / (Math.pow(height, 2)));
        System.out.println("Ihr BMI beträgt: " + bmi);
        // beginn der Körpergewichtsinterpretation

        if (bmi >= 30) {
            System.out.println("Adipositas behandlungsbedürftig!!!!");

        } else if (bmi >= 25) {
            System.out.println("Übergewicht");

        } else if (bmi >= 18.5) {
            System.out.println("Normalgewicht");

        } else {
            System.out.println("Untergewicht");
        }

    }

}
// BMI-Formel = Körpergewicht (in kg ) geteilt durch Körpergröße (in m ) zum
// Quadrat.