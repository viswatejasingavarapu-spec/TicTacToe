public class TicTacToe {
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        int row = 1;
        int col = 1;
        boolean result = isValidMove(board, row, col);
        System.out.println("Move valid: " + result);
    }
}
