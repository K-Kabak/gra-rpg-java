
import java.io.*;
import java.util.*;

public class driver {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static dice Dmg = new dice();

    public static String NazwaGracza;
    public static int HpGracza;
    public static int MaxHp;
    public static int MaxMana;
    public static int Mana;
    public static int DmgGracza;
    public static int xp;
    public static int HpPrzeciwnika;
    public static int DmgPrzeciwnika;
    public static int Level;
    public static String klasapostaci;
    public static boolean walka = false;

    private static void zapiszGre() {
        try (PrintWriter writer = new PrintWriter("save.txt")) {
            writer.println(NazwaGracza);
            writer.println(klasapostaci);
            writer.println(HpGracza);
            writer.println(MaxHp);
            writer.println(Mana);
            writer.println(MaxMana);
            writer.println(DmgGracza);
            writer.println(xp);
            writer.println(Level);
            System.out.println("Gra została zapisana!");
        } catch (IOException e) {
            System.out.println("Błąd zapisu gry.");
        }
    }

    private static boolean wczytajGre() {
        File plik = new File("save.txt");
        if (!plik.exists()) return false;

        try (Scanner fileScan = new Scanner(plik)) {
            NazwaGracza = fileScan.nextLine();
            klasapostaci = fileScan.nextLine();
            HpGracza = Integer.parseInt(fileScan.nextLine());
            MaxHp = Integer.parseInt(fileScan.nextLine());
            Mana = Integer.parseInt(fileScan.nextLine());
            MaxMana = Integer.parseInt(fileScan.nextLine());
            DmgGracza = Integer.parseInt(fileScan.nextLine());
            xp = Integer.parseInt(fileScan.nextLine());
            Level = Integer.parseInt(fileScan.nextLine());
            System.out.println("Wczytano zapis gry gracza: " + NazwaGracza);
            return true;
        } catch (Exception e) {
            System.out.println("Błąd podczas wczytywania zapisu.");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Nowa gra\n2. Wczytaj zapis");
        String wybor = scan.nextLine();

        if (wybor.equals("2") && wczytajGre()) {
            statystyki();
        } else {
            System.out.println("Nowa gra!\nPodaj imię: ");
            NazwaGracza = scan.nextLine();
            System.out.println("Wybierz klasę: w - wojownik, l - łucznik, m - mag");
            klasapostaci = scan.nextLine();

            while (!klasapostaci.equals("w") && !klasapostaci.equals("l") && !klasapostaci.equals("m")) {
                System.out.println("Wybierz: w/l/m");
                klasapostaci = scan.nextLine();
            }

            switch (klasapostaci) {
                case "w" -> Wojownik();
                case "l" -> Łucznik();
                case "m" -> Mag();
            }
            statystyki();
        }

        while (Level <= 5) {
            fight();
            zapiszGre();
            System.out.println("Pokonałeś przeciwnika, idź dalej!\n");
        }
    }

    private static void statystyki() {
        System.out.println("Statystyki gracza: " + NazwaGracza + " | HP: " + HpGracza + " | Mana: " + Mana);
    }

    private static void Wojownik() {
        MaxHp = HpGracza = 20;
        Mana = MaxMana = 20;
        DmgGracza = 4;
        xp = 0;
        Level = 1;
        klasapostaci = "wojownik";
    }

    private static void Łucznik() {
        MaxHp = HpGracza = 14;
        Mana = MaxMana = 0;
        DmgGracza = 6;
        xp = 0;
        Level = 1;
        klasapostaci = "łucznik";
    }

    private static void Mag() {
        MaxHp = HpGracza = 10;
        Mana = MaxMana = 20;
        DmgGracza = 2;
        xp = 0;
        Level = 1;
        klasapostaci = "mag";
    }

    private static void fight() {
        System.out.println("Symulacja walki...");
        xp += 10;
        if (xp > 20) Level++;
    }
}
