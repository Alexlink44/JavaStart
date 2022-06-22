package JavaStart;

public class HanoiTowers {
    public static void CyclicSolution(int value) {
        int max_weight = value + 1;
        //int spire_1 = max_weight * (max_weight + 1);
        int spire_1 = 1;
        int spire_2 = max_weight;
        int spire_3 = max_weight;
        int[] spire_1_array = new int [value];
        int[] spire_2_array = new int [value];
        int[] spire_3_array = new int [value]; 
        int order_actions = 1;

        while (spire_3 != 1 & spire_1 + spire_2 != 2 * max_weight){
            switch (order_actions) {
                case 1: {order_actions = 2;
                //1-2
                if (spire_1 < spire_2) {}
                else{}
                }
                    break;
                case 2: order_actions = 3;
                //1-3
                    break;
                case 3: order_actions = 1;
                //2-3
                    break;


        }





    }
}
