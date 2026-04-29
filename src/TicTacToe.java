public class TicTacToe {
    public static void placeSymbol(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        int row = 1;
        int col = 1;
        char symbol = 'X';
        placeSymbol(board, row, col, symbol);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
