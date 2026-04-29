import java.util.Random;
public class TicTacToe {
    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer;
    public static void tossAndAssign() {
        Random rand = new Random();
        int toss = rand.nextInt(2);
        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }
        System.out.println("Toss Result:");
        System.out.println("Player " + currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
    public static void main(String[] args) {
        tossAndAssign();
    }
}
