/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

//Matrix model a 6-6

public class UKL3 {
  public static void main(String[] args){
    int a = 18;
    int b = 7;
    int kolom = 5;
    int un = a;
    int sn = a;
 
        System.out.println("Deret Aritmatika : ");
    for (int i = 0; i < kolom; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print(un + "\t");
    un += b;
    sn += un;
    }
        System.out.println("");
    }
    sn -= un;
        System.out.println("jumlah Deret = " + sn);
    
   }
}
