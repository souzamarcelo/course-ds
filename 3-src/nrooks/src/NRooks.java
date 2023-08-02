import java.util.Scanner;

public class NRooks {

    public static int violations(int[][] board) {
        int amount = 0;
        for(int c1 = 0; c1 < board.length; c1++) {
            int foundRow = 0;
            int foundCol = 0;
            for(int c2 = 0; c2 < board[c1].length; c2++) {
                if(board[c1][c2] == 1)
                    foundRow += 1;
                if(board[c2][c1] == 1)
                    foundCol += 1;
            }
            amount += (foundRow * (foundRow - 1)) / 2;
            amount += (foundCol * (foundCol - 1)) / 2;
        }
        return amount;
    }

    public static int violations(int[] board) {
        int amount = 0;
        for(int i = 0; i < board.length - 1; i++)
            for(int j = i + 1; j < board.length; j++)
                if(board[i] == board[j]) amount++;
        return amount;
    }

    public static void evalMatrix() {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            int n = s.nextInt();
            int[][] board = new int[n][n];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    board[i][j] = s.nextInt();
                }
            }
            
            System.out.print(violations(board) + " ");
        }
    }

    public static void evalArray(int mode) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            int n = s.nextInt();
            int[] board = new int[n];

            for(int i = 0; i < n; i++) {
                board[i] = s.nextInt();
            }

            System.out.print(violations(board) + " ");
        }
    }

    public static void show(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void show(int[] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i] == j) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int mode = Integer.parseInt(args[0]);
        
        long runtime = System.currentTimeMillis();
        if(mode == 1) evalMatrix();
        else evalArray(mode);
        runtime = System.currentTimeMillis() - runtime;
        System.out.println("\n\nRunning time: " + runtime / 1000d + " seconds.\n");
    }
}
