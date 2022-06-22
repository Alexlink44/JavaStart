public class Discs {
    public static void Even(int pos1, int pos2, int pos3, int[] spire1, int[] spire2, int[] spire3, int value){
        int order_actions = 1;
        while (spire1[pos1] + spire2[pos2] != 2 * (value + 1)){
            System.out.println("  |");
            System.out.println("  V");
            switch (order_actions) {
                case 1: {order_actions = 2;
                //1-2
                    if (spire1[pos1] < spire2[pos2]) {
                        pos2--;
                        spire2[pos2] = spire1[pos1];
                        spire1[pos1] = 0;
                        pos1++;
                    }
                    else{
                        pos1--;
                        spire1[pos1] = spire2[pos2];
                        spire2[pos2] = 0;
                        pos2++;
                    }
                }   
                        break;
                case 2: {order_actions = 3;
                //1-3
                    if (spire1[pos1] < spire3[pos3]) {
                        pos3--;
                        spire3[pos3] = spire1[pos1];
                        spire1[pos1] = 0;
                        pos1++;
                    }
                    else{
                        pos1--;
                        spire1[pos1] = spire3[pos3];
                        spire3[pos3] = 0;
                        pos3++;
                    }
                }   
                        break;
                case 3: {order_actions = 1;
                //2-3
                    if (spire2[pos2] < spire3[pos3]) {
                        pos3--;
                        spire3[pos3] = spire2[pos2];
                        spire2[pos2] = 0;
                        pos2++;
                    }
                    else{
                        pos2--;
                        spire2[pos2] = spire3[pos3];
                        spire3[pos3] = 0;
                        pos3++;
                    }
                }   
                    break;                
            }
            WorkingWithArrays.PrintArray(spire1, spire2, spire3);
        }
    }
    public static void NotEven(int pos1, int pos2, int pos3, int[] spire1, int[] spire2, int[] spire3, int value) {
        int order_actions = 1;
        while (spire1[pos1] + spire2[pos2] != 2 * (value + 1)){
            System.out.println("  |");
            System.out.println("  V");
            switch (order_actions) {
                case 1: {order_actions = 2;
                //1-3
                    if (spire1[pos1] < spire3[pos3]) {
                        pos3--;
                        spire3[pos3] = spire1[pos1];
                        spire1[pos1] = 0;
                        pos1++;
                    }
                    else{
                        pos1--;
                        spire1[pos1] = spire3[pos3];
                        spire3[pos3] = 0;
                        pos3++;
                    }
                }   
                        break;
                case 2: {order_actions = 3;
                //1-2
                    if (spire1[pos1] < spire2[pos2]) {
                        pos2--;
                        spire2[pos2] = spire1[pos1];
                        spire1[pos1] = 0;
                        pos1++;
                    }
                    else{
                        pos1--;
                        spire1[pos1] = spire2[pos2];
                        spire2[pos2] = 0;
                        pos2++;
                    }
                }   
                        break;
                case 3: {order_actions = 1;
                //2-3
                    if (spire2[pos2] < spire3[pos3]) {
                        pos3--;
                        spire3[pos3] = spire2[pos2];
                        spire2[pos2] = 0;
                        pos2++;
                    }
                    else{
                        pos2--;
                        spire2[pos2] = spire3[pos3];
                        spire3[pos3] = 0;
                        pos3++;
                    }
                }   
                    break;


            }
            WorkingWithArrays.PrintArray(spire1, spire2, spire3);
        }
    }
}
