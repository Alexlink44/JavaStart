public class Calculation {
    public static String Addition(double a, double c, double bi, double di){
        String result = Double.toString(a + c) + Double.toString(bi + di) + "i";
        return result;
    }

    public static String Subtraction(double a, double c, double bi, double di){
        String result = Double.toString(a - c) + Double.toString(bi - di) + "i";
        return result;
    }

    public static String Multiplication(double a, double c, double bi, double di){
        String result = Double.toString(a*c - bi * di) + " " + Double.toString(bi * c + a * di) + "i";
        return result;
    }

    public static String Division(double a, double c, double bi, double di){
        String result = Double.toString((a * c + bi * di)/c * c + di * di) + Double.toString((bi * c - a * di)/c * c + di * di);
        return result;
    }
}
