import java.util.Scanner;

public class Siakad18 {
    public static void main(String[] args) {
        //deklarasi Scanner untuk input
        Scanner sc + new Scanner (System.in);

        //deklarasi variabel
        
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        //perintah memasukkan nilai variabel
        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan Nim: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        //perintah untuk menghitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + " Nim: " +nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        sc.close();
    }
}