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
        voitureDeMichel.couleur = "Bleue";
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
    }
}
