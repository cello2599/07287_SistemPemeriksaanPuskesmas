package Model;
import Entity.DaftarPasienEntity07287;
import Entity.PasienEntity07287;
import java.util.ArrayList;
public class DaftarPasienModel07287 implements ModelInterface07287 {
    public ArrayList<DaftarPasienEntity07287> daftarpasienArrayList;
    
    public DaftarPasienModel07287(){
        daftarpasienArrayList = new ArrayList<DaftarPasienEntity07287>();
    }
    public int cekData(String nama,String password){
        int loop=0;
        if(daftarpasienArrayList.size()==0){
            loop = -1;
        }
        else{
        for(int i = 0; i<daftarpasienArrayList.size(); i++){
            if(daftarpasienArrayList.get(i).getPasienEntity().getNama().equals(nama)){
                loop=i;
                break;
            }
            else {
                loop=-2;
            }
        }
        }
        return loop;
    }

public ArrayList<DaftarPasienEntity07287> getDaftarPasienArrayList(){
    return daftarpasienArrayList;
}
public void insertDataDaftarPasien(DaftarPasienEntity07287 daftarPasienEntity){ 
   daftarpasienArrayList.add(daftarPasienEntity);
}

public int size() {
        return daftarpasienArrayList.size();
    }

public DaftarPasienEntity07287 showDaftarPas(int index){
    return daftarpasienArrayList.get(index);
}
public void updateIsVerified(int index,DaftarPasienEntity07287 daftarPasienEntity){
    daftarpasienArrayList.set(index,daftarPasienEntity);
}

}
    

