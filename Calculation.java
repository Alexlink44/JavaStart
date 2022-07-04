public class Calculation {
    public static String Addition(double a, double c, double bi, double di){
        String re = Double.toString(a + c) + " ";
        String im = "";
        if(bi != 0 | di !=0) im=  Double.toString(bi + di) + "i";
        return re + im;
    }

    public static String Subtraction(double a, double c, double bi, double di){
        String re = Double.toString(a - c) + " ";
        String im = "";
        if(bi != 0 | di !=0) im=  Double.toString(bi - di) + "i";
        return re + im;
    }

    public static String Multiplication(double a, double c, double bi, double di){
        String re = Double.toString(a*c - bi * di) + " ";
        String im = "";
        if(bi != 0 | di !=0) im =  Double.toString(bi * c + a * di) + "i";
        return re + im;
    }

    public static String Division(double a, double c, double bi, double di){
        String re = Double.toString((a * c + bi * di)/(c * c + di * di)) + " ";
        String im = "";
        if (bi != 0 | di !=0)im =  Double.toString((bi * c - a * di)/(c * c + di * di)) + "i";
        return re + im;
    }
}
