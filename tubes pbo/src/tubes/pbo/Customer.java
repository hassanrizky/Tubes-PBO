/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.pbo;

/**
 *
 * @author Asus
 */
public class Customer extends Tiang{
    private String ID_Customer;
    private String Nama;
    private String Alamat;
    private receiveReport laporan;
    private returnReport Hasil;

    public Customer(String ID_Customer, String Nama, String Alamat) {
        this.ID_Customer = ID_Customer;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public String getID_Customer() {
        return ID_Customer;
    }

    public void setID_Customer(String ID_Customer) {
        this.ID_Customer = ID_Customer;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setLaporan(receiveReport laporan) {
        this.laporan = laporan;
    }

    public returnReport getHasil() {
        return Hasil;
    }
    
    
}
