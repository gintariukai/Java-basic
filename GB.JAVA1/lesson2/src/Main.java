import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Gintaras!");
        invertArray();
        invertArray1();
        fillArray();
        changeArray();
        fillDiagonal();
        findMinMax();

    }

// 1.упражнение
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("End");
    }

    public static void invertArray1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr)); // вывод до обработки, заданное условие
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ==0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr)); // полученное число после обработки

    }

// 2.упражнение
    public static void fillArray(){
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

// 3.упражнение

    public static void changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(w));
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(w));
    }

// 4.упражнение

    public static void fillDiagonal() {
        int[][] n = new int[4][4];
 /*       for (int[] ints : n){
            System.out.println(Arrays.toString(ints));
        }
 */
        for (int i = 0; i < n.length; i++){
            n[i][i] = 1;
            n[i][n.length - i -1] = 1;
        }
        System.out.println();
        for (int[] ints : n) {
            System.out.println(Arrays.toString(ints));
        }
    }

// 5.упражнение

    public static void findMinMax() {
        int[] g = { 5, -2, 10, 0, -7, -9, 3};
        int minVal;
        int maxVal;
        System.out.println(Arrays.toString(g));

        if (g.length >= 0) {
            minVal = g[0];
            maxVal = g[0];
            if (g.length > 0) {
                for (int i = 1; i < g.length; i++){
                    if (g[i] < minVal) minVal = g[i];
                    if (g[i] > maxVal) maxVal = g[i];
                }
            }
            System.out.println("MinVal = " + minVal);
            System.out.println("MaxVal = " + maxVal);
        }

    }

}
