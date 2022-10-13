package kategorijos;

public enum PajamuKategorija {

    Atlyginimas(1, "atlyginimas");

    private int nr;
    private String paaiskinimas;

    PajamuKategorija(int i, String p) {
        nr = i;
        paaiskinimas = p;
    }

    public int getNr() {
        return nr;
    }

    public String getPaaiskinimas() {
        return paaiskinimas;
    }

    @Override
    public String toString() {
        return "PajamuKategorija{" +
                "nr=" + nr +
                ", paaiskinimas='" + paaiskinimas + '\'' +
                '}';
    }

    public static PajamuKategorija kategorijaPagalNr (int i) {
        for (PajamuKategorija pk : values()) {
            if (pk.getNr() == 1) {
                return pk;
            }
        }
        return null;
    }


}
