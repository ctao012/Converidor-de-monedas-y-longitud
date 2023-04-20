package vistas;

import javax.swing.*;
import java.awt.event.*;
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
        super("Convertidor");
        setSize(400,310);
        setContentPane(panel1);

        textFieldValor22.addKeyListener(new KeyAdapter() {
        });
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
        textFieldValor1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int key = e.getKeyChar();

                boolean numeros = key >= 48 && key <= 57||key==46;

                if (!numeros)
                {
                    e.consume();
                }
                convertirMonedas();

            }
        });
        textFieldValor22.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                convertirMonedasInverso();
                super.keyTyped(e);
            }
        });


    }
    public void convertirMonedas(){

        double valor1=Double.parseDouble(textFieldValor1.getText());
        double valor2=Double.parseDouble(textFieldValor22.getText());
        if (comboBoxUnidad2.getSelectedItem()=="Dólar"){
            valor2= valor1/4531.5;
        }else if (comboBoxUnidad2.getSelectedItem()=="Euros"){
            valor2= valor1/4962;
        }else if (comboBoxUnidad2.getSelectedItem()=="Libras Esterlinas"){
            valor2= valor1/5632;
        }else if (comboBoxUnidad2.getSelectedItem()=="Yen Japonés"){
            valor2= valor1/33.63;
        }else if (comboBoxUnidad2.getSelectedItem()=="Won sul-coreano"){
            valor2= valor1/3.41;
        }
        textFieldValor22.setText(String.valueOf(valor2));
        textPaneReultadoConversion.setText((textFieldValor1.getText())+" "+((String)comboBoxUnidad1.getSelectedItem())+" son= "+(textFieldValor22.getText())+" "+((String)comboBoxUnidad2.getSelectedItem()));
    }
    public void convertirMonedasInverso(){

        double valor1=Double.parseDouble(textFieldValor1.getText());
        double valor2=Double.parseDouble(textFieldValor22.getText());
        double factorConversion=0;
        if (comboBoxUnidad2.getSelectedItem()=="Dólar"){
            factorConversion=4531.5;
        }else if (comboBoxUnidad2.getSelectedItem()=="Euros"){
            factorConversion=4962;
        }else if (comboBoxUnidad2.getSelectedItem()=="Libras Esterlinas"){
            factorConversion=5632;
        }else if (comboBoxUnidad2.getSelectedItem()=="Yen Japonés"){
            factorConversion=33.63;
        }else if (comboBoxUnidad2.getSelectedItem()=="Won sul-coreano"){
            factorConversion=3.41;
        }
        valor1= valor2*factorConversion;
        textFieldValor1.setText(String.valueOf(valor1));
        textPaneReultadoConversion.setText((textFieldValor1.getText())+" "+((String)comboBoxUnidad1.getSelectedItem())+" son= "+(textFieldValor22.getText())+" "+((String)comboBoxUnidad2.getSelectedItem()));
    }


}
