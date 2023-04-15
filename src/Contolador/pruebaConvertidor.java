package Contolador;

import vistas.Convertidor;
import vistas.Inicio;

import javax.swing.*;

public class pruebaConvertidor {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Convertidor convertidor=new Convertidor();
                convertidor.setVisible(true);
            }
        });
    }
}
