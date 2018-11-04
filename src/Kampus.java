/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irham Rizady
 */
public class Kampus {
    private String namaKampus;
    private int jumlahJurusan;
    
    public Kampus(){
        
    }
    public void setNamaKampus(String namaKampus){
        this.namaKampus = namaKampus;
    }
    public String getNamaKampus(){
        return namaKampus;
    }
    public void setJumlahJurusan(int jumlah){
        this.jumlahJurusan = jumlah;
    }
    public int getJumlahJurusan(){
        return jumlahJurusan;
    }
    public String info(){
        String info="";
        info += "Kampus yang dipilih: "+this.namaKampus+"\n";
        info += "Jumlah jurusan yang dipilih: "+this.jumlahJurusan+"\n";
        return info;
    }
}
