package Gui;
import Controller.AllObjectModel07287;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controller.PasienController07287;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;

public class DokterGui07287 {
    private static PasienController07287 pasien = new PasienController07287();
    JFrame Dokter = new JFrame();
    JTable tabelpasien = new JTable();
    JScrollPane scrolldokter = new JScrollPane(tabelpasien);
    JButton back, verif, update, delete;
    JLabel dokterlabel, userlabel, passlabel;
    JTextField usertext, passtext;
    
    public DokterGui07287() {
        Dokter.setSize(650, 500);
        Dokter.setLayout(null);
        Dokter.getContentPane().setBackground(Color.LIGHT_GRAY);
        dokterlabel = new JLabel("Dokter");
        dokterlabel.setBounds(250, 30, 200, 30);
        dokterlabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
        Dokter.add(dokterlabel);
        
        scrolldokter.setBounds(30, 100, 570, 200);
        tabelpasien.setModel(pasien.daftarpasien());
        Dokter.add(scrolldokter);
        
        userlabel = new JLabel("Username");
        userlabel.setBounds(50, 320, 100, 30);
        Dokter.add(userlabel);
        
        usertext = new JTextField();
        usertext.setBounds(50, 350, 100, 30);
        Dokter.add(usertext);
        
        passlabel = new JLabel("password");
        passlabel.setBounds(200, 320, 100, 30);
        Dokter.add(passlabel);
        
        passtext = new JTextField();
        passtext.setBounds(200, 350, 100, 30);
        Dokter.add(passtext);
        
        verif = new JButton("verif");
        verif.setBounds(350, 350, 100, 30);
        verif.setBackground(Color.GREEN);
        Dokter.add(verif);
        
        update = new JButton("Update");
        update.setBounds(500, 350, 100, 30);
        update.setBackground(Color.BLUE);
        Dokter.add(update);
        
        delete = new JButton("Delete");
        delete.setBounds(500, 400, 100, 30);
        delete.setBackground(Color.red);
        Dokter.add(delete);
        
        back = new JButton("back");
        back.setBounds(50, 400, 100, 30);
        back.setBackground(Color.red);
        Dokter.add(back);
        
        Dokter.setLocationRelativeTo(null);
        Dokter.setVisible(true);
        Dokter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dokter.dispose();
                Gui07287 men = new Gui07287();
            }
        });
        
        verif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String user = usertext.getText();
                String pass = passtext.getText();
                int index = AllObjectModel07287.dafPasModel.cekData(user, pass);
                AllObjCtrl07287.Dokter.updateIsVerified(index, AllObjCtrl07287.Pasien.showDaftarpas(index).getPasienEntity(), AllObjCtrl07287.Dokter.dokterEntity().getNama());
                tabelpasien.setModel(pasien.daftarpasien());
            }
        });
        
        update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Dokter.dispose();
                UpdatePasien07287 update = new UpdatePasien07287();
            }
        });
        
        delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Dokter.dispose();
                DeletePasien07287 delete = new DeletePasien07287();
            }
        });
        
        tabelpasien.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpasien.getSelectedRow();
                usertext.setText(AllObjCtrl07287.Pasien.daftarpasien().getValueAt(i, 0).toString());
                passtext.setText(AllObjCtrl07287.Pasien.daftarpasien().getValueAt(i, 1).toString());
            }
        });
    }
    
}
