/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irham Rizady
 */
public class Jurusan {
    private String jurusan;
    private String prodi;
    
    public Jurusan(){
        
    }
    public String getJurusan(){
        return jurusan;
    }
    public String getProdi(){
        return prodi;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public String info(){
        String info="";
        info += "Nama Jurusan: "+this.jurusan+"\n";
        info += "Prodi yang dia ingin: "+this.prodi+"\n";
        return info;
    }
}
