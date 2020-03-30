/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logprof;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author sistem
 */

class Profile extends JFrame {

    String nama, jk, agama, hobby;
    final JTextField fnama = new JTextField(10);

    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("Perempuan ");

    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama
            = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel lhobby = new JLabel(" Hobby ");

    JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
    JCheckBox cbBasket = new JCheckBox(" Basket ");

    JButton btnSave = new JButton("OK");


    public Profile() {
        setTitle("Mencoba Kombinasi Komponen GUI");
        setDefaultCloseOperation(3);
        setSize(350, 200);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rbPria);
        add(rbWanita);
        add(lagama);
        add(cmbAgama);
        add(lhobby);
        add(cbSepakbola);
        add(cbBasket);
        add(btnSave);
    

//        ==========CLASS EVENT HANDLING==========
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fnama.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Gapunya nama?");
                } else {
                    nama = fnama.getText();
                }

                if (rbPria.isSelected()) {
                    jk = rbPria.getText();
                } else if (rbWanita.isSelected()) {
                    jk = rbWanita.getText();
                }

                agama = (String) cmbAgama.getSelectedItem();

                if (cbBasket.isSelected()) {
                    hobby = cbBasket.getText();
                } else if (cbSepakbola.isSelected()) {
                    hobby = cbSepakbola.getText();
//                } else if (cbBasket.isSelected() && cbSepakbola.isSelected()) {
//                    hobby = cbBasket.getText()+cbSepakbola.getText();
                } else {
                    JOptionPane.showMessageDialog(null, "Gapunya hobby?");
                }
                new OutputData(nama, jk, agama, hobby);

                dispose();

            }
        });

        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rbPria.setBounds(130, 35, 100, 20);
        rbWanita.setBounds(230, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        cmbAgama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbSepakbola.setBounds(130, 85, 100, 20);
        cbBasket.setBounds(230, 85, 150, 20);
        btnSave.setBounds(100, 130, 120, 20);
        

        setVisible(true);

    }
}

