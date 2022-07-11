public class Program {
    public static void main(String[] args) throws Exception {
        int[][] field = Queens.ChessField();
        int[] posQ = new int[8];
        int numQ = 0;
        while(Queens.CheckPositions(field, numQ) & numQ < 8){
            for (int i = 0; i < posQ.length; i++) {
                if(field[i][numQ] == 1) {posQ[numQ]++;}
            } 
            field = Queens.PositionQueens(field, posQ, numQ);
            numQ++;
        }
        Queens.PrintField(field);
    }
}