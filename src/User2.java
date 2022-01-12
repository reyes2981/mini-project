import java.util.Scanner;

public class User2 extends Player{
    private Scanner input;

    public User2() {
        input = new Scanner(System.in);
    }

    public void selectChoice() {
        System.out.println("Enter your choice: Rock, Paper, Scissors");
        setChoice(input.nextLine().toUpperCase());
    }
}
