
package Gui;
import Gui.AllObjCtrl07287;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Gui07287 {
    JFrame LogReg = new JFrame();
    JLabel login, daftar, top;
    JRadioButton radiodokter, radiopasien;
    JTextField textnamalogin, textnotelp, texttgllahir, textnamadaftar, textpenyakit;
    JLabel labelnpmlogin, labelpasswordlogin, labelnotelp, labeltgllahir, labelnamadaftar, labelpassworddaftar, labelpenyakit;
    JButton check, reg;
    JPasswordField passwordlogin, passworddaftar;
    private boolean ceklogin = false;

    public Gui07287() {
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("Puskesmas Mulyosari");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);
        login = new JLabel("login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);
        radiodokter = new JRadioButton("Dokter");
        login.setBounds(100, 50, 100, 100);
        radiodokter.setBounds(30, 150, 100, 30);
        radiodokter.setBackground(Color.CYAN);
        LogReg.add(radiodokter);
        radiopasien = new JRadioButton("Pasien");
        radiopasien.setBounds(149, 150, 100, 30);
        radiopasien.setBackground(Color.CYAN);
        LogReg.add(radiopasien);
        labelnpmlogin = new JLabel("Nama");
        labelnpmlogin.setBounds(38, 188, 100, 30);
        LogReg.add(labelnpmlogin);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(30, 210, 200, 30);
        LogReg.add(textnamalogin);
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(39, 240, 100, 30);
        LogReg.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 279, 280, 36);
        LogReg.add(passwordlogin);
        check = new JButton("check");
        check.setBounds(90, 320, 180, 40);
        check.setBackground(Color.GREEN);
        LogReg.add(check);
        daftar = new JLabel("Daftar Pasien");
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 25));
        daftar.setBounds(440, 50, 150, 100);
        LogReg.add(daftar);
        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(400, 150, 100, 30);
        LogReg.add(labelnamadaftar);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(400, 180, 200, 30);
        LogReg.add(textnamadaftar);
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 210, 100, 30);
        LogReg.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 240, 200, 30);
        LogReg.add(passworddaftar);
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400, 270, 100, 30);
        LogReg.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 300, 200, 30);
        LogReg.add(textnotelp);
        labeltgllahir = new JLabel("tanggal Lahir (dd/mm/yyyy)");
        labeltgllahir.setBounds(400, 330, 200, 30);
        LogReg.add(labeltgllahir);
        texttgllahir = new JTextField();
        texttgllahir.setBounds(400, 360, 200, 30);
        LogReg.add(texttgllahir);
        labelpenyakit = new JLabel("Penyakit");
        labelpenyakit.setBounds(400, 390, 200, 30);
        LogReg.add(labelpenyakit);
        textpenyakit = new JTextField();
        textpenyakit.setBounds(400, 420, 200, 30);
        LogReg.add(textpenyakit);
        reg = new JButton("Daftar");
        reg.setBounds(460, 520, 100, 40);
        reg.setBackground(Color.GREEN);
        LogReg.add(reg);
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        radiodokter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiodokter.isSelected()) {
                    radiopasien.setSelected(false);
                    ceklogin = true;
                }
            }
        });
        
        radiopasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiopasien.isSelected()) {
                    radiodokter.setSelected(false);
                    ceklogin = false;
                }
            }
        });
        
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ceklogin == true) {
                    try {
                        AllObjCtrl07287.Dokter.dataDokter();
                        AllObjCtrl07287.Dokter.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = AllObjCtrl07287.Dokter.dokterEntity().getNama();
                        JOptionPane.showMessageDialog(null, "selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        DokterGui07287 dokter = new DokterGui07287();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Nama atau password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } else {
                    try {
                        AllObjCtrl07287.Pasien.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = AllObjCtrl07287.Pasien.pasienEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat Datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        PasienGui07287 pasien = new PasienGui07287();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "NPM atau password salah", " information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
        
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String pass = passworddaftar.getText();
                    String nama = textnamadaftar.getText();
                    String penyakit = textpenyakit.getText();
                    String notelp = textnotelp.getText();
                    Date tgllahir = new Date(texttgllahir.getText());
                    AllObjCtrl07287.Pasien.insert(penyakit, nama, notelp, pass, tgllahir);
                    JOptionPane.showMessageDialog(null, "Registrasi Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    void kosong() {
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
        textnotelp.setText(null);
        texttgllahir.setText(null);
        textpenyakit.setText(null);
        textnamalogin.setText(null);
        passwordlogin.setText(null);
    }
}
