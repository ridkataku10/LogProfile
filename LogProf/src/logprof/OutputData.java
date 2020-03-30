/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logprof;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Savepoint;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sistem
 */
public class OutputData extends JFrame {

    JLabel ohnama = new JLabel();
    JLabel ohjk = new JLabel();
    JLabel ohagama = new JLabel();
    JLabel ohhobby = new JLabel();
    String nama, jk, agama, hobby;

    OutputData(String nama, String jk, String agama, String hobby) {
        setTitle("Mencoba Kombinasi Komponen GUI");
        setDefaultCloseOperation(3);
        setSize(350, 200);
        setLayout(null);

        add(ohnama);
        add(ohjk);
        add(ohagama);
        add(ohhobby);

        nama = nama;
        jk = jk;
        agama = agama;
        hobby = hobby;
        ohnama.setText("Nama kamu/dia : "+nama);
        ohjk.setText("Jenis Kelamin : "+jk);
        ohagama.setText("Agama : "+agama);
        ohhobby.setText("Kamu/dia menyukai : "+hobby);

        ohnama.setBounds(10, 10, 300, 20);
        ohjk.setBounds(10, 30, 200, 20);
        ohagama.setBounds(10, 50, 200, 20);
        ohhobby.setBounds(10, 70, 200, 20);

        setVisible(true);
    }

}
