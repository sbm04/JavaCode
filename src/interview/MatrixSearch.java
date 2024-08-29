package interview;

public class MatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                System.out.println("Row "  + row + " Col " + col);
                col--;
                System.out.println("col --"+ "Row "  + row + "Col " + col);
            } else {
                System.out.println("Row "  + row + " Col " + col);
                row++;
                System.out.println("Row --"+ "Row "  + row + " Col " + col);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        MatrixSearch search = new MatrixSearch();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean result = search.searchMatrix(matrix, target);
        System.out.println("Target found: " + result); // Output: Target found: true
    }
}
