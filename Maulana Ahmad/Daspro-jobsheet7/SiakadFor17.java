import java.util.Scanner;
public class SiakadFor17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nilai,tertinggi=0,terendah=100;
        int lulus=0,tidakLulus=0;
        final double batasKelulusan=60.0;//batas kelulusan
        for (int i=1;i<=10;i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+ i +":");
            nilai= sc.nextDouble();
            if (nilai>tertinggi){
                tertinggi=nilai;
            }
            if (nilai<terendah){
                terendah=nilai;
            }
            if(nilai>=batasKelulusan){
                lulus++;
            }else{
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi:"+tertinggi);
        System.out.println("Nilai terendah:"+terendah);
        System.out.println("Jumlah mahasiswa yang lulus:"+lulus );
        System.out.println("Jumlah mahasiswa yang tidak lulus:"+tidakLulus);
        sc.close();
    }

}