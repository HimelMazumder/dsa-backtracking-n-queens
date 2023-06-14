public class NQueens {
    short[][] board;
    short size;

    NQueens(short n) {
        board = new short[n][n];
        this.size = n;
    }

    void showBoard() {
        for (short i = 0; i < size; i++) {
            for (short j = 0; j < size; j++) {
                System.out.printf("%d  ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean isAttacked(short x, short y) {
        for (short i = 0; i < size; i++) {
            for (short j = 0; j < size; j++) {
                if (i == x || j == y) {
                    if (board[i][j] == 1) {
                        return true;
                    }
                } else if ((x + y == i + j) || (x - y == i - j)) {
                    if (board[i][j] == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean activateNQueenAlgorithm(short n) {
        if (n == 0) {
            return true;
        }

        for (short i = 0; i < size; i++) {
            for (short j = 0; j < size; j++) {
                if (isAttacked(i, j)) {
                    continue;
                }

                board[i][j] = 1;
                if (activateNQueenAlgorithm((short) (n - 1))) {
                    return true;
                }

                board[i][j] = 0;
            }
        }

        return false;
    }

}
