package id.ac.uniska;

import javax.swing.*;
import java.awt.*;

public class DataType {

    public static void main(String[] args) {
        String namaDepan = "Pahli";
        String namaTengah = "ana";
        String namaBelakang = "linda";
        int usia = 18;
        int targetTahunKuliah = 4;
        double ipk = 3.8;
        char nilaiAbjad = 'A';
        boolean cantik = true;

        System.out.println("Nama Depan :" +namaDepan);
        System.out.println("Nama Tengah :" +namaTengah);
        System.out.println("Nama Belakang :" +namaBelakang);
        System.out.println("Usia : " +usia);
        System.out.println("Target Tahun Kuliah : " +targetTahunKuliah);
        System.out.println("IPK : " +ipk);
        System.out.println("Nilai PBO : " +nilaiAbjad);
        System.out.println("Cantik : " +cantik);


        JOptionPane.showMessageDialog(null, "Halo"+namaDepan+" "+namaTengah+" "+namaBelakang, "Ini Judul", JOptionPane.WARNING_MESSAGE);
    }
}
