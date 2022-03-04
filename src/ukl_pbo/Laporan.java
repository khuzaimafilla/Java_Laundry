
package ukl_pbo;

public class Laporan {
    public void laporan(JenisLaundry jenisLaundry){
 int x=jenisLaundry.getJmlJenisLaundry();

 System.out.println("\n Jenis Laundry");
 System.out.println("Nama Jenis Laundry \tDurasi(hr) \tHarga/kg");
 for (int i = 0; i < x; i++) {
 System.out.println(jenisLaundry.getNamaJenisLaundry(i)+"\t"+
 jenisLaundry.getDurasi(i)+ "hr" + "\t" +"\t"+ "Rp."+ jenisLaundry.getHarga(i) + "/kg");
     }
 }
 public void laporan(Client client){
 int x=client.getJmlClient();

 System.out.println("\n Client");
 System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
 for (int i = 0; i < x; i++) {
 System.out.println(client.getNama(i)+"\t"+
 client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+ "Rp." +
 client.getSaldo(i));
    }
 }
 
 public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();
        String jabatan = null;
        System.out.println("\n Petugas");
        System.out.println("ID \tNama \t\tAlamat \tTelepon \tJabatan");
        for (int i = 0; i < x; i++) {
             if(petugas.getJabatan(i) == 0){
                 jabatan = "01";
             }else if(petugas.getJabatan(i) == 1){
                 jabatan = "02";
             }else{
                 jabatan = "00";
             }
            System.out.println(i + ".\t" + petugas.getNama(i) + "\t"
                    + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t"
                    + jabatan);
        }
 }

 public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry){
 int x=transaksi.getJmlTransaksi();

 System.out.println("\n Histori Transaksi");
 System.out.println("Nama Jenis Laundry\tJumlah(kg) \tHarga/kg \t\tJumlah");

 int total=0;
 for (int i = 0; i < x; i++) {
 int
jumlah=transaksi.getBanyaknya(i)*jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
 total+=jumlah;

System.out.println(jenisLaundry.getNamaJenisLaundry(transaksi.getIdJenisLaundry(i))+"\t"+

transaksi.getBanyaknya(i)+ "kg"+ "\t" +"\t"+ "Rp." + jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i))+ "/kg" + "\t" + "\t"
+ "Rp."+ jumlah);
 }
 System.out.println("Total Omset       : Rp."+ total);
 }
}