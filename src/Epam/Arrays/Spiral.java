package Epam.Arrays;

class Spiral {
    public static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];

        int value = 1;
        // Переменные для отслеживания границ спирали
        int topRow = 0, bottomRow = rows - 1, leftColumn = 0, rightColumn = columns - 1;
        // Цикл, который заполняет массив по спирали
        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            // Fill top row
            for (int i = leftColumn; i <= rightColumn; i++) {
                result[topRow][i] = value++;
            }
            topRow++;

            // Fill right column
            for (int i = topRow; i <= bottomRow; i++) {
                result[i][rightColumn] = value++;
            }
            rightColumn--;

            // Fill bottom row
            if (topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    result[bottomRow][i] = value++;
                }
                bottomRow--;
            }

            // Fill left column
            if (leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result[i][leftColumn] = value++;
                }
                leftColumn++;
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        int columns = 6;

        int[][] result = spiral(rows, columns);
        printMatrix(result);
    }
}

