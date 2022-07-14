public class Program {
    public static void main(String[] args) throws Exception {
        int n = 5;
        int position = 1;
        int[] turn = new int [n*n];
        int[][] field = new int[n][n];

        field[4][4] = 1;

        // for (int i = 0; i < 8; i++) {
        //     int m = ChessField.Offset(5, i, n, 0);
        //     int l = ChessField.Offset(5, i, n, 2);
        //     System.out.printf("i=%d, j=%d",m, l);
        //     System.out.println();
        // }
        
        field = ChessField.Field(field, turn, position, n);

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.printf("%d ", field[i][j]);
            }
            System.out.println();
        }

    }
}