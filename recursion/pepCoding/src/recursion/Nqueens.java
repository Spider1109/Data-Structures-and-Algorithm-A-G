package recursion;

public class Nqueens {
    public static void printNqueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf);
            return;
        }

        for (int i = 0; i < chess.length; i++) {
            if (issafeQueen(chess, row, i)) {
                chess[row][i] = 1;
                printNqueens(chess, qsf + row + "-" + i + ",", row + 1);
                chess[row][i] = 0; // backtrack
            }
        }
    }

    // Helper function
    public static boolean issafeQueen(int[][] chess, int row, int col) {
        // Check vertically upward
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) return false;
        }

        // Check left diagonal upward
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) return false;
        }

        // ✅ FIX: right diagonal condition should be j < chess.length
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) return false;
        }

        return true; // ✅ Add this return statement
    }

    public static void main(String[] args) {
        int n = 4; // Change this to any N you want
        int[][] chess = new int[n][n];
        printNqueens(chess, "", 0);
    }
}
