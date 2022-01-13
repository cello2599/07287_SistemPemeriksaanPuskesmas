package Model;
import java.util.ArrayList;
import Entity.DokterEntity07287;
public class DokterModel07287 implements ModelInterface07287 {
    public ArrayList<DokterEntity07287> dokterEntityArrayList;
    
    public DokterModel07287(){
        dokterEntityArrayList = new ArrayList<DokterEntity07287>();
    }
    
    public int cekData(String nama,String password){
        int loop = 0;
        for(DokterEntity07287 cek : dokterEntityArrayList){
            if(cek.getNama().equals(nama) && cek.getpassword().equals(password)){
                break;
            }
            else {
                loop++;
            }
    }
        return loop;
    }
    public DokterEntity07287 getDokterEntityArrayList(int id){
        return dokterEntityArrayList.get(id);
    }
    public void insert(DokterEntity07287 dokterEntity){
        dokterEntityArrayList.add(dokterEntity);
    }
    
}
