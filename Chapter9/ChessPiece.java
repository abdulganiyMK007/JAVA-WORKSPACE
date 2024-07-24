package Chapter9;

import java.util.ArrayList;

public class ChessPiece {

    private String[][] board;
    private String pieceSymbol;
    

    private static final int BOARD_SIZE = 8;

    private static final char HIGHEST_ROW_INIT = 'h';
    private static final char LOWEST_ROW_INIT = 'a';
    private static final char HIGHEST_COL_INIT = '8';
    private static final char LOWEST_COL_INIT = '1';

    private static final char EMPTY_SPOT_SYMBOL = '-';

    public ChessPiece(String pieceSymbol) {
        initBoard();
        this.pieceSymbol = pieceSymbol;
    }

    public ArrayList<String> canMoveTo() {
        ArrayList<String> spots = new ArrayList<String>();



        return spots;
    }

    public int setPosition(String coordinates) {
        if (!isValidPosition(coordinates))
            return -1; // return -1 if coordinates is invalid

        int ch_row = BOARD_SIZE - 1 - (HIGHEST_ROW_INIT - coordinates.charAt(0));
        int ch_col = BOARD_SIZE - 1 - (coordinates.charAt(1) - LOWEST_COL_INIT);

        if (isSpotOccupied(ch_row, ch_col))
            return -2; // return -2 if coordinates is filled
        board[ch_col][ch_row] = pieceSymbol;

        return 1;
    }

    public String getCoordinates(int irow, int icol) {
        char scol, srow;
        scol = srow = EMPTY_SPOT_SYMBOL;

        if (icol >= 0 && icol < BOARD_SIZE) {
            scol = (char) (icol + LOWEST_ROW_INIT);
        }

        if (irow >= 0 && irow < BOARD_SIZE) {
            srow = (char) (HIGHEST_COL_INIT - irow);
        }

        return scol + "" + srow;
    }

    public boolean isValidPosition(String coordinates) {
        char ch_row = coordinates.charAt(0);
        char ch_col = coordinates.charAt(1);

        boolean isValidRow = (ch_row >= LOWEST_ROW_INIT && ch_row <= HIGHEST_ROW_INIT);
        boolean isValidCol = (ch_col >= LOWEST_COL_INIT && ch_col <= HIGHEST_COL_INIT);

        return isValidRow && isValidCol;
    }

    public boolean isSpotOccupied(int ch_row, int ch_col) {
        return board[ch_col][ch_row].equals(EMPTY_SPOT_SYMBOL);
    }

    private void initBoard() {
        board = new String[BOARD_SIZE][BOARD_SIZE];

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_SPOT_SYMBOL + "";
            }
        }
    }

    public void printBoard() {
        String boardStr = "";

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                boardStr += "[" + board[i][j] + "]";
            }
            boardStr += "\n";
        }

        System.out.println(boardStr);
    }

}
