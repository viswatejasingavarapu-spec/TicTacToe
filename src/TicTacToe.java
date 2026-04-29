import java.util.Scanner;
public class TicTacToe {
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot; // return entered value
    }
    public static void main(String[] args) {
        int userChoice = getUserInput();
        System.out.println("You selected slot: " + userChoice);
    }
}
