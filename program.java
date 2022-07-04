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
        String endResult = "";
        switch(value3){
            case "+":
            endResult = Calculation.Addition(a, c, bi, di);
            endResult = endResult.replace(".0", "");
            System.out.println(endResult);
            
                break;
            case "-":
                endResult = Calculation.Subtraction(a, c, bi, di);
                endResult = endResult.replace(".0", "");
                System.out.println(endResult);
                    break;
            case "*":
                endResult = Calculation.Multiplication(a, c, bi, di);
                endResult = endResult.replace(".0", "");
                System.out.println(endResult);
                    break;
            case "/":
                endResult = Calculation.Division(a, c, bi, di);
                endResult = endResult.replace(".0", "");
                System.out.println(endResult);
                    break;
        }
    }
}