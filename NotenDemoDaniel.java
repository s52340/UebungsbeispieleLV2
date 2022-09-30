public class NotenDemoDaniel {

    public static void main(String[] args) {

        System.out.println("Das Ergebnis Ihrer Note ist: " + gibNoteAus(89));


        String noteBianca = gibNoteAus(73);
        printNote("Bianca's Note ist: " + noteBianca);

        String noteDaniel = gibNoteAus(99);
        printNote("Daniel's Note ist: " + noteDaniel);

        printNote("Nadine's Note ist: " + gibNoteAus(82));
    }


    public static String gibNoteAus (int punkte) {

        if (punkte >= 90) {
            return "Sehr gut"; }
        else if (punkte >= 78) {
            return "Gut"; }
        else if (punkte >= 65) {
            return "Befriedigend"; }
        else if (punkte >= 51) {
            return "Genügend"; }
        else {
            return "Nicht genügend"; }

    }

    public static void printNote (String note) {
        System.out.println(note);
    }

}


