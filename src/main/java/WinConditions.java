public class WinConditions {
    private static final int[][] WIN_LINES = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // columns
            {0,4,8}, {2,4,6}           // diagonals
    };

    /** Returns 'X'/'O' if winner, 'T' if tie, ' ' if game continues */
    public static char checkWin(char[] board) {
        // winner?
        for (int[] line : WIN_LINES) {
            int a = line[0], b = line[1], c = line[2];
            char v = board[a];
            if (v != ' ' && v == board[b] && v == board[c]) {
                return v;
            }
        }
        // any empty?
        for (char cell : board) {
            if (cell == ' ') return ' ';
        }
        // full board, no winner
        return 'T';
    }
}
