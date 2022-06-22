
public class WorkingWithArrays {
    public static int [] Fill_1_Sprire(int numberT) {
        int [] array = new int [numberT + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
        
    public static int [] AnySpires(int numberT) {
        int [] array = new int [numberT + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }   
        array[numberT] = numberT + 1;
        return array;
    }
    public static void PrintArray(int array[], int array2[], int array3[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d %d %d \n", array[i], array2[i], array3[i]);

        }
    }
}
