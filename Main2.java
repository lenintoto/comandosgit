import javax.swing.*;

public class Main2 {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Usuarios();
                frame.setSize(500,750);
                frame.setVisible(true);
            }
        });
    }
}
