import kategorijos.IslaiduKategorija;

import java.time.LocalDateTime;

public class IslaiduIrasas extends Biudzetas{

    private double suma;
    private int islaiduIndeksas;
    private LocalDateTime dateTime;
    private String atsiskaitymoBudas;
    private String bankoKortele;
    private String info;
    private IslaiduKategorija kategorija1;


    public IslaiduIrasas(double suma, int islaiduIndeksas, LocalDateTime dateTime, String atsiskaitymoBudas, String bankoKortele, String info) {
        this.suma = suma;
        this.islaiduIndeksas = islaiduIndeksas;
        this.dateTime = dateTime;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.bankoKortele = bankoKortele;
        this.info = info;
    }

    public IslaiduIrasas() { // todo sukuriau dar viena konstruktoriu, kad neraudonuotu

    }

    public double getSuma() {
        return suma;
    }

    public int getIslaiduIndeksas() {
        return islaiduIndeksas;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public String getBankoKortele() {
        return bankoKortele;
    }

    public String getInfo() {
        return info;
    }

    public IslaiduKategorija getKategorija1() {
        return kategorija1;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas{" +
                "suma=" + suma +
                ", islaiduIndeksas=" + islaiduIndeksas +
                ", dateTime=" + dateTime +
                ", atsiskaitymoBudas='" + atsiskaitymoBudas + '\'' +
                ", bankoKortele='" + bankoKortele + '\'' +
                ", info='" + info + '\'' +
                ", kategorija1=" + kategorija1 +
                '}';
    }
}
