import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    static void main()
    {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        String playAgain = "Y";

        while(playAgain.equalsIgnoreCase("Y"))
        {
            int die1, die2, die3;
            int tries = 0;

            System.out.printf("%-8s %-8s %-8s %-8s %-8s\n", "Roll", "Die1", "Die2", "Die3", "Sum");


            System.out.println("________________________________________");
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            tries++;

            do
            {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                tries++;

                System.out.printf("%-8d\t%-8d\t%-8d\t%-8d\n", tries, die1, die2, die3, + die1 + die2 +die3);

            } while(die1 != die2 || die2 != die3); //not all the same

            System.out.print("ROll Again? (Y/N): ");
            playAgain = input.nextLine();
            System.out.println();
        }

    }
}
