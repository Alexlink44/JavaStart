import java.util.Scanner;

public class program {
    public static void main(String[] args) throws Exception {
        System.out.println("Добро пожаловать в калькулятор рациональных и комплексных чисел.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число (с мнимой частью или без неё)");
        String value1 = in.nextLine();
        System.out.print("Введите второе число (с мнимой частью или без неё)");
        String value2 = in.nextLine();
        System.out.println("Введите арифметическую операцию");
        System.out.println("Сложение `+`, вычитаение `-`, умножение `*`, деление `/`");
        String value3 = in.nextLine();
        in.close();
        double[] number1 = Parsere.ParsNum(value1);
        double a = number1[0];
        double bi = number1[1];
        double[] number2 = Parsere.ParsNum(value2);
        double c = number2[0];
        double di = number2[1];
        switch(value3){
            case "+":
            System.out.println(Calculation.Addition(a, c, bi, di));
                break;
            case "-":
            System.out.println(Calculation.Subtraction(a, c, bi, di));
                break;
            case "*":
            System.out.println(Calculation.Multiplication(a, c, bi, di));
                break;
            case "/":
            System.out.println(Calculation.Division(a, c, bi, di));
                break;
        }
    }
}