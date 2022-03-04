/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

//perkalian Array

public class UKL5 {
    public static void main(String[] args) {
        int a[][]={{4,2,4},{1,7,5}};
        int b[][]={{2,3},{2,4},{3,1}};
        int baris_a = a.length;
        int kolom_a = a[0].length;
        int baris_b = b.length;
        int kolom_b = b[0].length;
        int h [][] = new int[baris_a][kolom_b];
        int baris_h = h.length;
        int kolom_h = h[0].length;
 System.out.println("Hasil A x B");
    //proses perhitungan
        for(int i = 0; i < baris_a; i++){
        for(int j = 0;j < kolom_b; j++){ 
        for(int k = 0; k < kolom_a; k++){ 
        h[i][j] += a[i][k]*b[k][j];
     }
   }
 }
    //menampilkan hasil
        for(int i = 0; i < baris_h; i++){
        for(int j = 0; j < kolom_h; j++){
 System.out.print(h[i][j]+"\t");
            }
 System.out.println();
        }
    }

  }
