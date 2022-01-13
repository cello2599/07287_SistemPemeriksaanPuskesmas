
package Controller;

import Entity.DaftarPasienEntity07287;
import Entity.DokterEntity07287;
import Entity.PasienEntity07287;
import java.util.Date;


public class DokterController07287 implements ControllerInterface07287{
    int indexLogin = 0;

    public DokterController07287() {
    }
    
    public void dataDokter(){
        String spesialis [] = {"Saraf","Mata","THT","Kandungan","Jantung","Tulang","Penyakit dalam"};
        String nama [] = {"Marcelo","Hania","Dwicahyo","Rafly","Krisna","Riva","Wawan"};
        String password [] = {"01","02","03","04","05","06","07"};
        String notelp [] = {"01","02","03","04","05","06","07"};
        String nip [] = {"01","02","03","04","05","06","07"};
        String tglLahir [] = {"25/10/1999","01/12/1999","03/03/2000","23/06/2000","11/07/2000","13/09/2000","22/12/2000"};
        
       for (int i = 0; i < nama.length; i++) {
            AllObjectModel07287.dokModel.insert(new DokterEntity07287(spesialis[i], nip[i], nama[i], notelp[i], password[i], new Date(tglLahir[i])));
        }
    }
    
    @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel07287.dokModel.cekData(nama, password);
    }
    
    public DokterEntity07287 dokterEntity() {
        return AllObjectModel07287.dokModel.getDokterEntityArrayList(indexLogin);
    }
    
    public void updateIsVerified(int index, PasienEntity07287 pasienEntity, String dokterpenangan) {
        AllObjectModel07287.dafPasModel.updateIsVerified(index, new DaftarPasienEntity07287(pasienEntity, true, dokterpenangan));
    }
    
    
}
