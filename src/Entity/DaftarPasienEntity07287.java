
package Entity;


public class DaftarPasienEntity07287 {
    private PasienEntity07287 pasienEntity;
    private boolean accDokter;
    private String dokterpenanganan;
    public DaftarPasienEntity07287(PasienEntity07287 pasienEntity,boolean accDokter,String dokterpenanganan){
        this.pasienEntity=pasienEntity;
        this.accDokter=accDokter;
        this.dokterpenanganan=dokterpenanganan;
    }
    public String getDokterpenanganan(){
        return dokterpenanganan;
    }
    public boolean getAccDokter(){
        return accDokter;
    }
    public PasienEntity07287 getPasienEntity(){
        return pasienEntity;
    }
    public void setDokterPenanganan(String dokterpenanganan){
        this.dokterpenanganan=dokterpenanganan;
    }
    public void setAccDokter(boolean accDokter){
        this.accDokter=accDokter;
    }
    public void setPasienEntity(PasienEntity07287 pasienEntity){
        this.pasienEntity=pasienEntity;
    }
}
