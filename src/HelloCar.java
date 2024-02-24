public class HelloCar {
    public static void main(String... args) {

        /* On instancie (crée un nouvel objet) avec le mot clé new suivi de la classe à instancier => Voiture
            L'objet nouvellement créé sera affecté à une variable.
            Ici, le type sera Voiture, mais contrairement à une variable classique, Voiture va contenir la référence à cet objet.
        */
        Voiture voitureDeMichel = new Voiture();
        // La référence sera donc stockée dans la variable "voitureDeMichel"

        // On peut modifier les propriétés de la voiture :
        voitureDeMichel.nbPortes = 3;
        voitureDeMichel.automatique = true;
        voitureDeMichel.couleur = "Bleu";
        System.out.println(voitureDeMichel.couleur);

        // Jouer la méthode créée dans Voiture
        voitureDeMichel.klaxonner();

        // Je stocke la nouvelle vitesse de la voiture dans une variable
        int nouvelleVitesse = voitureDeMichel.accelerer();
        System.out.println(nouvelleVitesse);

        int nouveauRapport = voitureDeMichel.passerRapport(true);
        System.out.println("Le nouveau rapport est : " + nouveauRapport);

        voitureDeMichel.passerRapport(true);
        voitureDeMichel.passerRapport(true);
        nouveauRapport = voitureDeMichel.passerRapport(false);
        System.out.println("Le nouveau rapport est : " + nouveauRapport);

        voitureDeMichel.tourner("gauche", 45);


        // Je crée un nouvel objet de type Voiture
        Voiture voitureDeJerome = new Voiture();
        voitureDeJerome.nbPortes = 5;

        // Je veux comparer voitureDeMichel et voitureDeJerome avec l'opérateur ==
        boolean egauxOuNon = voitureDeMichel == voitureDeJerome;
        System.out.println(egauxOuNon);

        String chaine1 = "Le ciel est bleu";
        String chaine2 = "Le ciel est bleu";
        boolean egauxOuPas = chaine1 == chaine2;
        System.out.println(egauxOuPas);     // Retourne true

        // Si j'instancie un nouvel objet pour chaque string, MÊME SI le contenu est identique, cela me retournera false
        String chaine3 = new String("Le ciel est bleu");
        String chaine4 = new String("Le ciel est bleu");
        boolean egauxOrNot = chaine3 == chaine4;
        System.out.println(egauxOrNot);     // Retourne false

        // Pour comparer le contenu de 2 string (qui sont de type Objet), on utilise la méthode "equals()"
        String chaine5 = new String("Le ciel est bleu");
        String chaine6 = new String("Le ciel est bleu");
        boolean egauxAlorsOuPas = chaine5.equals(chaine6);
        System.out.println(egauxAlorsOuPas);    // Retourne true

        int nouvelleVitesseDeJerome = voitureDeJerome.accelerer(150);
        System.out.println("La nouvelle vitesse de Jérôme est " + nouvelleVitesseDeJerome + "km/h");

        Moteur moteur = new Moteur();
        moteur.carburation = "Diesel";
        moteur.nbCylindres = 6;
        voitureDeJerome.moteur = moteur;

        System.out.println("Le nombre de cylindres de la voiture de Jérôme est : " + voitureDeJerome.moteur.nbCylindres);

        Passager passager = new Passager();
        Ville ville = new Ville();
        passager.nom = "Dupont";
        passager.prenom = "Patrick";
        ville.nom = "Auckland";
        Ville destination = voitureDeMichel.transporter(passager, ville);
        System.out.println("Le passager est arrivé dans la ville de " + destination.nom);
    }
}
