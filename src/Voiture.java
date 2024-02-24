public class Voiture {
    /* Convention d'écriture :
    * - d'abord les propriétés statiques
    * - puis les attributs d'instance
    * - ensuite les constructeurs (ordonnées par leur nombre de paramètres)
    * - enfin, les méthodes (d'abord les statiques, puis les méthodes d'instance)
    * */
    /* Propriété statique :
     Un attribut statique est une propriété dont la valeur est définie par la Classe
        => variable de Classe (le contenu est commun à toutes les instances)
    */
    static int nbRoues = 4;

    int nbPortes = 5;
    boolean automatique;
    String couleur;
    int rapportCourant;
    int vitesse;
    // Ajout d'une nouvelle propriété de type Objet
    Moteur moteur;

    // Constructeur sans paramètre
    Voiture() {
        System.out.println("Une voiture est construite sans paramètre");
        // Cela va s'afficher à chaque fois que l'objet Voiture sera utilisé dans HelloCar.java
    }

    // Constructeur avec paramètre => fait disparaître le constructeur par défaut, sans paramètre
    Voiture(String couleur) {
        this.couleur = couleur;
        System.out.println("Une voiture est construite avec la couleur");
        // Rappel : "this.couleur" identifie la couleur de l'objet courant, et "couleur" identifie le paramètre couleur
    }

    Voiture(int nbPortes) {
        this.nbPortes = nbPortes;
        System.out.println("Une voiture est construite avec le nombre de portes");
        // Rappel : "this.couleur" identifie la couleur de l'objet courant, et "couleur" identifie le paramètre couleur
    }
    // ATTENTION : on ne peut pas créer 2 constructeurs différents avec le MÊME type de paramètre

    // Constructeur avec plusieurs paramètres
    /* Voiture(String couleur, int nbPortes) {
        this.couleur = couleur;
        this.nbPortes = nbPortes;
        System.out.println("Une voiture est construite avec la couleur et le nombre de portes");
        // Rappel : "this.couleur" identifie la couleur de l'objet courant, et "couleur" identifie le paramètre couleur
    } */

    // Constructeur avec en paramètre un type complexe (comme une classe)
    Voiture(Moteur moteur) {
        this.moteur = moteur;
        System.out.println("Une voiture est construite avec le moteur");
    }

    // Construire une voiture qui reçoit en paramètres les constituants du moteur
    Voiture(String carburation, int nbCylindres) {
        // On profite de la création d'une voiture pour instancier son moteur
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindres = nbCylindres;
        this.moteur = moteur;
    }

    // Ajout d'une méthode
    // On utilise void pour faire comprendre à Java que notre méthode ne retourne rien (donc vide)
    // On peut aussi qualifier une méthode de "static", cad que la méthode ne dépend pas des spécificités de l'objet en particulier
    static void klaxonner() {
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
    static void tourner(boolean droite, int angle) {
        String droiteOuGauche = null;

        if (droite) {
            droiteOuGauche = "droite";
        } else {
            droiteOuGauche = "gauche";
        }
        System.out.println("La voiture va tourner à " + droiteOuGauche + " d'un angle de " + angle + " degrés");
    }
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

    // Impliquer un Objet dans un paramètre ou dans le return d'une méthode
    Ville transporter(Passager passager, Ville villeDeDepart) {
        System.out.println("Je transporte un passager qui s'appelle " + passager.prenom + " " + passager.nom);
        System.out.println("Le passager est parti de la ville de " + villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Wellington";

        return villeDeDestination;  // On n'oublie pas de déclarer le type de ce que l'on retourne avant la méthode, donc ici l'objet Ville
    }



}
