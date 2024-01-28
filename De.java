import java.util.Random;
        /*/
        Il s'agit d'un petit algorithme amusant basé sur le hasard et sur les objets,
        dans lequel l'ordinateur vous indique le nombre de lancers nécessaires pour obtenir
        la même valeur sur deux dés.
        /*/
public class De {

    private int value;
    public De() {
        /*/
        Donner une valeur initiale à l'objet dé
        /*/
        Random random = new Random();
        this.value = random.nextInt(6)+1;
    }
    public void lancer() {
        /*/
        Changer la valeur à l'objet dé
        /*/
        Random random = new Random();
        value = random.nextInt(6)+1;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int val) {
        /*/
        Vérification si la valeur est appropriée
        /*/
        if (val > 6 || val < 1) {
            System.out.println("Valeur Illégale du dé à " + val);
        }
        else;
        value = val;
    }

//Programme principal main
    public static void main(String[] args) {

        De de1 = new De();
        De de2 = new De();
        
        int compteur = 0;
        while(de1.value != de2.value){
            de1.lancer();
            de2.lancer();
            de1.getValue();
            de2.getValue();
            compteur += 1;
        }

        System.out.println("Ça a pris "+compteur+" lancés pour que les deux dés indiquent la même valeur :");
        System.out.println(de1.getValue());
        System.out.println(de2.getValue());
        System.out.println();

        /* générer une exception. */
        System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
        System.out.println("lorsqu'il essaie de fixer la valeur d'un dé a 100. ");
        De de;  // variable référant au dé.
        de = new De();  // créer l'objet
        de.setValue(100);
    }

}
