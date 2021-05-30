package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-M-yyyy");

        mhs.npm = "17710033";
        mhs.nama = "Farida Norlita";
        mhs.tanggalLahir = formatTanggal.parse("17-01-1994");

        System.out.println("NPM " +mhs.npm);
        System.out.println("Nama " +mhs.nama);
        System.out.println("Tanggal Lahir "+formatTanggal.format(mhs.tanggalLahir));


        System.out.println("==================================================================");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "16630020";
        mhs2.nama = "Fadillah";
        mhs2.tanggalLahir = formatTanggal.parse("09-08-2002");

        System.out.println("NPM " +mhs2.npm);
        System.out.println("Nama " +mhs2.nama);
        System.out.println("Tanggal Lahir "+formatTanggal.format(mhs2.tanggalLahir));

        System.out.println("==================================================================");
        System.out.println("Menggunakan Method");
        System.out.println("==================================================================");

        mhs.tampilkanIdentitasDiri();


    }
}
