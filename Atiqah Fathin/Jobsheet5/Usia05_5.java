import java.util.Scanner;

public class Usia05_5 {
    
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Usia Anda :=");
        int usia;

        System.out.print("Masukkan Usia : ");
        usia = input.nextInt();

        if (usia >= 0 && usia <=12){
            System.out.println("Kategori usia: Anak");
        }
        else if (usia >= 13 && usia <=19){
            System.out.println("Kategori usia: Remaja");
        }
        else if (usia >= 20 && usia <=64){
            System.out.println("Kategori usia: Dewasa");
        }
        else if (usia >=65){
            System.out.println("Kategori usia: Lansia");
        }
        else {
            System.out.println("Tidak valid, Masukkan angka positif.");
        }
        input.close();
    }
}
