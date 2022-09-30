public class WinterreifenpflichtDemo {
    // Winterreifen bei < 10°C + rutschige Fahrbahn oder bei <4°
// Rufen Sie die Methode im Hauptprogramm mit unterschiedlichen Werten, und geben Sie abhängig
//von der Rückgabe einen Text „Bitte Winterreifen verwenden“ oder „Winterreifen sind nicht
//erforderlich“ aus und überprüfen Sie Ihr Ergebnis.
    public static void main(String[] args) {

        System.out.println("Hier erfahren Sie ob Winterreifenpflicht ist: ");

       boolean braucheIchWinterreifen = istWinterreifenPflicht(3, true) ;

    }

    public static boolean istWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn) {

        if ((rutschigeFahrbahn == true) && ( temperatur < 10)) {
            System.out.println("Bitte Winterreifen verwenden");
            return true; }

        else if (temperatur < 4) {
            System.out.println("Bitte Winterreifen verwenden");
            return true; }
        else {
            System.out.println("Winterreifen sind nicht erforderlich");
            return false; }

    }

    public static void printWinterreifenPflicht (String reifenPflicht) {
        System.out.println("Bitte Winterreifen verwenden");
    }
    public static void printKeineReifenpflicht (String keineReifenPflich) {
        System.out.println("Winterreifen sind nicht erforderlich");
    }

}
