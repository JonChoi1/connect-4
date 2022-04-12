import java.util.Scanner;

public class w {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        //creating the board
        String[][] board = new String[6][7];
        for (int column = 0; column < 7; column++){
            for (int row = 0; row < 6; row++){
                board[row][column] = "-";
            }
        }

        while (true) {
            System.out.println("Red turn, Enter your column: ");
            int redInput = in.nextInt();
            board = (insertRedCoin(board,redInput));
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            //check for red connect 4
            for (int column = 0; column < 7; column++){
                for (int row = 5; row >= 0; row --){
                    if (board[row][column].equals("R")){
                        //diag
                        if ((column < 4) && (row > 2) && (board[row - 1][column + 1].equals("R")) && (board[row - 2][column + 2].equals("R")) && (board[row - 3][column + 3].equals("R"))){
                            System.out.println("Red wins!!");
                            return;
                        }
                        //vertical
                        else if ((row > 2) && (board[row - 1][column].equals("R")) && (board[row - 2][column].equals("R")) && (board[row - 3][column].equals("R"))){
                            System.out.println("Red wins!!");
                            return;
                        }
                        //horizontal
                        else if ((column < 4) && (board[row][column + 1].equals("R")) && (board[row][column + 2].equals("R")) && (board[row][column + 3].equals("R"))){
                            System.out.println("Red wins!!");
                            return;
                        }
                        //diag
                        else if ((row > 2) && (column > 2) && (board[row - 1][column - 1].equals("R")) && (board[row - 2][column - 2].equals("R")) && (board[row - 3][column - 3].equals("R"))){
                            System.out.println("Red wins!!");
                            return;
                        }
                    }
                }
            }

            System.out.println("Yellow turn, Enter your  column: ");
            int yellowInput = in.nextInt();
            board = (insertYellowCoin(board, yellowInput));
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            //check for yellow connect 4
            for (int column = 0; column < 7; column++){
                for (int row = 5; row >= 0; row --){
                    if (board[row][column].equals("Y")){
                        //diag
                        if ((column < 4) && (row > 2) && (board[row - 1][column + 1].equals("Y")) && (board[row - 2][column + 2].equals("Y")) && (board[row - 3][column + 3].equals("Y"))){
                            System.out.println("Yellow wins!!");
                            return;
                        }
                        //vertical
                        else if ((row > 2) && (board[row - 1][column].equals("Y")) && (board[row - 2][column].equals("Y")) && (board[row - 3][column].equals("Y"))){
                            System.out.println("Yellow wins!!");
                            return;
                        }
                        //horizontal
                        else if ((column < 4) && (board[row][column + 1].equals("Y")) && (board[row][column + 2].equals("Y")) && (board[row][column + 3].equals("Y"))){
                            System.out.println("Yellow wins!!");
                            return;
                        }
                        //diag
                        else if ((row > 2) && (column > 2) && (board[row - 1][column - 1].equals("Y")) && (board[row - 2][column - 2].equals("Y")) && (board[row - 3][column - 3].equals("Y"))){
                            System.out.println("Yellow wins!!");
                            return;
                        }
                    }
                }
            }
        }
    }

    public static String[][] insertRedCoin (String[][] arr, int num){
        // inserting red coin into board
        for (int column = 0; column < 7; column++){
            for (int row = 5; row >= 0; row --){
                if ((num == (column + 1)) && (arr[row][column].equals("-"))){
                    arr[row][column] = "R";
                    return arr;
                }
            }
        }
        return arr;
    }

    public static String[][] insertYellowCoin (String[][] arr, int num){
        // inserting yellow coin into board
        for (int column = 0; column < 7; column++){
            for (int row = 5; row >= 0; row --){
                if ((num == (column + 1)) && (arr[row][column].equals("-"))){
                    arr[row][column] = "Y";
                    return arr;
                }
            }
        }
        return arr;
    }

}
