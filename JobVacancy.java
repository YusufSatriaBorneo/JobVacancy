import java.util.Scanner;

// mengimpor Scanner ke program

public class JobVacancy{
    public static void main(String [] args){

// deklarasi variabel
    String nama,kelamin,pendidikan;
    int umur,pengalaman,penampilan;
    boolean kordinator,admin; // hanya bisa di penggil menggunakan ekspresi boolean
    double jdkordinator,jdadmin;

// membuat scanner baru
    Scanner keyboard = new Scanner(System.in);

// inisiasi grade yang dibutuhkan
    


// Tampilkan output ke user
    System.out.println("Siapa Namamu ?");
    nama = keyboard.next();

    System.out.println("Berapa Umurmu ?");
    umur = keyboard.nextInt();

    System.out.println("Jenix Kelamin ? (pria/wanita)");
    kelamin = keyboard.next();

    System.out.println("Lulusan ? (SMA/SMK/D3/S1)");
    pendidikan = keyboard.next();

    System.out.println("Pengalaman Bekerja ?");
    pengalaman = keyboard.nextInt();

    System.out.println("Penampilan ? (1-10)");
    penampilan = keyboard.nextInt();

// Operasi Mengatur grade
    
    

// Menampilkan apa yang sudah simpan di variabel
    System.out.println("apakah kamu Lulus Sebagai Koordinator ?" + kordinator);
    // System.out.println("apakah kamu Lulus Sebagai Koordinator ?" + admin);
 
    }
}