public class NotenDemo {

    public static void main(String[] args) {



        // Mehode aufrufen
        getNotentext(43);

    }

    public static String getNotentext(int punkte) {

        System.out.println("Das Ergebnis Ihrer Note ist: ");

        // eigentlich falsch - auch mit Void möglich, da ich ein Retourn habe - daher besser NotenDemoDaniel
        if (punkte >= 90) {
            System.out.println("Sehr gut");}
        else if (punkte >= 78) {
            System.out.println("Gut");}
        else if (punkte >= 65) {
            System.out.println("Befriedigend");}
        else if (punkte >= 51) {
            System.out.println("Genügend");}
        else {
            System.out.println("Nicht genügend");}

        // WARUM retourn null (null = nichts / !=0 )
        return null;
    }

}

