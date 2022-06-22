

import java.io.*;

public class WorkingWithFiles {
    public static int[] Input() throws Exception {
        int[] meaning = new int[2];
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        int e = 0;
        while ((str = br.readLine()) != null) {
            meaning[e] = Integer.parseInt(str.replaceAll("[^0-9-]", ""));
            e++;
        }
        br.close();
        return meaning;

    }

    public static void Output(double data, boolean flag) {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            if (flag == false) {
                fw.append("не определено");
            } else {
                String result = String.format(Double.toString(data));
                result = result.replace(".0", "");
                fw.append(result);
                // fw.append(String.format(Double.toString(data)));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
