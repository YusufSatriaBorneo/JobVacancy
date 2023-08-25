import java.util.Scanner;

// mengimpor Scanner ke program

public class JobVacancy{
    public static void main(String [] args){

// deklarasi variabel
    String nama,kelamin,lulusan; // Bener
    int umur,pengalaman;
    boolean IsAdmin,IsKordinator;
    boolean CrAdmin1,CrAdmin2,CrKordinator1,CrKordinator2;
    double penampilan;

// membuat scanner baru
    Scanner keyboard = new Scanner(System.in); // untuk inputan user

// Mengatur inisialisasi

// Tampilkan output ke user
    System.out.println("Siapa Namamu ?");
    nama = keyboard.next();

    System.out.println("Berapa Umurmu ?");
    umur = keyboard.nextInt();

    System.out.println("Jenis Kelamin anda ? (pria/wanita)");
    kelamin = keyboard.next();

    System.out.println("Lulusan ? (SMK/D3/S1)");
    lulusan = keyboard.next();

    System.out.println("Pengalaman Bekerja Berapatahun?");
    pengalaman = keyboard.nextInt();

    System.out.println("Penampilan ? (1-10)");
    penampilan = keyboard.nextDouble();

// alogirtma boolean Kordinator

    CrKordinator1 = kelamin.equalsIgnoreCase("pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("smk") || lulusan.equalsIgnoreCase("d3")) && pengalaman >= 2;

    CrKordinator2 = kelamin.equalsIgnoreCase("pria") && umur >= 30 && lulusan.equalsIgnoreCase("s1") && pengalaman >= 5;

    IsKordinator = CrKordinator1 || CrKordinator2;

// alogirtma boolean Admin

    CrAdmin1 = kelamin.equalsIgnoreCase("wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("d3") && (pengalaman >= 1 || penampilan >= 8.5); // tiap atau harus pake tanda kurung

    CrAdmin2 = kelamin.equalsIgnoreCase("wanita") && umur >= 25 && lulusan.equalsIgnoreCase("s1") && penampilan >= 8.5 && pengalaman >= 5;

    IsAdmin = CrAdmin1 || CrAdmin2;

// Menampilkan apa yang sudah simpan di variabel
    System.out.println("Selamat : " + nama);
    System.out.println("apakah kamu Lulus Sebagai Koordinator ?" + IsKordinator);
    System.out.println("apakah kamu Lulus Sebagai Admin ?" + IsAdmin);
    }
}
