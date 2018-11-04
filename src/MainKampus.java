/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irham Rizady
 */
public class MainKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kampus k = new Kampus();
        k.setNamaKampus("Polinema");
        k.setJumlahJurusan(1);
        JalurMasuk jM = new JalurMasuk();
        jM.setJalurMasuk("UMPN");
        Jurusan j = new Jurusan();
        j.setJurusan("Teknologi Informasi");
        j.setProdi("Teknik Informatika");
        Pembayaran p = new Pembayaran();
        p.setNama("Krisna");
        p.setJalur(jM);
        p.setKampus(k);
        p.setJurusan(j);
        p.setHarga(5000000);
        p.setBank("BRI");
        System.out.println(p.info());
    }
    
}
