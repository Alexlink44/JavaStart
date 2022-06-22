package JavaStart;


public class Task01 {
    public static void task() throws Exception {
        int[] data = WorkingWithFiles.Input();
        // int i = 0;
        // while(i < data.length){
        //     System.out.printf("- %s -\n", data[i]);
        //     i++;
        // }
        double number = 0;
        boolean flag = true;
        if (data[1] == 0) {flag = false;}
        else number = Math.pow(data[1], data[0]);
        WorkingWithFiles.Output(number, flag);
    }
}
