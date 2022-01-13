package Entity;
import java.util.Date;

public class PasienEntity07287 extends DataAbstract07287 {
    private String diagnosa;
    public PasienEntity07287(String nama,String noTelp,String password,String diagnosa,Date TanggalLahir){
        super(nama,noTelp,password,TanggalLahir);
        this.diagnosa=diagnosa;
    }
    public String getNama(){
        return nama;
    }
    public String getDiagnosa(){
        return diagnosa;
    }
    public void setDiagnosa(String diagnosa){
        this.diagnosa=diagnosa;
    }
}
