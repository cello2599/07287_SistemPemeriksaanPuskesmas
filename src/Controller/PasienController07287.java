/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Entity.PasienEntity07287;
import Entity.DaftarPasienEntity07287;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Demitrius
 */
public class PasienController07287 implements ControllerInterface07287{
    int indexLogin = 0;
    public PasienController07287() {
    }
    
    public PasienEntity07287 getData() {
        return AllObjectModel07287.pasModel.getPasienEntityArrayList(indexLogin);
    }
    
    public void daftarPasien(PasienEntity07287 pasienEntity, boolean isVerified, String dokterpenangan) {
        AllObjectModel07287.dafPasModel.insertDataDaftarPasien(new DaftarPasienEntity07287(pasienEntity, isVerified, dokterpenangan));
    }
    
    @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel07287.pasModel.cekData(nama, password);
    }
    
    public void insert(String penyakit, String nama, String no_telp, String password, Date tglLahir) {
        AllObjectModel07287.pasModel.insert(new PasienEntity07287(penyakit, nama, no_telp, password, tglLahir));
    }
    
    public PasienEntity07287 pasienEntity() {
        return AllObjectModel07287.pasModel.getPasienEntityArrayList(indexLogin);
    }
    
    public int cekDaftarPasien(String nama) {
        int cek = AllObjectModel07287.dafPasModel.cekData(nama,null);
        return cek;
    }
    
    public DaftarPasienEntity07287 showDaftarpas(int index) {
        return AllObjectModel07287.dafPasModel.showDaftarPas(index);
    }
    
    public PasienEntity07287 setPasienEntity(int index) {
        return AllObjectModel07287.pasModel.getPasienEntityArrayList(index);
    }
    
    public DefaultTableModel daftarpasien(){
        DefaultTableModel dtmdaftarpasien = new DefaultTableModel();
        Object[] kolom ={"Nama","Password","No Telp","Tgl Lahir","Penyakit","Verified","Dokter Penangan"};
        dtmdaftarpasien.setColumnIdentifiers(kolom);
        int size = AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().size();
        String verif = null;
        for (int i=0;i<size;i++){
            if(AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().get(i).getAccDokter()==false){
        verif = "no";
    }else{
        verif = "yes";
            }
    Object [] data = new Object[7];
    data[0] = AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().get(i).getPasienEntity().getNama();
    data[1] = AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().get(i).getPasienEntity().getpassword();
    data[2] = AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().get(i).getPasienEntity().getnoTelp();
    data[3] = new SimpleDateFormat("dd-MM-yyyy").format(AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().get(i).getPasienEntity().getTanggalLahir());
    data[4] = AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().get(i).getPasienEntity().getDiagnosa();
    data[5] = verif;
    data[6] = AllObjectModel07287.dafPasModel.getDaftarPasienArrayList().get(i).getDokterpenanganan();
    dtmdaftarpasien.addRow(data);
        }
    return dtmdaftarpasien;
    }
}
