import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("player " + player + " enter : ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println();

            if (board[row][col] == ' ') {
                board[row][col] = player;//place the element
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("player " + player + " has won: ");
                } else {
//                    if (player == 'X') {
//                        player = 'o';
//                    } else {
//                       player ='X';
//                    }
                    player = (player == 'X') ? 'o' : 'X';
                }
            } else {
                System.out.println("invalid move. try again!");
            }
        }
    }

    public static boolean haveWon(char[][] board, char player) {
// check the row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // check the row
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

// diagonal
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    public static void printBoard ( char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "  ");
            }
            System.out.println();
        }
    }
}