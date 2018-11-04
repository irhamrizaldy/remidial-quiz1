/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irham Rizady
 */
public class JalurMasuk {
    private String jalur;
    
    public JalurMasuk(){
        
    }
    public void setJalurMasuk(String jalur){
        this.jalur = jalur;
    }
    public String getJalurMasuk(){
        return jalur;
    }
    public String info(){
        String info="";
        info += "Jalur Masuk: "+this.jalur+"\n";
        return info;
    }
}
