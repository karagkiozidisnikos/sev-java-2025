package gr.aueb.sev.ch6;

/**
 * Define a 2D array and populate it
 * 2D arrays are defined as [rowCount][colCount]
 */
public class TwoDimArrayApp {

    public static void main(String[] args) {
        int[][] grid = new int[2][2]; // 2 rows, 2 columns

        // update
        grid[0][0] = 0; // first row, first column
        grid[0][1] = 1; // first row, second column
        grid[1][0] = 2; // second row, first column
        grid[1][1] = 3; // second row, second column

        // print array
        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < grid.length; i++ ) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
