
public class HanoiTowers {
    public static void CyclicSolution(int value, int [] spire1) {
        int pos1 = 0;
        int pos2 = value;
        int pos3 = value;
        int[] spire2 = WorkingWithArrays.AnySpires(value);
        int[] spire3 = WorkingWithArrays.AnySpires(value); 
        
        WorkingWithArrays.PrintArray(spire1, spire2, spire3, value + 1);
        if(value%2 == 0){
            Discs.Even(pos1, pos2, pos3, spire1, spire2, spire3, value);
        }
 
        else{
            Discs.NotEven(pos1, pos2, pos3, spire1, spire2, spire3, value);
        }
    }
}   
