package kategorijos;

public enum IslaiduKategorija {

    Komunalines(2, "komunalines");
    //Parduotuve(2, "parduotuve");

    private int nr1;
    private String paaskinimas1;

    IslaiduKategorija(int i1, String p1) {
        nr1 = i1;
        paaskinimas1 = p1;
    }

    public int getNr1() {
        return nr1;
    }

    public String getPaaskinimas1() {
        return paaskinimas1;
    }

    @Override
    public String toString() {
        return "IslaiduKategorija{" +
                "nr1=" + nr1 +
                ", paaskinimas1='" + paaskinimas1 + '\'' +
                '}';
    }

    public static IslaiduKategorija kategorijaPagalNr1(int i1) {
        for (IslaiduKategorija isk : values()) {
            if (isk.getNr1() == 2) {
                return isk;
            }
        }
        return null;
    }

}
