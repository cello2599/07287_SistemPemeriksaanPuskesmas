
package Entity;
import java.util.Date;

public class DokterEntity07287 extends DataAbstract07287 {
    private String nip;
    private String spesialis;
    public DokterEntity07287(String spesialis,String nip,String nama,String noTelp,String password,Date TanggalLahir){
        super(nama,noTelp,password,TanggalLahir);
        this.nip=nip;
    }
    public String getNama(){
        return nama;
    }
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip=nip;
    }
    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}
