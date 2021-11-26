import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // размер массива
        int m = Integer.parseInt(args[1]); // интервал длины

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> interval = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();

        // заполняем массив
        for (int i = 0; i < n; i++) {
            arrayList.add(i + 1);
        }
        boolean isFinished = false;
        //обходим массив интервалами размера m
        for (int i = 0; i < n && !isFinished; i++) {
            interval.add(arrayList.get(i));
            if (interval.size() == m) {
                path.add(interval.get(0));
                if (path.get(0).equals(interval.get(m - 1)) ) {
                    isFinished = true;
                }
                interval.clear();
                interval.add(arrayList.get(i));

            }
            //проходим массив заново
            if (i == n - 1){
                i = -1;
            }

        }

        System.out.println(path.toString().replaceAll("\\[|,|\\]|\\s",""));
    }
}
