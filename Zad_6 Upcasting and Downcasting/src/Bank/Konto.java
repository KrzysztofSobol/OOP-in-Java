package Bank;

public class Konto {
    private final String nr;
    private double saldo;

    public Konto(String nr) {
        this.nr = nr;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNr() {
        return nr;
    }

    public void wplac(double kwota) { saldo+=kwota; }

    public void wyplac(double kwota){
        saldo-=kwota;
    }
}
