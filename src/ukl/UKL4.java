/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;
// Penjumlahan Array Ordo 3x3 dengan 3x3
public class UKL4 {
     public static void main(String[] args) {
    int a[][] = {{1,-8,3},{-3,5,4},{4,8,6}};
    int b[][] = {{4,3,-1},{7,8,9},{-2,3,1}};
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println("Hasil A + B");
        
    for (int i = 1; i < a.length ; i++) {
    for (int j = 0; j < b[0].length; j++) {
        System.out.print(a[i][j] + b[i][j] + "\t");
        }
        System.out.println("");
        }
    }

}
