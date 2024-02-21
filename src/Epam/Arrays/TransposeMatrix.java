package Epam.Arrays;

class TransposeMatrix {
    public static int[][] transpose(int[][] matrix){
        int columns = matrix.length;//количество столбцов
        System.out.println("columns = " + columns);
        int rows = matrix[0].length;//количество строк
        System.out.println("rows = " + rows);

        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
    public void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            for (int value : row){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        int value = 1;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = value++;
            }
        }
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        transposeMatrix.printMatrix(matrix);
        int[][] result = transpose(matrix);
        transposeMatrix.printMatrix(result);
    }
}
