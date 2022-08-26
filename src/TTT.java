
/**
 * If you are unfamiliar with tic-tac-toe, visit https://en.wikipedia.org/wiki/Tic-tac-toe
 * for a description of the game.
 *
 * Note: These comments are in javadoc/doxygen format.
 * Note: Java disables asserts by default.
 */
public class TTT {

    /**
     * Check for a 3-in-a-row winner on a 3x3 board.
     * @param board is the game board
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean winner3x3 ( P board[][] ) {
        //you can assume that you are given a 3x3 board
        assert board != null && board.length == 3 && board[0].length == 3;

        /** @todo add your code here */
        return false;
    }

    /**
     * Check for a 3-in-a-row winner on a 3x5 board.
     * @param board is the game board
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean winner3x5 ( P board[][] ) {
        //you can assume that you are given a 3x5 board
        assert board != null && board.length == 3 && board[0].length == 5;

        /** @todo add your code here */
        return false;
    }

    /**
     * Check for a 3-in-a-row winner on a 9x7 board.
     * @param board is the game board
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean winner9x7 ( P board[][] ) {
        //you can assume that you are given a 9x7 board
        assert board != null && board.length == 9 && board[0].length == 7;

        /** @todo add your code here */
        return false;
    }

    /**
     * extra credit challenge: Check for a winner of arbitrary length on a
     * board of arbitrary size.
     * @param board is the game board
     * @param howMany is the (minimum) number in a row for a winner
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean tic_tac_crazy ( P board[][], int howMany ) {
        //you can assume that you are given a board of arbitrary size.
        // you may assume that it is not "ragged/jagged"
        // (see https://www.geeksforgeeks.org/jagged-array-in-java/).
        assert board != null;

        /** todo add your code here */
        return false;
    }
    /**
     * Change this to true if you wish to try for extra credit.
     * If you don't, I won't check for extra credit.
     */
    public static final boolean checkExtraCredit = false;
}
