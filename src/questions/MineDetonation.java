package questions;

import java.util.*;



public class MineDetonation {

    // Directions for 8 possible movements (up, down, left, right, and 4 diagonals)
    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };

    public static int detonateMines(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int detonatedCells = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 1 && !visited[r][c]) {
                    detonatedCells += bfs(matrix, r, c, visited);
                }
            }
        }

        return detonatedCells;
    }

    private static int bfs(int[][] matrix, int startRow, int startCol, boolean[][] visited) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { startRow, startCol });
        visited[startRow][startCol] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            count++;

            for (int[] dir : DIRECTIONS) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !visited[newRow][newCol] && matrix[newRow][newCol] == 1) {
                    queue.offer(new int[] { newRow, newCol });
                    visited[newRow][newCol] = true;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 1}
        };

        int result = detonateMines(matrix);
        System.out.println("Total cells detonated: " + result);  // Output the total number of cells detonated
    }
}
