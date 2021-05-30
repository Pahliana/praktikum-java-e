package pertemuan.ke2;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm, nama;
    Date tanggalLahir;

    //procedure
    void tampilkanIdentitasDiri(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("NPM "+this.npm);
        System.out.println("Nama Lengkap "+this.nama);
        System.out.println("Tanggal Lahir " +sdf.format(this.tanggalLahir));
    }
    //function
    int hitungUsia(){
        Calendar tglLahir = Calendar.getInstance();
        tglLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int selisih = hariIni.get(Calendar.YEAR) - tglLahir.get(Calendar.YEAR);
        if(hariIni.get(Calendar.MONTH) < tglLahir.get(Calendar.MONTH)) {
            selisih--;
        }else{
            if(hariIni.get(Calendar.MONTH) == tglLahir.get(Calendar.MONTH)
                &&
                hariIni.get(Calendar.DAY_OF_MONTH) < tglLahir.get(Calendar.DAY_OF_MONTH)) {
                selisih--;
            }
        }
        return selisih;
    }

    double hitungKali(double param1, double param2) // function
    {
        return param1 * param2;
    }

    void sapaNama(String nama)
    {
        JOptionPane.showMessageDialog(
                null," hai "+nama, " Ini Judul ", JOptionPane.WARNING_MESSAGE);
    }
}
