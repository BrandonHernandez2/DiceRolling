import java.util.Random;

public class MAin {
    public static void main(String[] args) {
        rollSixDice();
        rollSixDice();
        rollSixDice();
        rollSixDice();
        rollSixDice();
        rollSixDice();
    }

    private static void rollSixDice() {
        Random rand = new Random();
        for (int i = 0; i < 6; i++){
            //Random random = new Random(); // DONT DO THIS

            int roll = rand.nextInt(6) + 1;
            System.out.println("Roll #" + (i + 1) + ": " + roll + " ");
        }
        System.out.println();
    }
}
