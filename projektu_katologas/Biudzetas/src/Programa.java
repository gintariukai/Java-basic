import java.util.Scanner;

public class Programa extends Biudzetas {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==Hello Biudzetas!==\n");

        Biudzetas b1 = new Biudzetas();
        System.out.println(meniu());
    }


    private static int meniu() {
        System.out.println("        Meniu \n"+
                "[1] - Ivesti pajamas \n"+
                "[2] - Ivesti islaidas \n"+
                "[3] - Viso pajamu \n"+
                "[4] - Viso islaidu \n"+
                "[5] - Balansas \n"+
                "[6] - Baigti programa ");
        return meniuNr(scanner, 1, 2, 3, 4, 5, 6);
    }

    private static int meniuNr(Scanner scanner, int... meanings ) {
        int numeris = 0;
        boolean neivesta = true;
        while (neivesta) {
            String meniuNumeris = scanner.next();
            try {
                numeris = Integer.parseInt(meniuNumeris);
                if (meanings.length == 0 || arNumerisYraMeniu(meanings, numeris)) {
                    neivesta = false;
                } else {
                    System.out.println("Nezinoma komanda");
                }

            } finally {
                if (!meniuNumeris.matches("^\\d+$"));
            }
            continue;


        }
        switch (numeris) {
            case 1:
                PajamuIrasas pridetiPajamas = new PajamuIrasas();
                pridetiPajamuIrasa();
                pajamos.add(pridetiPajamas);
                break;
            case 2:
                IslaiduIrasas pridetiIslaidos = new IslaiduIrasas();
                pridetiIslaiduIrasa();
                islaidos.add(pridetiIslaidos);
                break;

        }
        return numeris;
    }

    private static boolean arNumerisYraMeniu(int[] numeriuSarasas, int numerisMeniu) {
        boolean ivestasNr = false;
        for (int i : numeriuSarasas) {
            if (i == numerisMeniu) {
                ivestasNr = true;
                break;
            }
        }
        return ivestasNr;
    }
}