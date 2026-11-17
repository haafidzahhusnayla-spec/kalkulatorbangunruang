/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    // Menampilkan judul bagian
    static void tampilkanHeader(String judul) {
        System.out.println("=== " + judul + " ===");
    }

    // Luas lingkaran = π × r²
    static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilkanHeader("Menghitung Luas Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        double luasLingkaran = hitungLuasLingkaran(jariJari);
        System.out.println("Luas lingkaran = " + luasLingkaran + "\n");
        input.close();
    }
}