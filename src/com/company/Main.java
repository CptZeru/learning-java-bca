package com.company;

public class Main {

    public static void main(String[] args) {
        int bulan = 4;
        String text = "Saya";
        System.out.println("How is World Now");
        System.out.println("Halo sobat javanica");
        System.out.println("Saya belajar java di BCA SYNRGY Academy");
        System.out.println(text+" belajar java di BCA SYNRGY Academy " + bulan +" bulan.\n");

        double angka1 = 100;
        double angka2 = 200;
        System.out.println("hasil desimal : " + angka1/angka2);
        System.out.println("Hasilnya : "+ 200/100);

        String iniText = "BCA Academy X Binar Java Backend";
        System.out.println("Jumlah huruf : "+ iniText.length()+"\n");

        String baju = "Sweater NASA 1:1";
        String jenis = "Sweater";
        String warna = "Putih";
        System.out.println("============================== ");
        System.out.println("===|| TOKO BAJU PAK AMIR ||=== ");
        System.out.println("===|| ~ORI gak harus KW~ ||=== ");
        System.out.println("============================== ");
        System.out.println("Baju : "+baju);
        System.out.println("Jenis : "+jenis);
        System.out.println("Warna : "+warna);
        System.out.println();

        String kalimat1 = "Java itu bahasa pemrograman";
        String kalimat2 = "pemrograman yang berbasis OOP";
        System.out.println(kalimat1+", "+kalimat2+"\n");

        //tugas operasi aritmatika
        int number1 = 10;
        int number2 = 2;
        //penjumlahan
        System.out.println("operasi penjumlahan");
        System.out.print(number1+" + "+number2+" = ");
        System.out.println(number1+number2);
        //pengurangan
        System.out.println("operasi pengurangan");
        System.out.print(number1+" - "+number2+" = ");
        System.out.println(number1-number2);
        //perkalian
        System.out.println("operasi perkalian");
        System.out.print(number1+" * "+number2+" = ");
        System.out.println(number1*number2);
        //pembagian
        System.out.println("operasi pembagian");
        System.out.print(number1+" : "+number2+" = ");
        System.out.println(number1/number2);
        //modulus
        System.out.println("operasi modulus");
        System.out.print(number1+" % "+number2+" = ");
        System.out.println(number1%number2);
    }
}