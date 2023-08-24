import java.util.Scanner;

public class JobVancantion {
    public static void main(String[] args) {
        //Deklarasi variabel yang diperlukan.
        int umur;
        double penampilan;
        String lulusan, nama, jeniskelamin, pengalamananda;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPasssingAdmin;
        Scanner input = new Scanner(System.in);

        // Buat output Text yang dibutuhkan
        System.out.println("Selamat datang di PT. Abdi Jaya 02");
        System.out.println("=====================================\n");
        System.out.println("Silahkan input Data Diri Anda");

        System.out.println("Nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (PRIA/LAKI LAKI) : ");
        jeniskelamin = input.next();

        System.out.println("pengalaman Anda : ");
        pengalamananda = input.next();

        System.out.println("Lulusan (SMK/SMA/D3/S1) : ");
        lulusan = input.next();

        //Pengecekan data untuk persyarataan Manajemen
        /* 
            1. Lulus ujian
            2. Sesuai kualifikasi
            3. Minat dan bakat
            4. Kemampuan finansial
            5. Bakat kepemimpinan
            6. Gemar bersosialisasi
            7. Disiplin
            8. Ahli memecahkan masalah

            Dan

            PRIA/WANITA
            Umur 20 sampai 30
            SMK sampai S1
            Memiliki pengalaman
        */
    //Persyaratan Manajemen 1
    reqKoor1 = jeniskelamin.equalsIgnoreCase("laki laki") && umur >= 25 && umur <=30 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalamananda = 1;

    //Persyaratan Manajemen 2
    reqKoor2 = jeniskelamin.equalsIgnoreCase("pria") && umur >= 20 && (lulusan.equalsIgnoreCase("SMK")) && pengalamananda = 3;

    //Hasil dari Manajemen
    isPassingKoor = reqKoor1 || reqKoor2;

    }
}