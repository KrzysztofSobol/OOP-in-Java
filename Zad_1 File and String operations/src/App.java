import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Float;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe pliku");
        String file_name = scanner.nextLine();
        file_name+=".txt";
        scanner.close();

        Float max_skutecznosc = (float) -1;

        try{
            File file = new File(file_name);
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                float skutecznosc = Float.parseFloat(parts[3]);
                if(skutecznosc>max_skutecznosc){
                    max_skutecznosc = skutecznosc;
                }
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }

        try{
            File file_in = new File(file_name);
            File file_out = new File("wyniki.max");

            scanner = new Scanner(file_in);
            PrintWriter writer = new PrintWriter(file_out);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                String imie = parts[0];
                String nazwisko = parts[1];
                int wiek = Integer.parseInt(parts[2]);
                float skutecznosc = Float.parseFloat(parts[3]);

                boolean threeOrLonger = imie.length()>3;
                boolean endsWithSki = nazwisko.endsWith("ski");
                boolean isSkutecznoscMax = Float.compare(skutecznosc, max_skutecznosc) == 0;

                if(threeOrLonger && endsWithSki && isSkutecznoscMax){
                    imie = imie.charAt(0) + "*".repeat(imie.length() - 3) + imie.substring(imie.length()-2);
                    nazwisko =  nazwisko.charAt(0) + "*".repeat(nazwisko.length() - 3) + nazwisko.substring(nazwisko.length()-2);

                    writer.println(imie + " " + nazwisko + " " + wiek);
                }
            }
            writer.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}

