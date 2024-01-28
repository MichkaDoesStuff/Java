import java.util.Random;
public class De {

    private int value;
    public De() {
        Random random = new Random();
        this.value = random.nextInt(6)+1;
    }
    public void lancer() {
        Random random = new Random();
        value = random.nextInt(6)+1;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int val) {
        if (val > 6 || val < 1) {
            System.out.println("Valeur iIllégale du dé à " + val);
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

        /* generer une exception. */
        System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
        System.out.println("lorsqu'il essaie de fixer la valeur d'un dé a 100. ");
        De de;  // variable referant au de.
        de = new De();  // creer l'objet
        de.setValue(100);
    }

}
