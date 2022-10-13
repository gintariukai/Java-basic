import java.util.Scanner;
import java.util.Random;

public class MainNumber {

// 1.упражнение

    static Scanner scanner;
    static Random random;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        random = new Random();

    //    lessMoreGame();
//        guessGame();
        guessWordGame();

    }

    public static void lessMoreGame() {

        do {
            System.out.println("Ваша задача отгадать число от 0 до 9, за 3 попытки.");
            if (lessMoreGameIterat( random.nextInt(10) ) ) {
                System.out.println("Вы угадули!");
            } else {
                System.out.println("Вы проиграли!");
            }
            System.out.println("Повторить игру еще раз? \n1 - да, 0 - нет");

        } while (scanner.nextInt() !=0);
    }

    public static boolean lessMoreGameIterat(int num) {

        int userVal;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Осталось попыток: %d\n ", (3 - i));
            System.out.print("Ваше число: ");
            userVal = scanner.nextInt(10);
            if (printLessMore(userVal, num)) {
                return true;
            }
        }
        System.out.printf("Загаданое число: %d\n ", num);
        return false;
    }

    public static boolean printLessMore(int a, int b) {

        switch (Integer.signum(a - b)) {
            case -1: {
                System.out.println("Ваше число меньше загаданного.");
                return false;
            }
            case 1: {
                System.out.println("Ваше число больше загаданного.");
                return false;
            }
            default: {
                System.out.println("Ваше число совпадает с загаданного.");
                return true;
            }
        }
    }

// 2. упражнение

    public static void guessWordGame() {

        String[] words = {"apple", "orange", "lemon", "apricot", "avocado", "banana", "broccoli", "carrot", "cherry", "garlic", "grape", "kiwi", "leak", "melon", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pineapple", "potato"};
        do {
            guessWordGameIterat(words[ random.nextInt(words.length)]);
            System.out.println("\nПовторить игру еще раз? \n1 - да, 0 - нет");
        } while (scanner.nextInt() !=0);
    }

    public static void guessWordGameIterat(String guessWord) {

        boolean[] guessPosition = new boolean[guessWord.length()];
        String userInput;
        System.out.println("Компьютер загадал слово, Попробуй угадать это слово. \nИли введите 0, чтобы закончить игру.");
        do {
            printGuessWordMask(guessWord, guessPosition);
            System.out.println("Введите слово: ");
            userInput = scanner.next();

            if (userInput.equals("0")) {
                System.out.println("Поздравляем! Вы угадали слово.");
                break;
            }

            if (checkWordLeters(guessWord, userInput, guessPosition)) {
                System.out.println("Вы угадали позицию одной или нескольских букв!");
            }

        } while (!isAllLetersGuess(guessPosition));
        System.out.printf("Загаданное слово: %s\n\n", guessWord);
    }

    public static boolean isAllLetersGuess(boolean[] guess) {

        for (int i = 0; i < guess.length; i++ ) {
            if (!guess[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printGuessWordMask(String word, boolean[] guess) {

        for (int i = 0; i < 10; i++) {
            if ((i < guess.length) && (guess[i])) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static boolean checkWordLeters(String guessWord, String userGuess, boolean[] guess) {

        boolean contains = false;
        for (int i = 0; i < (userGuess.length() <= guessWord.length() ? userGuess.length() : guessWord.length()); i++) {
            if (guessWord.charAt(i) == userGuess.charAt(i) && !guess[i]) {
                contains = true;
                guess[i] = true;
            }
        }
        return contains;
    }

}
