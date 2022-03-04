//suku pertama =18, suku yang berdekatan berbeda = 7, yang ditampilkan suku ke 2 sampai 11
package ukl;

public class UKL {

public static void main(String[] args) {
 int a=18;
 int b=7;
 int n=2;
 int nn=11;
 int u=a;
 int s=a;
    System.out.println("deret = ");
    for(int i=1;i<=nn;i++){
        if(i>=n){
            System.out.println(u);
        }
        u=u+b;
        s=s+u;
    }
    s=s-u;
    System.out.println("Jumlah = " +s);
  }
}