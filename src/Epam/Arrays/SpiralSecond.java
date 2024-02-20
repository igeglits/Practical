package Epam.Arrays;

class SpiralSecond {
    public int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        int value = 1;
        int toprow = 0, bottomrow = rows - 1, rightcolumn = columns - 1, leftcolumn = 0;
        while (toprow <= bottomrow && leftcolumn <= rightcolumn) {
            for (int i = toprow; i <= bottomrow; i++) {
                result[i][leftcolumn] = value++;
            }
            leftcolumn++;
            for (int i = leftcolumn; i <= rightcolumn; i++) {
                result[bottomrow][i] = value++;
            }
            bottomrow--;
            if (rightcolumn >= leftcolumn) {
                for (int i = bottomrow; i >= toprow; i--) {
                    result[i][rightcolumn] = value++;
                }
                rightcolumn--;
            }
            if (toprow <= bottomrow) {
                for (int i = rightcolumn; i >= leftcolumn; i--) {
                    result[toprow][i] = value++;
                }
                toprow++;
            }
        }
        return result;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        int columns = 9;

        SpiralSecond spiralSecond = new SpiralSecond();
        int[][] result = spiralSecond.spiral(rows, columns);
        spiralSecond.printMatrix(result);
    }
}
