/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pkbud;

/**
 *
 * @author lenovo
 */
public class Hsf {
    

    public static void main(String[] args) {

        Tugas_PkBud bangun = new Tugas_PkBud();

        System.out.println("======================================");
        System.out.println("       PROGRAM HITUNG BANGUN RUANG");
        System.out.println("======================================");

        System.out.println("\n[ 1 ] PERHITUNGAN PERTAMA");
        bangun.limasSegiempat();

        System.out.println("\n--------------------------------------");

        System.out.println("\n[ 2 ] PERHITUNGAN KEDUA");
        bangun.kerucut();

        System.out.println("\n--------------------------------------");

        System.out.println("\n[ 3 ] PERHITUNGAN KETIGA");
        bangun.prismaSegitiga();

        System.out.println("\n======================================");
        System.out.println("       PERHITUNGAN SELESAI");
        System.out.println("======================================");
    }
}

