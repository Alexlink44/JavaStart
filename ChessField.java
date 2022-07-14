public class ChessField {
    public static int[][] Field(int[][] field, int[] turn, int position, int n) {
       while (position < n*n) {
            boolean flag = false;
            while (!flag) {
                int i = 0;
                int j = 0;
                while(field[i][j] != position){
                    j = 0;
                    while(j < n - 1 & field[i][j] != position ){
                        if(field[i][j] == position) break;
                        j++;
                    }
                    if(field[i][j] == position) break;
                    i++;
                }

                int indexI = ChessField.Offset(i, turn[position], n, 2);
                int indexJ = ChessField.Offset(j, turn[position], n, 0);
                turn[position]++;
                if(indexI != -1 & indexJ != -1){
                    if(field[indexI][indexJ] == 0) flag = true;}
                while (indexI == -1 | indexJ == -1 | flag == false) {
                    indexI = ChessField.Offset(i, turn[position], n, 2);
                    indexJ = ChessField.Offset(j, turn[position], n, 0);
                    if(indexI != -1 & indexJ != -1){
                        if(field[indexI][indexJ] == 0) flag = true;
                    }
                    turn[position]++;
                    if(turn[position] > 8) break;
                }
                flag = false;
                if (turn[position] > 8) {
                    field[i][j] = 0;
                    turn[position] = 0;
                    position--;
                } else {
                    position = position + 1;
                    field[indexI][indexJ] = position;
                    flag = true;
                }
            }
        }

        return field;

    }

    public static int Offset(int index, int turn, int n, int p) {
        turn += p;
        int result = 0;
        int k = -1;
        int h = 2;
        int j = -1;
        int b = 0;
        int i = 0;
        while (i < turn + 1) {
            result = index + k;
            k += h;
            h += j;
            i++;
            b++;
            if (b == 4) {
                b = 0;
                j = j * (-1);
            }
        }
        if (result < 0 | result >= n) {
            result = -1;
        }
        return result;
    }

}
