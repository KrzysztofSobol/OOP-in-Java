import Bank.Bank;
import Bank.Types.DuzaFirma;
import Bank.Types.Firma;
import Bank.Types.Osoba;
import Bank.Types.WaznaOsoba;
import Bank.Konto;
import Bank.Klient;


public class Main {
    public static double SumaSrodkowKont(Bank bank, Class klasa){
        double suma = 0;
        for(Klient klient : bank.getKlienci()){
            if(klient.getClass().equals(klasa)){
                for(Konto konto : klient.getKonta()){
                    suma += konto.getSaldo();
                }
            }
        }
        return suma;
    }

    public static double Suma_Osoby_Fizyczne(Bank bank){
        return SumaSrodkowKont(bank, Osoba.class) + SumaSrodkowKont(bank, WaznaOsoba.class);
    }

    public static double Suma_Firmy(Bank bank){
        return SumaSrodkowKont(bank, Firma.class) + SumaSrodkowKont(bank, DuzaFirma.class);
    }

    public static double Suma_DuzeFirmy_WazneOsoby(Bank bank){
        return SumaSrodkowKont(bank, DuzaFirma.class) + SumaSrodkowKont(bank, WaznaOsoba.class);
    }


    public static void main(String[] args) {
        Bank bank = new Bank();

        Osoba osoba = new Osoba("Krzysztof", "Sobolewski", "1010101010");
        WaznaOsoba Waznaosoba = new WaznaOsoba("Pani", "Duda", "1234567890");
        Firma firma = new Firma("Pierkarnia", "962163972");
        DuzaFirma Duzafirma = new DuzaFirma("Windows", "162343992");

        /// Konta dla osoby
        Konto konto1 = new Konto("0001");
        Konto konto2 = new Konto("0002");

        osoba.dodajKonto(konto1);
        osoba.dodajKonto(konto2);
        bank.dodajKlienta(osoba);

        konto1.wplac(1000.32);
        konto2.wplac(9000.51);
        konto2.wyplac(1000);

        /// Konto dla waznej Osoby
        Konto konto3 = new Konto("0003");

        Waznaosoba.dodajKonto(konto3);
        bank.dodajKlienta(Waznaosoba);

        konto3.wplac(1000.16);
        konto3.wyplac(500.16);


        /// Konta dla firmy
        Konto konto4 = new Konto("0004");
        Konto konto5 = new Konto("0005");
        Konto konto6 = new Konto("0006");

        firma.dodajKonto(konto4);
        firma.dodajKonto(konto5);
        firma.dodajKonto(konto6);
        bank.dodajKlienta(firma);

        konto4.wplac(10000);
        konto5.wyplac(1000);
        konto5.wplac(500);
        konto6.wplac(500);

        /// Konto dla Duzej Firmy
        Konto konto7 = new Konto("0007");

        Duzafirma.dodajKonto(konto7);
        bank.dodajKlienta(Duzafirma);

        konto7.wplac(12345);

        System.out.println("Suma srodkow firm: " + Suma_Firmy(bank));
        System.out.println("Suma srodkow osob fizycznych: " + Suma_Osoby_Fizyczne(bank));
        System.out.println("Suma srodkow duzych firm i waznych osob: " +  Suma_DuzeFirmy_WazneOsoby(bank));
        System.out.println("Suma srodkow zwyklych osob: " + SumaSrodkowKont(bank, Osoba.class));

    }
}