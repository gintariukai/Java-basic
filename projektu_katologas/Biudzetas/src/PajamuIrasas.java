import kategorijos.PajamuKategorija;

import java.time.LocalDate;

public class PajamuIrasas extends Biudzetas {

    private  double suma;
    private int pajamuIndeksas;
    private LocalDate data;
    private String pozymisArIBanka;
    private String papildomaInformacija;

    public PajamuIrasas(double suma, int pajamuIndeksas, LocalDate data, String pozymisArIBanka, String papildomaInformacija, PajamuKategorija kategorija) {
        this.suma = suma;
        this.pajamuIndeksas = pajamuIndeksas;
        this.data = data;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInformacija = papildomaInformacija;
        this.kategorija = kategorija;
    }

    public PajamuIrasas() { // todo sukuriau dar viena konstruktoriu, kad neraudonuotu

    }

    public double getSuma() {
        return suma;
    }

    public int getPajamuIndeksas() {
        return pajamuIndeksas;
    }

    public LocalDate getData() {
        return data;
    }

    public String getPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public String getPapildomaInformacija() {
        return papildomaInformacija;
    }

    private PajamuKategorija kategorija;

    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "suma=" + suma +
                ", pajamuIndeksas=" + pajamuIndeksas +
                ", data=" + data +
                ", pozymisArIBanka='" + pozymisArIBanka + '\'' +
                ", papildomaInformacija='" + papildomaInformacija + '\'' +
                ", kategorija=" + kategorija +
                '}';
    }
}
