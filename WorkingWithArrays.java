
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
    public static void PrintArray(int array[], int array2[], int array3[], int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {System.out.print("T ");}
            else System.out.printf("%d ", array[i]);
            if(array2[i] == value) {System.out.print("T ");}
            else System.out.printf("%d ", array2[i]);
            if(array3[i] == value) {System.out.print("T\n");}
            else System.out.printf("%d\n", array3[i]);
        }
    }
}
