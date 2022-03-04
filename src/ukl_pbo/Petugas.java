
package ukl_pbo;

import java.util.ArrayList;
public class Petugas implements User{
    
 private ArrayList<String> namaPetugas = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> jabatan = new ArrayList<Integer>();

 public Petugas() {
 this.namaPetugas.add("Admin1");
 this.alamat.add("Malang");
 this.telepon.add("081112223333");
 this.jabatan.add(1);
 
 this.namaPetugas.add("Admin2");
 this.alamat.add("Pemalang");
 this.telepon.add("081117221332");
 this.jabatan.add(0);
 
 this.namaPetugas.add("Admin3");
 this.alamat.add("Madiun");
 this.telepon.add("083217251322");
 this.jabatan.add(2);
 }
 public void setJabatan(int jabatan ){
 this.jabatan.add(jabatan);
 }
 public int getJabatan(int id){
 return this.jabatan.get(id);
 }
 public int getJmlPetugas(){
 return this.namaPetugas.size();
 }
 @Override
 public void setNama(String namaPetugas ){
 this.namaPetugas.add(namaPetugas);
 }

 @Override
 public void setAlamat(String alamat ){
 this.namaPetugas.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.namaPetugas.add(telepon);
 }

 @Override
 public String getNama(int idPetugas){
 return this.namaPetugas.get(idPetugas);
 }

 @Override
 public String getAlamat(int idPetugas){
 return this.alamat.get(idPetugas);
 }

 @Override
 public String getTelepon(int idPetugas){
 return this.telepon.get(idPetugas);
 }
}