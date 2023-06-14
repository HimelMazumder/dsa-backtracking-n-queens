import java.util.Scanner;

public class ApplicationClass {
    public static void main(String[] args) {
        short n;
        Scanner scan = new Scanner(System.in);

        System.out.println("N: ");
        n = scan.nextShort();

        NQueens nQueens = new NQueens(n);
        nQueens.showBoard();
        nQueens.activateNQueenAlgorithm(n);
        nQueens.showBoard();
    }
}
