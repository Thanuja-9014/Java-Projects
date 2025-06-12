package balaji;
import java.util.*;

public class NQueensPractice {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');

        solve(0, board, solutions, n);
        return solutions;
    }

    private void solve(int row, char[][] board, List<List<String>> solutions, int n) {
        if (row == n) {
            solutions.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, solutions, n);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board, int n) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> config = new ArrayList<>();
        for (char[] row : board)
            config.add(new String(row));
        return config;
    }

    // ✅ Main method to test the solver
    public static void main(String[] args) {
        NQueensPractice solver = new NQueensPractice();
        int n = 4;

        List<List<String>> solutions = solver.solveNQueens(n);
        System.out.println("Number of solutions for " + n + "-Queens: " + solutions.size());

        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
