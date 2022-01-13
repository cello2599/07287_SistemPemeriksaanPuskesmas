
package Gui;
import Entity.PasienEntity07287;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class PasienGui07287 {
    JFrame Pasien = new JFrame();
    JButton back, daftarbtn;
    JTextArea area = new JTextArea();
    JLabel datadiri, daftarpasien;
    int cek = AllObjCtrl07287.Pasien.cekDaftarPasien(AllObjCtrl07287.Pasien.pasienEntity().getNama());

    public PasienGui07287() {
        Pasien.setSize(720, 600);
        Pasien.setLayout(null);
        Pasien.getContentPane().setBackground(Color.DARK_GRAY);
        datadiri = new JLabel("Data Pasien");
        datadiri.setFont(new Font("Times New Roman", Font.BOLD, 30));
        datadiri.setBounds(90, 30, 200, 30);
        Pasien.add(datadiri);
        area.setBounds(30, 90, 400, 300);
        Pasien.add(area);
        daftarbtn = new JButton("Daftar");
        daftarbtn.setBounds(500, 200, 100, 30);
        daftarbtn.setBackground(Color.GREEN);
        Pasien.add(daftarbtn);
        back = new JButton("back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.red);
        Pasien.add(back);
        Pasien.setVisible(true);
        Pasien.setLocationRelativeTo(null);
        Pasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if (cek == -1) {
            JOptionPane.showMessageDialog(null, "Anda Belum Verifikasi data Anda", "information", JOptionPane.INFORMATION_MESSAGE);
        } else if (cek == -2) {
            JOptionPane.showMessageDialog(null, "Anda Belun Verifikasi data Anda", "information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            area.setText(datapasien());
        }
        
        daftarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                AllObjCtrl07287.Pasien.daftarPasien(AllObjCtrl07287.Pasien.pasienEntity(), true, null);
                area.setText(datapasien());
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Pasien.dispose();
                Gui07287 men = new Gui07287();
            }
        });
    }

    public String datapasien() {
        int cek = AllObjCtrl07287.Pasien.cekDaftarPasien(AllObjCtrl07287.Pasien.pasienEntity().getNama());
        String cekverif;
        if (AllObjCtrl07287.Pasien.showDaftarpas(cek).getAccDokter() == false) {
            cekverif = "belum diverifikasi";
        } else {
            cekverif = "sudah diverifikasi";
        }
        String text = "Nama = " + AllObjCtrl07287.Pasien.showDaftarpas(cek).getPasienEntity().getNama() + "\n" 
                + "No. Telp = " + AllObjCtrl07287.Pasien.showDaftarpas(cek).getPasienEntity().getnoTelp() + "\n"
                + "Penyakit = " + AllObjCtrl07287.Pasien.showDaftarpas(cek).getPasienEntity().getDiagnosa() + "\n" 
                + "Tanggal Lahir = " + new SimpleDateFormat("dd-MM-yyyy").format(AllObjCtrl07287.Pasien.showDaftarpas(cek).getPasienEntity().getTanggalLahir()) + "\n" 
                + "verifikasi = " + cekverif + "\n" 
                + "Dokter Penangan = " + AllObjCtrl07287.Pasien.showDaftarpas(cek).getDokterpenanganan() + "\n" ;
        return text;
    }
}
