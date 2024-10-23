public class Affe {

    String name;
    String rasse;
    double gewicht;

    public Affe(String name, String rasse, double gewicht) {
        this.name = name;
        this.rasse = rasse;
        this.gewicht = gewicht;
    }

    public String toString() {
        String ausgabe = "Name: " + name + "\n" +
                            "Rasse: " + rasse + "\n" +
                            "Gewicht: " + gewicht + "\n";
        return ausgabe;
    }
}
