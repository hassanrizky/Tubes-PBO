package tubes.pbo;
import java.time.LocalDate;
        
/**
 *
 * @author SMK GOWA RAYA
 */
public class Penjadwalan {
    private String No_Penjadwalan;
    private PekerjaLapangan No_Identitas;
    private LocalDate Tanggal_Maintenance;
    private returnReport hasilLaporan;
    
    public void setNoPenjadwalan(String No_Penjadwalan){
        this.No_Penjadwalan = No_Penjadwalan;
    }
    public void setTanggalMaintenance(LocalDate Tanggal_Maintenance){
        this.Tanggal_Maintenance = Tanggal_Maintenance;
    }
    public String getNoPenjadwalan(){
        return No_Penjadwalan;
    }
    public LocalDate getTanggalMaintenance(){
        return Tanggal_Maintenance;
    }
    public PekerjaLapangan getPekerjaLapangan(){
        return No_Identitas;
    }
    public void setHasilLaporan(returnReport hasilLaporan){
        this.hasilLaporan = hasilLaporan;
    }
}
