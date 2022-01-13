package Model;
import Entity.PasienEntity07287;
import java.util.ArrayList;

public class PasienModel_07287 implements ModelInterface07287 {
    public ArrayList<PasienEntity07287> pasienEntityArrayList;
    
    public PasienModel_07287(){
        pasienEntityArrayList = new ArrayList<PasienEntity07287>();
    }
  
    public int cekData(String nama,String password){
        int loop =0;
        if(pasienEntityArrayList.size()==0){
            loop=-1;
        }
        else{
         for(int i = 0; i<pasienEntityArrayList.size(); i++){
            if(pasienEntityArrayList.get(i).getNama().equals(nama)&&pasienEntityArrayList.get(i).getpassword().equals(password)){
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
    
    public PasienEntity07287 getPasienEntityArrayList (int index){
       return pasienEntityArrayList.get(index);
    }
    
    public void insert(PasienEntity07287 pasienEntity){
        pasienEntityArrayList.add(pasienEntity);
    }
    
    public int size(){
        return pasienEntityArrayList.size();
    }
}
