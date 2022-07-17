public class Calculation {
    public static String Сalculation(int a, int b, int c, int d) {
        StringBuilder result = new StringBuilder();
        while (b != a & a < b) {
            if (b % c == 0) {
                b = b / c;
                if (a <= b) {
                    result.insert(0, "К1, ");
                }
            } else {
                b = b - d;
                if (a <= b) {
                    result.insert(0, "k2, ");
                }
            }
        }
        result.replace(result.length() - 2, result.length(), ".");
        if (a == b)
            return result.toString();
        else
            return "Нет решения";
    }
}
