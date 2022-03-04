/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
//Soal Seleksi Kondisi KE-1
public class UKL6 {
    public static void main(String[]args){
         //Mengubah format rupiah
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndo.setDecimalFormatSymbols(formatRp);
        //Listrik
        Scanner input = new Scanner(System.in);
        int id,tagihan,total=0;
        System.out.print("Masukkan Id: ");
        id = input.nextInt();
        System.out.print("Pemakaian(kwh): ");
        tagihan = input.nextInt();
        //Informasi Tagihan Pemabayaran Listrik
        System.out.println("Tagihan Pemabayaran Listrik");
          switch (id) {
              case 1:
                  tagihan = tagihan * 1000;
                  //jika tagihan kurang dari Rp 50.000
                  // maka tagihan dibulatkan menjadi Rp 50.000
                  if(tagihan<50000){
                      tagihan = 50000;
                  }     //ditambah biaya admin
                  total = tagihan + 13000;
                  System.out.println("Id: 1");
                  System.out.println("Nama: Galuh");
                  System.out.println("Jumlah tagihan: "+ kursIndo.format(total));
                  System.out.println("Alamat: Sawojajar");
                  System.out.println("Golongan: 1");
                  break;
              case 2:
                  tagihan = tagihan * 1500;
                  if(tagihan<50000){
                      tagihan = 50000;
                  }     total = tagihan + 13000;
                  System.out.println("Id: 2");
                  System.out.println("Nama: Indro");
                  System.out.println("Jumlah tagihan: "+ kursIndo.format(total));
                  System.out.println("Alamat: Kedung kandang");
                  System.out.println("Golongan: 3");
                  break;
              case 3:
                  tagihan = tagihan * 1300;
                  if(tagihan<50000){
                      tagihan = 50000;
                  }     total = tagihan + 13000;
                  System.out.println("Id: 3");
                  System.out.println("Nama: Jedi");
                  System.out.println("Jumlah tagihan: "+ kursIndo.format(total));
                  System.out.println("Alamat: Ijen");
                  System.out.println("Golongan: 2");
                  break;
              case 4:
                  tagihan = tagihan * 1500;
                  if(tagihan<50000){
                      tagihan = 50000;
                  }     total = tagihan + 13000;
                  System.out.println("Id: 4");
                  System.out.println("Nama: Kanu");
                  System.out.println("Jumlah tagihan: "+ kursIndo.format(total));
                  System.out.println("Alamat: Dinoyo");
                  System.out.println("Golongan: 3");
                  break;
              default:
                  break;
          }
    }
}
