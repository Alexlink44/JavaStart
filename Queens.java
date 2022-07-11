public class Queens {
    public static int[][] ChessField() {
        int[][] field = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                field[i][j] = 0;
                // System.out.print(field[i][j] + "\t");
            }
            // System.out.println("\n\n");
        }
        return field;
    }

    public static int[][] PositionQueens(int[][] field, int[] posQ, int numQ) {
        if (field[numQ][posQ[numQ]] == 0) {
            for (int i = 0; i < field.length; i++) {
                field[i][numQ] = 1;
            }
            for (int j = 0; j < field.length; j++) {
                field[posQ[numQ]][j] = 1;
            }
            int i = numQ - 1;
            int j = posQ[numQ];
            int t = 1;
            while (i > 0 & j > t) {
                field[i][j - t] = 1;
                t++;
                i--;
            }
            i = numQ - 1;
            j = posQ[numQ];
            t = 1;
            while (i > 0 & j + t < 8) {
                field[i][j + t] = 1;
                t++;
                i--;
            }
            i = numQ + 1;
            j = posQ[numQ];
            t = 1;
            while (i < 8 & j > t) {
                field[i][j - t] = 1;
                t++;
                i++;
            }
            i = numQ + 1;
            j = posQ[numQ];
            t = 1;
            while (i < 8 & j + t < 8) {
                field[i][j + t] = 1;
                t++;
                i++;
            }
        }
        return field;
    }

    public static boolean CheckPositions(int[][] field, int numQ) {
        int sum;
        for (int i = numQ + 1; i < field.length; i++) {
            sum = 0;
            for (int j = 0; j < field.length; j++) {
                sum += field[j][i];
                if (sum == 8)
                    return false;
            }
        }
        return true;
    }

    public static void PrintField(int[][] field) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(field[i][j] + "\t");
            }
            System.out.println("\n\n");
        }
    }
}
