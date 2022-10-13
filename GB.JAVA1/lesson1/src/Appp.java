public class Appp {
    // BEGIN (write your solution here)
    public static void printMotto() {
        var printMotto = "Winter";
        System.out.println(printMotto);
    }

    public static void gogo() {
        System.out.println("It works!");
    }

    public static void main(String[] args) {
        Appp.printMotto();

        Appp.gogo();

        Appp.greetingWithReturnAndPrinting();

        System.out.println(run());

        System.out.println(Appp.sum(2)); // Kodel negalim iskvesti iskart per class ir metoda Appp.sum?

        var hurray = Appp.sayHurrayThreeTimes();
        System.out.println(hurray);

        String s = "labas";
        getLastChar(s);
    }
    public static String greetingWithReturnAndPrinting() {
        System.out.println("Я появлюсь в консоли");
        return "Winter is coming!";    // Kodel spausdina eilute auksciau? ar cia tas pats su metodu int run?!
    }

    public static int run() {
        return 5;
        //return 10;
    }

    public static int sum(int x) {
        return x + 10;
    }

    public static String sayHurrayThreeTimes() {
        var word = "hurray!";
        return word + " " + word + " " + word;
    }

    public static char getLastChar(String text) {
        String s = "labas";
        // Вычисляем индекс последнего символа как длина строки - 1
        return text.charAt(text.length() - 1);  // Kaip isvesti i console?
    }
}


