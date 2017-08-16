package algorithms.backtracking;

import java.util.ArrayList;

/**
 * You're given a 2D board which contains an m x n matrix of chars - char[][] board.
 * Write a method - printPaths that prints all possible paths from the top left cell to the bottom right cell.
 * Your method should return an ArrayList of Strings, where each String represents a path with characters appended in the order of movement.
 * You're only allowed to move down and right on the board. The order of String insertion in the ArrayList does not matter.
 */
public class PrintPaths {

    public ArrayList<String> printPaths(char[][] board) {

        ArrayList<String> paths = new ArrayList<>();

        if (board == null || board.length == 0 || board[0].length == 0) {
            return paths;
        }

        StringBuilder sb = new StringBuilder();
        createPaths(board, paths, sb, 0, 0);

        return paths;
    }

    public static void createPaths(char[][] board, ArrayList<String> paths, StringBuilder sb, int i, int j) {

        int rows = board.length;
        int cols = board[0].length;

        if (i >= rows || j >= cols) {
            return;
        }

        sb.append(board[i][j]);

        if (i == rows - 1 && j == cols - 1) {
            paths.add(sb.toString());
        }

        createPaths(board, paths, sb, i, j + 1);
        createPaths(board, paths, sb, i + 1, j);
        sb.setLength(sb.length() - 1);
    }

}
