import java.util.Random;

public class TicTacToe {

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    public static void placeSymbol(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void randomMove(char[][] board, char symbol) {
        Random rand = new Random();
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = convertSlotToIndex(slot);
            if (isValidMove(board, pos[0], pos[1])) {
                placeSymbol(board, pos[0], pos[1], symbol);
                break;
            }
        }
    }

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int currentPlayer = 1;

        while (true) {

            displayBoard(board);

            if (currentPlayer == 1) {
                System.out.println("Player 1 turn");
                randomMove(board, 'X');
            } else {
                System.out.println("Player 2 turn");
                randomMove(board, 'O');
            }

            if (isBoardFull(board)) {
                displayBoard(board);
                System.out.println("Game Draw!");
                break;
            }

            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }
    }
}
