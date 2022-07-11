public class Program {
    public static void main(String[] args) throws Exception {
        int[][] field = Queens.ChessField();
        int[] posQ = new int[8];
        int numQ = 0;

       
        while(!Queens.CheckPositions(field, numQ)){

            while(numQ < 8){
            int i = 0;
            while(field[i][numQ] == 1){
                posQ[numQ]++;
                i++;
                }
                if(!Queens.CheckPositions(Queens.PositionQueens(field, posQ, numQ), numQ) || posQ[numQ] != 8){
                    posQ[numQ]++;
                }
                
                
                
            }
            numQ++;
            
            field = Queens.PositionQueens(field, posQ, numQ);
        }
        Queens.PrintField(field);
        System.out.println(Queens.CheckPositions(field, numQ));
    }
}