package UdemyDmitryPractic.game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        }; //игровое поле
        if (new Random().nextBoolean()) { //если будет true, то ходит компьютер
            makeComputerMove(gameTable);
            printGameTable(gameTable);
        }
        while (true) {
            makeUserMove(gameTable);
            printGameTable(gameTable);
            if (isUserWin(gameTable)) {
                System.out.println("You win!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Draw!");
                break;
            }
            makeComputerMove(gameTable);
            printGameTable(gameTable);
            if (isComputerWin(gameTable)) {
                System.out.println("Computer win!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Draw!");
                break;
            }
        }
        System.out.println("Game over!");
    }

    private static void printTableMapping() {
//        System.out.printf("-----------%n");
//        System.out.printf(" %d | %d | %d\n", 7, 8, 9);
//        System.out.printf("-----------%n");
//        System.out.printf(" %d | %d | %d\n", 4, 5, 6);
//        System.out.printf("-----------%n");
//        System.out.printf(" %d | %d | %d\n", 1, 2, 3);
//        System.out.printf("-----------%n");
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        printGameTable(mappingTable);
    }

    private static void printGameTable(char[][] gameTable) {
        System.out.printf("-----------%n");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c\n", gameTable[i][0], gameTable[i][1], gameTable[i][2]);
            System.out.printf("-----------%n");
        }
    }

    private static void makeUserMove(char[][] gameTable) {
        boolean validInput = false;
        do {
            System.out.printf("Enter your move: from 1 to 9%n");
            try {
                int userMove = new Scanner(System.in).nextInt();
                if (userMove >= 1 && userMove <= 9) {
                    switch (userMove) {
                        case 1 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 2, 0);

                        case 2 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 2, 1);

                        case 3 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 2, 2);

                        case 4 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 1, 0);

                        case 5 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 1, 1);

                        case 6 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 1, 2);

                        case 7 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 0, 0);

                        case 8 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 0, 1);

                        case 9 -> validInput = checkUserMoveIfCellIsOccupied(gameTable, 0, 2);

                    }
                } else {
                    System.out.println("Use only 1 to 9");

                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number from 1 to 9.");
                //makeUserMove(gameTable);
            }
        } while (!validInput);
    }

    private static boolean checkUserMoveIfCellIsOccupied(char[][] gameTable, int row, int column) {
        if (notEmpty(gameTable, row, column)) {
            System.out.println("This cell is already occupied");
            return false;
        } else {
            gameTable[row][column] = 'X';
            return true;
        }
    }

    private static void makeComputerMove(char[][] gameTable) {
        Random random = new Random();
        int row = random.nextInt(3);
        int column = random.nextInt(3);
        if (notEmpty(gameTable, row, column)) {
            makeComputerMove(gameTable);
        } else {
            gameTable[row][column] = 'O';
            System.out.println("Computer move"  + "\n");
        }
//        int computerMove = new Random().nextInt(10);
//        switch (computerMove) {
//            case 1 -> gameTable[2][0] = 'O';
//            case 2 -> gameTable[2][1] = 'O';
//            case 3 -> gameTable[2][2] = 'O';
//            case 4 -> gameTable[1][0] = 'O';
//            case 5 -> gameTable[1][1] = 'O';
//            case 6 -> gameTable[1][2] = 'O';
//            case 7 -> gameTable[0][0] = 'O';
//            case 8 -> gameTable[0][1] = 'O';
//            case 9 -> gameTable[0][2] = 'O';
//        }
    }

    private static boolean isUserWin(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == 'X' && gameTable[i][1] == 'X' && gameTable[i][2] == 'X') {
                return true;
            }
            if (gameTable[0][i] == 'X' && gameTable[1][i] == 'X' && gameTable[2][i] == 'X') {
                return true;
            }

            if (gameTable[0][0] == 'X' && gameTable[1][1] == 'X' && gameTable[2][2] == 'X') {
                return true;
            }
            if (gameTable[0][2] == 'X' && gameTable[1][1] == 'X' && gameTable[2][0] == 'X') {
                return true;
            }

        }
        return false;
    }

    private static boolean isComputerWin(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == 'O' && gameTable[i][1] == 'O' && gameTable[i][2] == 'O') {
                return true;
            }
            if (gameTable[0][i] == 'O' && gameTable[1][i] == 'O' && gameTable[2][i] == 'O') {
                return true;
            }

            if (gameTable[0][0] == 'O' && gameTable[1][1] == 'O' && gameTable[2][2] == 'O') {
                return true;
            }
            if (gameTable[0][2] == 'O' && gameTable[1][1] == 'O' && gameTable[2][0] == 'O') {
                return true;
            }
    }
//        if (gameTable[0][0] == 'O' && gameTable[0][1] == 'O' && gameTable[0][2] == 'O') {
//            if (gameTable[1][0] == 'O' && gameTable[1][1] == 'O' && gameTable[1][2] == 'O') {
//                if (gameTable[2][0] == 'O' && gameTable[2][1] == 'O' && gameTable[2][2] == 'O') {
//                    if (gameTable[0][0] == 'O' && gameTable[1][0] == 'O' && gameTable[2][0] == 'O') {
//                        if (gameTable[0][1] == 'O' && gameTable[1][1] == 'O' && gameTable[2][1] == 'O') {
//                            if (gameTable[0][2] == 'O' && gameTable[1][2] == 'O' && gameTable[2][2] == 'O') {
//                                if (gameTable[0][0] == 'O' && gameTable[1][1] == 'O' && gameTable[2][2] == 'O') {
//                                    if (gameTable[0][2] == 'O' && gameTable[1][1] == 'O' && gameTable[2][0] == 'O') {
//                                        return true;
//                                    }
//                                    return true;
//                                }
//                                return true;
//                            }
//                            return true;
//                        }
//                        return true;
//                    }
//                    return true;
//                }
//                return true;
//            }
//            return true;
//        }
        return false;
}


private static boolean isDraw(char[][] gameTable) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (gameTable[i][j] == ' ') {
                return false;
            }
        }
    }
    return true;
}

private static boolean notEmpty(char[][] gameTable, int row, int column) {
    return gameTable[row][column] != ' ';
}
}





