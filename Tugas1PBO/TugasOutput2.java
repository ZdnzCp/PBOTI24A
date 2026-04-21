import javax.swing.JOptionPane;

public class TugasOutput2 {
    public static void main(String[] args) {
        String pelajaran = JOptionPane.showInputDialog(null, 
                "Anda sedang belajar apa?", 
                "Input", 
                JOptionPane.QUESTION_MESSAGE);

        if (pelajaran != null && !pelajaran.isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                    "Belajar " + pelajaran + " Sangat Mudah", 
                    "Message", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}