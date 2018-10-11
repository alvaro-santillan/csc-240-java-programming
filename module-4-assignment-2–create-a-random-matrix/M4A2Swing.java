import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.util.Random;

public class M4A2Swing extends JFrame {
    public M4A2Swing() {
        int [][] matrix = new int[10][10];
        Random random = new Random();
        String output = "";

        //loops for the x and y
        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                matrix[y][x] = random.nextInt(2);
                output += "    " + matrix[y][x];
            }
            output += "\n";
        }

        JOptionPane.showConfirmDialog(null, output,
            "M4A2 Matrix",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                new M4A2Swing();
            }
        });        
    }
}