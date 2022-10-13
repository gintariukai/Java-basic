public class FirstApp {

// дз
// 1. упражнение
    public static void main(String[] args) {
        System.out.println("Hello, Gintaras! Today is the 2020.06.16 ");

// 2. упражнение
        byte one = 126; // 8-битное знаковое целое число
        short val1 = 32766; // 16-битное знаковое целое число
        int number = 2147483646; // 32-битное знаковое целое число
        long l = 9223372036854775806L; // 64-битное знаковое целое число
        float fl = 12.22f; // 32-битное знаковое число с плавающей запятой одинарной точности
        double dbl = 123.122; // 64-битное знаковое число с плавающей запятой двойной точности
        char val2 = 'T';
        char val3 = '\u2241'; // 16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
        boolean no = false;
        boolean yes = true; // логический тип данных (false, true)

        int a = 2 + 2;
        System.out.println(a);


        float b = 3f / 4f;
        System.out.println(b);

        double c = 3D / 7D;
        System.out.println(c);

        int d = 10;
        int divider = 0;
        int e = 5;
        if (divider != 0) {
            e = d / divider;
        } else {
            System.out.println("Attempt division by zero");

        }

// 3. упражнение

        float x, z, k, g;
        x = z = k = g = 2.5f;
        float result = x * (z + (k / g));
        System.out.println("result =" + result);

        int a1;
        int b1;
        int c1;
        int d1;
        int x1;
        a1 = b1 = c1 = d1 = 2;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);
        System.out.println("d1 = " + d1);
        x1 = a1 * (b1 + (c1 / d1));
        System.out.println("x1 = a1*(b1+(c1/d1)) = " + x1);

    }

    public static int calculExper(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

// 4. упражнение

    public static boolean checkSummVal(int a, int b) {
        int summVal;
        summVal = a + b;
        return (summVal >= 10 && summVal <= 20);
        /* почему бросает ошибку когда всавляю цифры для проверки?
    public static boolean checkSummVal(String[] args) {
        int a = 7;
        int b = 5;
        int summVal;
        summVal = a + b;
        return (summVal >= 10 && summVal <= 20);
        System.out.println("summVal");
         */
    }

// 5. упражнение

    public static void isPositOrNegat(int x) {
        if(x < 0){
            System.out.println("отрицательное");
        } else {
            System.out.println("положительное");
        }
    }

    public static void isPositiveOrNegative(String[] args) {
        int a = -5;
        if(a < 0){
            System.out.println("отрицательное"); //почему не выводит ответ?
        } else {
            System.out.println("положительное");
        }
    }

// 6. упражнение

    public static boolean isNegativ(int value) {
        return (value < 0);

    }

// 7. упражнение

    public static void greetings(String name) {
        System.out.println("Привет, " + name);
    }

// 8. упражнение

    public static void printYear(int year) {
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        //((условие1 && условие2) || условие3)
        if ((year % 4 == 0) &&((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("");
        } else {
            System.out.println("");
        }

    }




}

