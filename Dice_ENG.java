import java.util.Random;
        /*/
        This is a fun little random-based and object-based algorithm, where the computer tells
        you how many throws it took to attain the same value on two dice.
        /*/
public class Dice_ENG {

    private int value;
    public Dice_ENG() {
        /*/
        Gives initial value to dice object
        /*/
        Random random = new Random();
        this.value = random.nextInt(6)+1;
    }
    public void lancer() {
        /*/
        Changes value of dice object
        /*/
        Random random = new Random();
        value = random.nextInt(6)+1;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int val) {
        /*/
        Verification if the value is appropriate
        /*/
        if (val > 6 || val < 1) {
            System.out.println("Illegal value of dice at value " + val);
        }
        else;
        value = val;
    }

    //main program
    public static void main(String[] args) {

        Dice_ENG de1 = new Dice_ENG();
        Dice_ENG de2 = new Dice_ENG();

        int compteur = 0;
        while(de1.value != de2.value){
            de1.lancer();
            de2.lancer();
            compteur += 1;
        }

        System.out.println("It took "+compteur+" throws for the dice to show the same value :");
        System.out.println(de1.getValue());
        System.out.println(de2.getValue());
        System.out.println();

        /* incase in need of exception. */
        System.out.println("This program will now close with an error message ");
        System.out.println("whenever you try to set the dice value anywhere outside of [1,6], in this case; 100. ");
        Dice_ENG de;  // dice object.
        de = new Dice_ENG();  // create object
        de.setValue(100);
    }
}
