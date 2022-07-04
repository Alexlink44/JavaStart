//import java.io.*;
public class Parsere {
    public static double[] ParsNum(String number){
        int sign;
        number = number.replaceAll("[^0-9+-]", "");
        System.out.println(number);
        if (number.indexOf("+") != -1) {sign = 1;}
        else if (number.indexOf("-") != -1) {sign = 2;}
        else sign = -1;
        //System.out.println(sign);
        double[] dubRes = new double[2];
        if(sign == -1){
            dubRes[0] = Double.parseDouble(number);
            dubRes[1] = 0;
        }
        else{
            number = number.replace('+', '!');
            String delimeter = "!";
            if (sign == 2) {delimeter = "-";}
            
            String[] splitRes = number.split(delimeter);
              
            for (int i = 0; i < dubRes.length; i++) {
                dubRes[i] = Double.parseDouble(splitRes[i]);
                //System.out.println(splitRes[i]);
            }
        }
        if(sign == 2) {dubRes[1] = dubRes[1] * (-1);}
       return dubRes;
    }

}
