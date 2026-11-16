/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pkbud;

/**
 *
 * @author lenovo
 */
public class Tugas_PkBud {


    public void limasSegiempat() {
        double sisi = 8;
        double tinggi = 6;
        double tinggiSisi = Math.sqrt(
            Math.pow(sisi / 2, 2) + Math.pow(tinggi, 2)
        );

        double volume = (1.0 / 3.0) * sisi * sisi * tinggi;
        double luas = (sisi * sisi) +
                      (2 * sisi * tinggiSisi);

        System.out.println("BANGUN RUANG: LIMAS SEGIEMPAT");
        System.out.println("Sisi Alas       : " + sisi);
        System.out.println("Tinggi          : " + tinggi);
        System.out.println("Volume          : " + volume);
        System.out.println("Luas Permukaan  : " + luas);
    }

    public void kerucut() {
        double jariJari = 7;
        double tinggi = 12;
        double garisPelukis = Math.sqrt(
            (jariJari * jariJari) + (tinggi * tinggi)
        );

        double volume = (1.0 / 3.0) * Math.PI *
                        jariJari * jariJari * tinggi;

        double luas = Math.PI * jariJari *
                      (jariJari + garisPelukis);

        System.out.println("\nBANGUN RUANG: KERUCUT");
        System.out.println("Jari-jari       : " + jariJari);
        System.out.println("Tinggi          : " + tinggi);
        System.out.println("Volume          : " + volume);
        System.out.println("Luas Permukaan  : " + luas);
    }

    public void prismaSegitiga() {
        double alas = 6;
        double tinggiSegitiga = 8;
        double panjang = 10;

        double sisiMiring = Math.sqrt(
            alas * alas + tinggiSegitiga * tinggiSegitiga
        );

        double luasAlas = 0.5 * alas * tinggiSegitiga;
        double volume = luasAlas * panjang;

        double luas = (2 * luasAlas) +
                      ((alas + tinggiSegitiga + sisiMiring) * panjang);

        System.out.println("\nBANGUN RUANG: PRISMA SEGITIGA");
        System.out.println("Alas Segitiga   : " + alas);
        System.out.println("Tinggi Segitiga : " + tinggiSegitiga);
        System.out.println("Panjang Prisma  : " + panjang);
        System.out.println("Volume          : " + volume);
        System.out.println("Luas Permukaan  : " + luas);
    }
}

