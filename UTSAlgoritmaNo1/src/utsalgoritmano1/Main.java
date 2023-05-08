/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsalgoritmano1;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    private JTextField tfSisi1, tfSisi2, tfSisi3;
    private JLabel lblSisi1, lblSisi2, lblSisi3, lblHasil;
    private JButton btnCheck;

    public Main() {
        setTitle("Cek Jenis Segitiga");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tfSisi1 = new JTextField(10);
        tfSisi2 = new JTextField(10);
        tfSisi3 = new JTextField(10);
        lblSisi1 = new JLabel("Sisi 1: ");
        lblSisi2 = new JLabel("Sisi 2: ");
        lblSisi3 = new JLabel("Sisi 3: ");
        lblHasil = new JLabel("Hasil: ");
        btnCheck = new JButton("Check");
        btnCheck.addActionListener(this);

        setLayout(new GridLayout(4, 2));
        add(lblSisi1);
        add(tfSisi1);
        add(lblSisi2);
        add(tfSisi2);
        add(lblSisi3);
        add(tfSisi3);
        add(lblHasil);
        add(btnCheck);
    }

    public void actionPerformed(ActionEvent e) {
        int sisi1 = Integer.parseInt(tfSisi1.getText());
        int sisi2 = Integer.parseInt(tfSisi2.getText());
        int sisi3 = Integer.parseInt(tfSisi3.getText());

        // Membuat objek Segitiga dari kelas TurunanSegitigaAbstrak
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);

        // Menampilkan hasil jenis segitiga pada label lblHasil
        String jenisSegitiga = segitiga.getJenisSegitiga();
        lblHasil.setText("Jenis Segitiga: " + jenisSegitiga);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}

