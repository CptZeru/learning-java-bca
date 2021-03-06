package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

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
        System.out.println("\n"+iniText);
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

        //tugas operasi aritmatika - Session 2
        int number1 = 10;
        int number2 = 2;
        int hasilJumlah;
        hasilJumlah = number1+number2;
        //penjumlahan
        System.out.println("operasi penjumlahan");
        System.out.print(number1+" + "+number2+" = ");
        System.out.println(hasilJumlah);
        //pengurangan
        System.out.println("operasi pengurangan");
        System.out.print(number1+" - "+number2+" = ");
        System.out.println(number1-number2);
        System.out.print(number2+" - "+number1+" = ");
        System.out.println(number2-number1);
        //perkalian
        System.out.println("operasi perkalian");
        System.out.print(number1+" x "+number2+" = ");
        System.out.println(number1*number2);
        //pembagian
        System.out.println("operasi pembagian");
        System.out.print(number1+" : "+number2+" = ");
        System.out.println(number1/number2);
        //modulus
        System.out.println("operasi modulus");
        System.out.print(number1+" % "+number2+" = ");
        System.out.println(number1%number2);
        System.out.println();

        //Static Array
        int[] code = new int[]{1,4,0,8,5};
        System.out.println(Arrays.toString(code));
        //Dynamic Array
        ArrayList<String> person = new ArrayList<>();
        person.add("Major Zero");
        person.add("Big Boss");
        person.add("La Li Lu Le Lo");
        System.out.println(person);
        System.out.println();

        //Task 1 - Session 3
        String[] customer1 = new String[]{"Saripudin", "Jalan Aspal No. 140", "085657121351"};
        String[] customer2 = new String[]{"Harjo", "Jalan Beton No. 85", "085657121352"};
        ArrayList<Object> customerListBuilding = new ArrayList<>();
        customerListBuilding.add(customer1);
        customerListBuilding.add(customer2);
        System.out.println(Arrays.deepToString(customerListBuilding.toArray()));
        System.out.println();

        //Task 2 - Session 3
        String kalimatGuru = "Aku Belajar di Kelas Lagi Setelah Corona Hilang";
        String newKalimat = kalimatGuru.toUpperCase();
        System.out.println(newKalimat);

        //Task 3 - Session 3
        double produk1 = 19545;
        double total = produk1 + (produk1/10);
        double totalBayar = 150.000;
        DecimalFormat totalFormat = new DecimalFormat("#.000");
        System.out.print("\nTotal Bayar : Rp ");
        System.out.println(totalFormat.format(totalBayar));

        //Task 4 - Session 3
        boolean QuestionAns1;

        //Session 4
        String passcode;
        passcode = "La Li Lu Le Lo";
        System.out.println();
        System.out.println(passcode);

        //Task 1 - Session 4
        double[] pesanan = new double[] {20.000, 25.000, 22.000};
        DecimalFormat df = new DecimalFormat("#.000");
        double totalPesanan = 0;
        for(int i = 0; i<pesanan.length; i++){
            totalPesanan = totalPesanan + pesanan[i];
        }
        System.out.print("\nTotal Bayar : Rp ");
        System.out.println(df.format(totalPesanan));
        System.out.println();

        //Task 2 - Session 4
        String[] hewan = new String[] {"Kancil","Kambing","Singa", "Harimau", "Gajah"};
        for(int i = 0; i<hewan.length; i++){
            if(hewan[i]=="Kancil"){
                System.out.println(hewan[i]+" adalah Hewan Cerdas");
            }else if(hewan[i]=="Singa"){
                System.out.println(hewan[i]+" adalah Sang Raja Hutan");
            }else{
                System.out.println(hewan[i]+" adalah Penghuni Hutan Biasa");
            }
        }
        System.out.println();

        //Task 3 - Session 4
        int[] justNumber = new int[]{1,4,5,6,7,9,12};
        for (int i = 0; i<justNumber.length; i++){
            if(justNumber[i]%2==0){
                System.out.println(justNumber[i]+" adalah Bilangan Genap");
            }else if(justNumber[i]%2!=0){
                System.out.println(justNumber[i]+" adalah Bilangan Ganjil");
            }
        }
        System.out.println();

        //Task 4 - Session 4
        int[] steps = new int[]{2,4,6,8};
        int totalSteps = Arrays.stream(steps).sum();
        double averageSteps = Arrays.stream(steps).average().getAsDouble();
        System.out.println("Total Steps : "+totalSteps+". Dari "+steps.length+" Orang");
        System.out.println("Average Steps : "+averageSteps+". Dari "+steps.length+" Orang\n");

        //Task 5 - Session 4
        String[] NamaOrang = new String[] {"Ahmad", "Abrar", "Dimas", "Prasetyo", "Andi", "Ridho", "Ariyar"};
        for(int i=0; i<NamaOrang.length;i++){
            int NamaLength = NamaOrang[i].length();
            if(NamaLength%2==0){
                System.out.println(NamaOrang[i]+" : "+NamaLength+" Huruf. Jumlahnya Genap");
            }else if(NamaLength%2!=0){
                System.out.println(NamaOrang[i]+" : "+NamaLength+" Huruf. Jumlahnya Ganjil");
            }
        }

        //Homework - Session 5
        String[] column = new String[] {"No.","Nama","Alamat","Gender"};
        String[][] data = new String[][] {{"1", "Peter P", "California", "Male"},
                {"2","Jabukowski R", "California", "Male"},
                {"3","Mark Watney", "Silicon Valley", "Male"},
                {"4", "Arina Sanders", "Canada", "Female"},
                {"5", "Matthew T", "New York", "Male"}};
        System.out.println();
        System.out.println("________________________");
        for(int i =0; i<column.length;i++){
            if(i==column.length-1){
                System.out.print("|  "+column[i]+"  |\n");
            }else{
                System.out.print("|  "+column[i]+"  ");
            }
        }
        int dataCount = 0;
        for(int j=0; j<data.length;j++){
            dataCount++;
            for(int k=0;k<data[j].length;k++){
                if(k==data[j].length-1){
                    System.out.print("|  "+data[j][k]+"  |\n");
                }else{
                    if(k==0){
                        System.out.print("|   "+data[j][k]+"   ");
                    }else{
                        System.out.print("|  "+data[j][k]+"  ");
                    }
                }
            }
        }
        System.out.println("________________________");
        System.out.println("dataCount: "+dataCount);
        System.out.println("________________________\n");
        int GenderPosition = Arrays.asList(column).indexOf("Gender");
        int NamePosition = Arrays.asList(column).indexOf("Nama");
        for(int j=0; j<data.length;j++){
            if(data[j][GenderPosition]=="Male"){
                System.out.println(data[j][NamePosition]+" | Male");
            }else if(data[j][GenderPosition]=="Female"){
                System.out.println(data[j][NamePosition]+" | Female");
            }
        }
        System.out.println();

        //Session 5 - Month
        int months =1;
        String month;
        switch (months){
            case 1:
                month = "Januari";
                break;
            case 2:
                month = "Februari";
                break;
            case 3:
                month = "Maret";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "Mei";
                break;
            case 6:
                month = "Juni";
                break;
            case 7:
                month = "Juli";
                break;
            case 8:
                month = "Agustus";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "Oktober";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "Desember";
                break;
            default:
                month = "Unidentified Input";
                break;
        }
        System.out.println(month);

        //While
        int counting = 1;
        while(counting<=10){
            System.out.println("While Counting");
            System.out.println(counting);
            counting++;
        }
        counting = 1;
        System.out.println();
        do{
            System.out.println("Do-While Counting");
            System.out.println(counting);
            counting++;
        }while (counting<=10);
        System.out.println();
        System.out.println("ForEach");
        for (String datum:
             column) {
            System.out.println(datum);
        }
    }
}