package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksiMethod {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-M-yyyy");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "16630020";
        mhs2.nama = "Fadillah";
        mhs2.tanggalLahir = formatTanggal.parse("09-08-2002");

        System.out.println("==================================================================");
        System.out.println("Menggunakan Method");
        System.out.println("==================================================================");

        mhs2.tampilkanIdentitasDiri();

        System.out.println("Usia "+mhs2.nama+ " adalah " +mhs2.hitungUsia()+ " tahun");

        System.out.println(mhs2.hitungKali(7, 9));

        mhs2.sapaNama("Pahliana");
    }
}
