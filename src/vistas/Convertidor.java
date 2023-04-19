package vistas;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Convertidor extends JFrame{
    private JPanel panel1;
    private JComboBox comboBoxUnidad1;
    private JComboBox comboBoxUnidad2;
    private JTextField textFieldValor1;
    private JTextField textFieldValor22;
    private JTextPane textPaneReultadoConversion;
    private JLabel jLabelTitulo;

    public Convertidor (){
        super("Inicio");
        setSize(400,310);
        setContentPane(panel1);
    }
    public void mostrarConvertidorMoneda (){
        jLabelTitulo.setText("Converidor de moneda");
        comboBoxUnidad1.addItem("Pesos");
        comboBoxUnidad2.addItem("Dólar");
        comboBoxUnidad2.addItem("Euros");
        comboBoxUnidad2.addItem("Libras Esterlinas");
        comboBoxUnidad2.addItem("Yen Japonés");
        comboBoxUnidad2.addItem("Won sul-coreano");
        comboBoxUnidad2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                convertirMonedas();

            }
        });


    }
    public void convertirMonedas(){
        System.out.println(comboBoxUnidad2.getSelectedItem());
    }


}
