import java.util.Random;
public class TicTacToe {
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }
    public static void placeSymbol(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }
    public static void computerMove(char[][] board, char symbol) {
        Random rand = new Random();
        int slot;
        int row;
        int col;
        while (true) {
            slot = rand.nextInt(9) + 1;
            int[] pos = convertSlotToIndex(slot);
            row = pos[0];
            col = pos[1];

            if (isValidMove(board, row, col)) {
                placeSymbol(board, row, col, symbol);
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
        computerMove(board, 'O');
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
