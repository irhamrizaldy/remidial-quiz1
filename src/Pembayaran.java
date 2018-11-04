/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irham Rizady
 */
public class Pembayaran {
    private String nama, bank;
    private Kampus kampus;
    private JalurMasuk jalur;
    private Jurusan jurusan;
    private int harga;
    
    public Pembayaran(){
        
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public Kampus getKampus(){
        return kampus;
    }
    public void setKampus(Kampus kampus){
        this.kampus = kampus;
    }
    public Jurusan getJurusan(){
        return jurusan;
    }
    public void setJurusan(Jurusan jurusan){
        this.jurusan = jurusan;
    }
    public JalurMasuk getJalur(){
        return jalur;
    }
    public void setJalur(JalurMasuk jalur){
        this.jalur = jalur;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public String getBank(){
        return bank;
    }
    public void setBank(String bank){
        this.bank = bank;
    }
    public int hitungHargaMasuk(){
        return harga;
    }
    public String info(){
        String info="";
        info += "Nama Calon Mahasiswa: " +this.nama+ "\n";
        info += this.jalur.info();
        info += this.kampus.info();
        info += this.jurusan.info();
        info += "Biaya Masuk: " +this.harga+ "\n";
        info += "Via Bank: " +this.bank+ "\n";
        return info;
    }
}