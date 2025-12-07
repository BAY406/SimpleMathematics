/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bay
 */
import java.util.Scanner;
public class MainSimple {
    // Aritmatika
    public static int tambah(int a, int b) { return a + b; }
    public static int kurang(int a, int b) { return a - b; }
    public static int kali(int a, int b) { return a * b; }
    public static double bagi(double a, double b) { return a / b; }
    public static int modulus(int a, int b) { return a % b; }
    
    // Kalkulator
    public static void CalCulator() {
        Scanner userInput = new Scanner(System.in);
        int input1,a,b;
        String pilihUlang;
        do {
            String[][] AritMatika = {
                {"Tambah", "[ + ]"},
                {"Kurang", "[ - ]"},
                {"Kali", "[ x ]"},
                {"Bagi", "[ / ]"},
                {"Modulus", "[ % ]"}
            };

            String banner = " │┌────────────┐                      \n"+
                            " └┤ CALCULATOR ├─────────┐               \n"+
                            "  └┬───────────┘         │               \n";


            System.out.print(banner);
            for (int i = 0; i < AritMatika.length; i++) {
                System.out.printf("   │ %d. %-10s %s │%n", (i + 1), AritMatika[i][0], AritMatika[i][1]);
            }
            System.out.println("┌──┴─────────────────────┘");
            System.out.println("│");
            try {
                System.out.print("└┬► ");
                input1 = userInput.nextInt();
            
                if(input1 >= 1 && input1 <= 5) {
                    System.out.print(" │┌────────┐\n");
                    System.out.print(" └┤ HITUNG │\n");
                    System.out.print("  └┬───────┘\n");
                    System.out.print("   ├[Input a]─►");
                    a = userInput.nextInt();
                    System.out.print("  ┌┤\n");
                    System.out.print("  │└[Input b}─►");
                    b = userInput.nextInt();

                    // int hasil = tambah(a,b);
                    double hasil = 0;
                    char operator = ' ';

                    switch (input1) {
                        case 1: hasil = tambah(a, b); operator = '+'; break;
                        case 2: hasil = kurang(a, b); operator = '-'; break;
                        case 3: hasil = kali(a, b); operator = 'x'; break;
                        case 4: hasil = bagi((double)a, (double)b); operator = '/'; break;
                        case 5: hasil = modulus(a, b); operator = '%'; break;
                    }

                    System.out.print("  ├─────┐\n");
                    System.out.print("  │HASIL├─────────┐\n");
                    System.out.print("  └┬────┘      \n");
                    if (hasil % 1 == 0) {
                        System.out.printf(" ┌─┤  %d %c %d = %.0f   \n", a, operator, b, hasil);
                    } else {
                        System.out.printf(" ┌─┤  %d %c %d = %.2f \n", a, operator, b, hasil);
                    }
                    System.out.print(" │ └──────────────┘\n");
                    System.out.print(" ├─► ");

                } else {
                    System.out.print("Input Yang Anda Masukkan Salah Atau Tidak Ada Di Menu");
                }
            } catch(Exception e) {
                System.out.println("Error: Masukkan Aangka!\nError: " + e);
            }
            // --- LOGIKA PENGULANGAN ---
            System.out.print("Ingin mengulang lagi? (y/n): ");
            pilihUlang = userInput.next(); // Mengambil input "y" atau "n"
        } while ("y".equals(pilihUlang));
        System.out.println("Terima kasih telah menggunakan Calculator!");
    }

    // Mathematics Menu
    public static int Persegi(int sisi) {
        return sisi * sisi;
    }

    public static int persegiPanjang(int p, int l) {
        return p * l;
    }

    public static double Segitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static int jajarGenjang(int alas, int tinggi) {
        return alas * tinggi;
    }

    public static double belahKetupat(double a, double b) {
        return 0.5 * a * b;
    }

    // Main
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input1,a,b;
        String pilihUlang;
        do {
            String[] menu = {
                    "Calculator",
                    "Persegi",
                    "Persegi Panjang",
                    "Segitiga",
                    "Belah Ketupat",
                    "Jajar Genjang",
                    "Quit"
            };

            // Menampilkan menu dengan looping
            String banner = "  ┌───────────────────────────────┐ \n" + //
                            "  │ Name: Ubay Kopling            │ \n" + //
                            "  │ NIM : 999999999999            │ \n" + //
                            "┌─┤                               │ \n" + //
                            "│ │ Name: Ubay Kopling            │ \n" + //
                            "│ │ NIM : 999999999999            │ \n" + //
                            "│ └───────────────────────────────┘ \n" + //
                            "│┌────────┐                           \n" + //
                            "└┤- MENU -├──────────────────────┐\n" + //
                            " └┬───────┘                      │\n"; //
            String banner2 = "  _________.__               .__       ___________.__    .__        \n"+
                             " /   _____/|__| _____ ______ |  |   ___\\__    ___/|  |__ |__| ____  \n"+
                             " \\_____  \\ |  |/     \\\\____ \\|  | _/ __ \\|    |   |  |  \\|  |/ ___\\ \n"+
                             " /        \\|  |  Y Y  \\  |_> >  |_\\  ___/|    |   |   Y  \\  \\  \\___ \n"+
                             "/_______  /|__|__|_|  /   __/|____/\\___  >____|   |___|  /__|\\___  >\n"+
                             "        \\/          \\/|__|             \\/              \\/        \\/ \n";
            System.out.print(banner2);
            System.out.print(banner);
            // Loop menampilkan isi menu
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("  │ %d. %-20s      │%n", (i + 1), menu[i]);
            }
            System.out.println("┌─┴──────────────────────────────┘");
            System.out.println("│                                ");
        
            System.out.print("└┬► ");
            input1 = userInput.nextInt();
        
            switch (input1) {
                case 1:
                    CalCulator();
                    break;
                case 2:
                    System.out.print("  ├[Input Sisi]─► ");
                    a = userInput.nextInt();
                    int persegi = Persegi(a);
                    System.out.print(" ├─────┐\n");
                    System.out.print(" │HASIL├─────────┐\n");
                    System.out.print(" └┬────┘         \n");
                    System.out.printf("  │ %d x %d = %d%n", a, a, persegi);
                    System.out.print("┌─┤              \n");
                    System.out.print("│ └──────────────┘\n");
                    System.out.print("└┬► ");
                    break;
                case 3:
                    System.out.print("  ├[Input Panjang]─► ");
                    a = userInput.nextInt();
                    System.out.print(" ┌┤\n");
                    System.out.print(" │└[Input Lebar]─► ");
                    b = userInput.nextInt();
                    int persegiP = persegiPanjang(a,b);
                    System.out.print(" ├─────┐\n");
                    System.out.print(" │HASIL├─────────┐\n");
                    System.out.print(" └┬────┘         \n");
                    System.out.printf("  │ %d x %d = %d%n", a, b, persegiP);
                    System.out.print("┌─┤              \n");
                    System.out.print("│ └──────────────┘\n");
                    System.out.print("└┬► ");
                    break;
                case 4:
                    System.out.print("  ├[Input Alas]─► ");
                    a = userInput.nextInt();
                    System.out.print(" ┌┤\n");
                    System.out.print(" │└[Input Tinggi]─► ");
                    b = userInput.nextInt();
                    double segitiga = Segitiga(a,b);
                    System.out.print(" ├─────┐\n");
                    System.out.print(" │HASIL├─────────┐\n");
                    System.out.print(" └┬────┘         \n");
                    System.out.printf("  │ %d x %d = %.2f%n", a, b, segitiga);
                    System.out.print("┌─┤              \n");
                    System.out.print("│ └──────────────┘\n");
                    System.out.print("└┬► ");
                    break;
                case 5:
                    System.out.print("  ├[Input d1]─► ");
                    a = userInput.nextInt();
                    System.out.print(" ┌┤\n");
                    System.out.print(" │└[Input d2]─► ");
                    b = userInput.nextInt();
                    double belahK = belahKetupat(a,b);
                    System.out.print(" ├─────┐\n");
                    System.out.print(" │HASIL├─────────┐\n");
                    System.out.print(" └┬────┘         \n");
                    System.out.printf("  │ %d x %d = %.2f%n", a, b, belahK);
                    System.out.print("┌─┤              \n");
                    System.out.print("│ └──────────────┘\n");
                    System.out.print("└┬► ");
                    break;
                case 6:
                    System.out.print("  ├[Input Alas]─► ");
                    a = userInput.nextInt();
                    System.out.print(" ┌┤\n");
                    System.out.print(" │└[Input Tinggi]─► ");
                    b = userInput.nextInt();
                    int jajarG = jajarGenjang(a,b);
                    System.out.print(" ├─────┐\n");
                    System.out.print(" │HASIL├─────────┐\n");
                    System.out.print(" └┬────┘         \n");
                    System.out.printf("  │ %d x %d = %d%n", a, b, jajarG);
                    System.out.print("┌─┤              \n");
                    System.out.print("│ └──────────────┘\n");
                    System.out.print("└┬► ");
                    break;
                case 7:
                    String kalimat1 = " └► Terima kasih telah ";
                    String kalimat2 = "menggunakan SimpleThic!";
                    String gabung = kalimat1.concat(kalimat2);
                    System.out.println(gabung);
                    System.exit(0);
                default:
                    System.out.print("Input Yang Anda Masukkan Salah Atau Tidak Ada Di Menu");
                    break;
            }
            System.out.print("Ingin mengulang lagi? (y/n): ");
            pilihUlang = userInput.next(); // Mengambil input "y" atau "n"
        } while ("y".equals(pilihUlang));
        String kalimat1 = " └► Terima kasih telah ";
        String kalimat2 = "menggunakan SimpleThic!";
        String gabung = kalimat1.concat(kalimat2);
        System.out.println(gabung);
    }
}