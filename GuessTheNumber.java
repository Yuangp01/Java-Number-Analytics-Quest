import java.util.*;
public class GuessTheNumber {

    public static void main(String[] args) {

        int random = (int) (Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int number = 0;
        int tries = 0;

        while (number != random) {
            tries++;
            System.out.println("Introduce a number, please");

            number = entrada.nextInt();
            if (random < number) {
                System.out.println("Lower");
            }
            else if (random > number) {
                System.out.println("Higher");
            }
        }
        System.out.println("Correct. You did it in " + tries + " tries ");

    }

}
