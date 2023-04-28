package vistas;

import javafx.scene.control.TitledPane;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame{
    private JComboBox comboBox1;
    private JPanel panel1;
    private JButton continuarButton;
    private JButton salirButton;

    public Inicio(){
        super("Inicio");
        setSize(329,200);
        setContentPane(panel1);
        FuncionBotones();
    }
    public void FuncionBotones(){
        continuarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (comboBox1.getSelectedItem()=="Convertidor de monedas"){
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            setVisible(false);
                            Convertidor convertidor=new Convertidor();
                            convertidor.MostrarConvertidorMoneda();
                            convertidor.setVisible(true);
                            convertidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }
                    });
                }else {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            setVisible(false);
                            Convertidor convertidor=new Convertidor();
                            convertidor.MostrarConvertidorLongitud();
                            convertidor.setVisible(true);
                            convertidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }
                    });
                }
            }
        });
        salirButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setVisible(false);
                dispose();
                ;
            }
        });
    }
}
