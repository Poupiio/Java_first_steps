// Ce qui est écrit avec public class doit obligatoirement correspondre au nom du fichier/dossier
public class HelloWorld {
    public static void main(String... args) {

        System.out.println("Hello World!");

        /* Types de variables dits primitifs => commencent par une minuscule :
        int, char, float, double, boolean, ...
         */
        int ageDuCapitaine = 60;

        // La valeur d'une variable de type char s'affiche entre simple quotes
        char initialePrenom = 'F';

        /* Lorsqu'on affecte une valeur à un float ou un long, il faudra le préciser pour que Java l'interprète correctement,
        en mettant la 1ère lettre correspondant à la variable en minuscule ou majuscule */
        float prixEssence = 1.78F;
        long millisecondesDepuisLe01_01_197 = 14875423585L;

        // La valeur d'une variable de type String s'affiche entre double quotes
        String maChaine;
        maChaine = "Coucou";
        // Le système d'affectation des variables en Java se lit de droite à gauche. Ici, on affecte d'abord "Bonjour" à maChaine, puis à monAutreChaine
        String monAutreChaine = maChaine = "Bonjour";
        System.out.println(maChaine);
        System.out.println(monAutreChaine);

        int somme = 5 + 2;
        System.out.println(somme);

        // Opérateurs d'incrémentation / de décrémentation
        int test = 5;
        test++;
        System.out.println(test);
        // On peut placer l'opérateur ++ (ou --) avant ou après la variable MAIS le sens a une importance :
        int valeureEntiere = 5;
        int valeureEntiere2;
        /* valeureEntiere2 = valeureEntiere++;
        System.out.println(valeureEntiere2);
        // Ici, la console nous affiche 5, et non 6 car l'opérateur d'affectation a la priorité sur l'opérateur d'incrémentation
        // Si on positionne le ++ DEVANT valeurEntiere, alors ceci est interprété comme ceci "valeureEntiere2 est égale à valeureEntiere +1, donc valeureEntiere2 = 6
        */
        valeureEntiere2 = ++valeureEntiere;
        System.out.println(valeureEntiere2);

        // L'opérateur de concaténation
        String debut = "Voici une chaîne ";
        String fin = "concaténée";
        System.out.println(debut + fin);
        String age = "Mon âge est de ";
        System.out.println(age + 30);
        // Attention, si je concatène age + 30 + 1, ce n'est pas "Mon âge est de 31" qui ressort mais "Mon âge est de 301"

        // Les if :
        // S'il n'y a qu'une seule instruction dans le if, pas besoin des accolades
        if (ageDuCapitaine > 90) {
            System.out.println("Youhou");
        } else {
            System.out.println("Nope");
        }
        // Version ternaire :
        boolean ilFaitBeau = false;
        boolean maConditionEstRealisee = ageDuCapitaine > 90 && ilFaitBeau;
        System.out.println(maConditionEstRealisee ? "L'âge du capitaine est " + ageDuCapitaine : "Cas contraire");

        if (ageDuCapitaine > 90) {
            System.out.println("L'âge du capitaine est " + ageDuCapitaine);
        } else if (ilFaitBeau) {
            System.out.println("Oui, mais il fait beau, c'est déjà ça.");
        } else {
            System.out.println("Il y a des jours comme ça où rien ne va !");
        }

        // Le switch
        switch (ageDuCapitaine) {
            case 20:
                System.out.println("Le capitaine a 20 ans.");
                break;
            case 28:
                System.out.println("Le capitaine a 28 ans.");
                break;
            case 60:
                System.out.println("Le capitaine a 60 ans.");
                break;
            default:
                System.out.println("Tout ce que je veux effectuer si la valeur ne correspond à aucun cas listé, ou qu'elle correspond à un cas listé mais qu'aucun break n'ait mis fin à la séquence de traitement avant d'arriver dans default");
        }
        // RAPPEL : si on ne met pas les "break", tout le code de chaque cas n'ayant pas de break est exécuté

        // Boucle for :
        for (int nb = 0; nb < 3; nb++) {
            System.out.println("Coucou");
        }

        // Boucle while (RAPPEL : souvent plus utilisée avec des booléens)
        boolean jeContinue = true;
        while (jeContinue) {
            jeContinue = false;
        }
        // Ici, il ne va rien se passer. Si on voulait au moins exécuter une fois ce qui se trouve dans le while, il faudrait utiliser do... while :
        do {
            System.out.println("Hé");
            jeContinue = false;
        } while (jeContinue);
    }
}
