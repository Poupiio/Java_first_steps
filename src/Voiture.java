public class Voiture {
    int nbPortes = 5;
    boolean automatique;
    String couleur;
    int rapportCourant;

    // Ajout d'une méthode
    // On utilise void pour faire comprendre à Java que notre méthode ne retourne rien (donc vide)
    void klaxonner() {
        System.out.println("Tutut !!!");
    }

    // On utilise int pour déclarer le type de valeur retournée par la fonction, ici un int
    int accelerer() {
        System.out.println("J'accélère !");
        return 100;
    }

    // Je retourne un int. Je passe également un argument dont je donne le type, ici je souhaite retourner un booléen
    int passerRapport(boolean augmenter) {
        if (augmenter) {
            rapportCourant++;
        } else {
            rapportCourant--;
        }

        return rapportCourant;
    }

    // Je souhaite passer en paramètre une chaîne de caractère et un int
    /* void tourner(boolean droite, int angle) {
        String droiteOuGauche = null;

        if (droite) {
            droiteOuGauche = "droite";
        } else {
            droiteOuGauche = "gauche";
        }
        System.out.println("La voiture va tourner à " + droiteOuGauche + " d'un angle de " + angle + " degrés");
    } */
    // Au lieu de construire ma string dans la fonction, je la passe directement en tant que paramètre
    void tourner(String droiteOuGauche, int angle) {
        System.out.println("La voiture va tourner à " + droiteOuGauche + " d'un angle de " + angle + " degrés");
    }
}
