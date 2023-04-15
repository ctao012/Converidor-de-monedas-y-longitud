package vistas;

import javax.swing.*;

public class Convertidor extends JFrame{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextPane textPaneConversion;
    private JLabel jLabelTitulo;

    public Convertidor (){
        super("Inicio");
        setSize(400,310);
        setContentPane(panel1);
    }
}
