import java.util.Scanner;

public class PassingGradeSMK1{
    public static void main(String[] args) {
        int matematika, bhsInggris, bhsIndonesia, Ipa;//Variable untuk menyimpan Nilai Ujian.
        int PassingGradeSMK1, PassingGradeSastra, PassingGradeTIK;//Variable untuk menyimpan nilai syarat kelulusan.
        boolean isPassingSMK, isPassingSastra, isPassingTIK;//variabel bertipe boolean untuk menyimpan hasil kelulusan.
        double averageUjian, averageBahasa;

        Scanner input = new Scanner(System.in);

        //Inisialisasi dulu nilai variabel untuk syarat kelulusan
        PassingGradeSMK1 = 70;
        PassingGradeSastra = 98;
        PassingGradeTIK = 82;

        System.out.println("Masukan nilai Ujian Matematika :");
        matematika = input.nextInt ();
        System.out.println("Masukan nilai Ujian Bahasa Inggris :");
        bhsInggris = input.nextInt ();
        System.out.println("Masukan nilai Ujian Bahasa Indonesia :");
        bhsIndonesia = input.nextInt ();
        System.out.println("Masukan nilai Ujian Ipa :");
        Ipa = input.nextInt ();

        //menghitung ratarata nilai ujian
        averageUjian = (matematika + bhsIndonesia + bhsInggris + Ipa)/4;

        //menghitung ratarata nilai bahasa
        averageBahasa = (bhsIndonesia + bhsInggris)/2;

        //membuat boolean expression untuk menentukan kelulusan

        //Menentukan kelulusan masuk SMK
        isPassingSMK = averageUjian >= PassingGradeSMK1;

        //Menentukan kelulusan masuk jurusan Sastra
        isPassingSastra = averageBahasa >= PassingGradeSastra;

        //Menentukan kelulusan masuk jurusan teknik informatika
        isPassingTIK = matematika >= PassingGradeTIK;

       System.out.println("\n\nHasil dari simulasi untuk Persyaratan penerimaan calon siswa di SMKN 1 GARU adalah sebagai berikut :");
       System.out.println("==========================================================================");
       System.out.println("Apakah anda memenuhi Syarat untuk masuk ke SMK1 : " + isPassingSMK);
       System.out.println("Apakah anda memenuhi Syarat untuk masuk ke Jurusan sastra : " + isPassingSastra);
       System.out.println("Apakah anda memenuhi Syarat untuk masuk ke Jurusan Teknik informatika : " + isPassingTIK);

    }
}