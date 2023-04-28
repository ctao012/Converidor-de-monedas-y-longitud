package vistas;

import javax.swing.*;
import java.awt.event.*;

public class Convertidor extends JFrame{
    private JPanel panel1;
    private JComboBox comboBoxUnidad1;
    private JComboBox comboBoxUnidad2;
    private JTextField textFieldValor1;
    private JTextField textFieldValor2;
    private JTextPane textPaneResultadoConversion;
    private JLabel jLabelTitulo;

    public Convertidor (){
        super("Convertidor");
        setSize(400,310);
        setContentPane(panel1);
    }
    public void MostrarConvertidorMoneda(){
        jLabelTitulo.setText("Convertidor de moneda");
        comboBoxUnidad1.addItem("Pesos");
        comboBoxUnidad2.addItem("Dólar");
        comboBoxUnidad2.addItem("Euros");
        comboBoxUnidad2.addItem("Libras Esterlinas");
        comboBoxUnidad2.addItem("Yen Japonés");
        comboBoxUnidad2.addItem("Won sul-coreano");
        comboBoxUnidad2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                ConvertirMonedas();

            }
        });
        textFieldValor1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyChar();
                boolean numeros = key >= 48 && key <= 57 || key == 46;
                if (!numeros) {
                    e.consume();

                }
                ConvertirMonedas();


            }
        });
        textFieldValor2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased (KeyEvent e){
                    int key = e.getKeyChar();
                    boolean numeros = key >= 48 && key <= 57 || key == 46;
                    if (!numeros) {
                        e.consume();
                    }
                    convertirMonedasInverso();
                }

        });


    }
    public void ConvertirMonedas(){

        double valor1=0;
        double valor2=0;
        double factorConversion=0;

        try {valor1=Double.parseDouble(textFieldValor1.getText());}catch (NumberFormatException e){}

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

        valor2=valor1/factorConversion;
        textFieldValor2.setText(String.valueOf(valor2));
        textPaneResultadoConversion.setText(valor1+" "+((String)comboBoxUnidad1.getSelectedItem())+" son= "+valor2+" "+((String)comboBoxUnidad2.getSelectedItem()));
    }
    public void convertirMonedasInverso(){
        double valor1=0;
        double valor2=0;
        double factorConversion=0;

        try {
            valor2 = Double.parseDouble(textFieldValor2.getText());
        }catch (NumberFormatException e){}

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
        textPaneResultadoConversion.setText(valor1+" "+((String)comboBoxUnidad1.getSelectedItem())+" son= "+valor2+" "+((String)comboBoxUnidad2.getSelectedItem()));
    }


}
