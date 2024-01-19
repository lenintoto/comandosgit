import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("formulario de prueba");
        ventana.setSize(500,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelcentro = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3= new JPanel();
        JPanel panel4= new JPanel();
        JPanel panel5= new JPanel();
        JPanel panel6= new JPanel();
        JCheckBox checkBox1 = new JCheckBox();
        JCheckBox checkBox2 = new JCheckBox();
        JCheckBox checkBox3 = new JCheckBox();
        JCheckBox checkBox4 = new JCheckBox();
        JCheckBox checkBox5 = new JCheckBox();
        JCheckBox checkBox6 = new JCheckBox();

        //JButton boton=new JButton("Soy un botón :D");
        JLabel etiqueta= new JLabel("io");
        JLabel etiqueta2= new JLabel("dhylan");
        JLabel etiqueta3= new JLabel("halecs");
        JLabel etiqueta4= new JLabel("alecsis");
        JLabel etiqueta5= new JLabel("maltin");
        JLabel etiqueta6= new JLabel("estibhen");
        //JTextField campotexto= new JTextField("Escribe aqui");
        //JTextField campotexto1= new JTextField("aqui tambien");
        //JTextField campotexto2= new JTextField("Aqui no");

        panel1.add(etiqueta);panel1.add(checkBox1);
        panel2.add(etiqueta2);panel2.add(checkBox2);
        panel3.add(etiqueta3);panel3.add(checkBox3);
        panel4.add(etiqueta4);panel4.add(checkBox4);
        panel5.add(etiqueta5);panel5.add(checkBox5);
        panel6.add(etiqueta6);panel6.add(checkBox6);


        panelcentro.setLayout(new GridLayout(6,1));
        panel1.setBackground(Color.cyan);
        panel2.setBackground(Color.pink);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.orange);
        panel6.setBackground(Color.yellow);

        panelcentro.add(panel1,BorderLayout.WEST);
        panelcentro.add(panel3,BorderLayout.NORTH);
        panelcentro.add(panel4,BorderLayout.SOUTH);
        panelcentro.add(panel2,BorderLayout.EAST);
        panelcentro.add(panel5,BorderLayout.CENTER);
        panelcentro.add(panel6,BorderLayout.LINE_END);
        ventana.setResizable(true);
        ventana.add(panelcentro);
        ventana.setVisible(true);
    }
}
