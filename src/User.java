import java.util.Scanner;

public class User extends Player {
    private Scanner input;

    public User() {
        input = new Scanner(System.in);
    }

    public void selectChoice() {
        System.out.println("Enter your choice: Rock, Paper, Scissors");
        setChoice(input.nextLine().toUpperCase());
    }
}
