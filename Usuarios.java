import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuarios extends JFrame{
    private JPanel panel1;
    private JTextField txtval1;
    private JTextField txtval2;
    private JButton saludarButton;
    private JButton sumarButton;
    private JButton cerrarButton;
    private JPanel panel2;
    private JPanel panel3;
    private JButton limpiarButton;
    private JTextField resultado;
    private JButton unionButton;
    private JTextField resultado1;

    public Usuarios(){
        super("Operaciones");
        setContentPane(panel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtval1.setText("");
                txtval2.setText("");
                resultado.setText("");
                resultado1.setText("");
            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double val1 = Double.parseDouble(txtval1.getText());
                    double val2 = Double.parseDouble(txtval2.getText());
                    double resultado2 = val1 + val2;
                    resultado.setText(Double.toString(resultado2));
                }catch(Exception exception){
                    resultado.setText("Ingrese numeros >:c");
                }
            }
        });
        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val3=txtval1.getText();
                String val4=txtval2.getText();
                String resultado3= val3+" "+val4;
                resultado.setText(resultado3);
            }
        });
    }
}
