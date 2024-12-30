import java.util.Scanner;

public class Pemilihan2Percobaan118 {
    public static void main(String[] args) {
        
        //membuat scanner dengan identitas absen
        Scanner input18 = new Scanner(System.in);

        //menerima inputan dari keyboard untuk tahun
        System.out.println("Masukkan tahun: ");
        int tahun = input18.nextInt();

        //struktur kondidi untuk menentukan tahun kabisat
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) 
                    System.out.println("Tahun Kabisat.");
                } else 
                    System.out.println("Bukan Tahun Kabisat.");
    }
}