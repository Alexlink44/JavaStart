public class Program {
    public static void main(String[] args) throws Exception {
        int[][] field = Queens.CleanField();
        int[] posQ = new int[8];
        int numQ = 0;
        int workPosition = 0;

        while (workPosition < 8) {
            field = Queens.CleanField();
            for (int i = workPosition + 1; i < 8; i++) {
                posQ[i] = 0;
            }
            for (int i = 0; i < workPosition; i++) {
                field = Queens.PositionQueens(field, posQ, i);
                numQ = i + 1;
            }
            while(posQ[numQ] < 8 && field[posQ[numQ]][numQ] != 0){
                posQ[numQ]++;
            }
            while (posQ[numQ] < 8 && !Queens.CheckPositions(Queens.PositionQueens(field, posQ, numQ), numQ)){
                posQ[numQ]++;
            }

            if (posQ[numQ] != 8){
                field = Queens.PositionQueens(field, posQ, numQ);
                workPosition++;
            }
            else{
                workPosition--;
                posQ[workPosition]++;
            }
        }
        // for (int i = 0; i < posQ.length; i++) {
        //     System.out.println(posQ[i]);
        // }
        String F [][] = new String[8][8];
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F.length; j++) {
                F[i][j] = "X";
        }
        }
        for (int i = 0; i < F.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < F.length; j++) {
                if(posQ[j] == i) {System.out.print("Q  ");}
                else {System.out.printf("%s  ", F[i][j]);}
            }
        }

    }
}