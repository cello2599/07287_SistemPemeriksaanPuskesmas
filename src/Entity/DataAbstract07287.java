package Entity;
import java.util.Date;

public abstract class DataAbstract07287 {
    protected String nama,noTelp,password;
    protected Date TanggalLahir;
    DataAbstract07287(String nama,String noTelp,String password,Date TanggalLahir){
        this.nama=nama;
        this.noTelp=noTelp;
        this.password=password;
        this.TanggalLahir=TanggalLahir;
    }
    public String getnama(){
        return nama;
    }
    public String getnoTelp(){
        return noTelp;
    }
    public String getpassword(){
        return password;
    }
    public Date getTanggalLahir(){
        return TanggalLahir;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNoTelp(String noTelp){
        this.noTelp=noTelp;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setTanggalLahir(Date TanggalLahir){
        this.TanggalLahir=TanggalLahir;
    }
}
