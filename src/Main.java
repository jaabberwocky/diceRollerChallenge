import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Press enter to roll dice, type \"exit\" to quit!");
            String s = scan.nextLine();
            if (s.toLowerCase().equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println(Dice.Roll());
            }
        }
    }
}
