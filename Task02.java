import java.util.Scanner;

public class Task02 {
    public static int InputData() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите период треугольго числа: ");
        int triangleTNum = in.nextInt();
        in.close();
        return triangleTNum;
    }
    public static int TriangularNumberCalculation(int numberT) {
        int triangleNumber = 0;
        int count  = 1;
        while (count < (numberT + 1)) {
            triangleNumber = triangleNumber + count++;
        }
        return triangleNumber;
    }
}
