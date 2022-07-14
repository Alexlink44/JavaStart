public class ChessField {
    public static int[][] Field(int[][] field, int[] turn, int position, int n) {
       while (position < n) {
            boolean flag = false;
            while (!flag) {
                int i = 0;
                int j = 0;
                while(field[i][j] != position){
                    j = 0;
                    while(j < turn.length - 1 & field[i][j] != position ){
                        if(field[i][j] == position) break;
                        j++;
                    }
                    if(field[i][j] == position) break;
                    i++;
                }

                int indexI = 0;
                int indexJ = 0;
                while (turn[position] < 8 & field[indexI][indexJ] != 0) {
                    while (turn[position] < 8 & indexI == -1 | indexJ == -1) {
                        indexI = ChessField.Offset(i, turn[position], n, 2);
                        indexJ = ChessField.Offset(i, turn[position], n, 0);
                        turn[position]++;
                    }
                }
                if (turn[position] == 8) {
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
        if (index < 0 | index > n) {
            index = -1;
        }
        return result;
    }

}
