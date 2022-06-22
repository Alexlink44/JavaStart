import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число дисков: ");
        int value = in.nextInt();
        in.close();

        
        int [] array = WorkingWithArrays.Fill_1_Sprire(value);
        HanoiTowers.CyclicSolution(value, array);
        
    }
}
