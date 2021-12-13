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
public class Admin extends Employee{
    private Penjadwalan jadwal;
    private receiveReport receive;

    public Admin(String NoIdentitas, String nama) {
        super(NoIdentitas, nama);
    }

    public void setPenjadwalan(Penjadwalan jadwal) {
        this.jadwal = jadwal;
    }

    public receiveReport getReceive() {
        return receive;
    }  
    
    @Override
    public void info(){
        
    }
    
    
}
