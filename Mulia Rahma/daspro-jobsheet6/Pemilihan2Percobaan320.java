import java.util.Scanner;
public class Pemilihan2Percobaan320 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        //Deklarasi variabel
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input20.nextLine();
        System.out.print("Masukkan Besarnya penghasilan : ");
        penghasilan = input20.nextInt();

        if (kategori.equalsIgnoreCase("kategori")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan -(pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else
            System.out.println("Masukkan Kategori Salah ");
        
    }
}