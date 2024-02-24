public class Voiture {
    int nbPortes = 5;
    boolean automatique;
    String couleur;
    int rapportCourant;
    int vitesse;

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

    /* - La surcharge de méthode : il est possible d'ajouter une méthode ayant un nom identique à une autre,
        en ajoutant plus ou moins de paramètres

        - Utilisation de this : lorsque le paramètre de la méthode a le même nom que la propriété de l'objet que l'on manipule,
        c'est le paramètre de la méthode qui a la priorité
    => Ici, si dans HelloCar.java j'appelle la méthode accelerer(150) mais que je n'utilise pas this dans la méthode acceler
        dans le fichier Voiture.java,
        la prioriété sera donnée au paramètre vitesse et non à la propriété "vitesse" de l'objet en  cours. Ce qui me retournera
        300 car Java aura compris "vitesse (donc 150) = vitesse + vitesse;", soit 150 + 150
     */
    int accelerer(int vitesse) {
        System.out.println("J'accélère !");
        this.vitesse = this.vitesse + vitesse;
        return this.vitesse;
    }
}
