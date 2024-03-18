package Epam.Arrays;

class MultiplyMatrix {
    public int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        int[][] result = new int[rows1][columns2];
        int sum = 0;
        if (rows1 != columns2) {
            throw new IllegalArgumentException("размеры матриц не соответствуют условию");
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
                sum = 0;
            }
        }

        return result;
    }
    public void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            for (int value : row){
                System.out.printf("|  %d   |\t",value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { {0, 12345}, {4509, 0}, {3, 567} };
        int[][] b = { {653, 0, 25353}, {0, 61, 6} };
        MultiplyMatrix multiplyMatrix = new MultiplyMatrix();
        int[][] result = multiplyMatrix.multiply(a,b);
        multiplyMatrix.printMatrix(result);
    }

}
