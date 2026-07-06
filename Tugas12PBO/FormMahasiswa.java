import javax.swing.*;
import java.awt.*;

public class FormMahasiswa extends JFrame {

    JTextField txtNim, txtNama, txtProdi;
    JTextArea txtOutput;

    public FormMahasiswa() {
        setTitle("Aplikasi Biodata Mahasiswa");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel panelInput = new JPanel(new GridLayout(3, 2, 5, 5));
        txtNim = new JTextField(15);
        txtNama = new JTextField(15);
        txtProdi = new JTextField(15);

        panelInput.add(new JLabel("NIM"));
        panelInput.add(txtNim);
        panelInput.add(new JLabel("Nama"));
        panelInput.add(txtNama);
        panelInput.add(new JLabel("Program Studi"));
        panelInput.add(txtProdi);

        JButton btnTampilkan = new JButton("Tampilkan");
        JButton btnReset = new JButton("Reset");

        txtOutput = new JTextArea(10, 30);
        txtOutput.setEditable(false);

        btnTampilkan.addActionListener(e -> {
            txtOutput.setText(
                "===== BIODATA MAHASISWA =====\n" +
                "NIM           : " + txtNim.getText() + "\n" +
                "Nama          : " + txtNama.getText() + "\n" +
                "Program Studi : " + txtProdi.getText()
            );
        });

        btnReset.addActionListener(e -> {
            txtNim.setText("");
            txtNama.setText("");
            txtProdi.setText("");
            txtOutput.setText("");
        });

        add(panelInput);
        add(btnTampilkan);
        add(btnReset);
        add(new JScrollPane(txtOutput));
    }

    public static void main(String[] args) {
        FormMahasiswa frame = new FormMahasiswa();
        frame.setVisible(true);
    }
}
