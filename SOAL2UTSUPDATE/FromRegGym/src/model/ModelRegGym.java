
package model;

import view.ViewRegGym;

/**
 *
 * @author Kelompok 4 IF-11
 */

public class ModelRegGym {
    private String noKtp, nama, jenkel = "", cabang, 
                   handuk = "", paket = "", biaya = "";

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getHanduk() {
        return handuk;
    }

    public void setHanduk(String handuk) {
        this.handuk = handuk;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }
    
    public static void main(String[] args) {
        new ViewRegGym().setVisible(true);
    }
}