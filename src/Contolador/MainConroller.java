package Contolador;

import vistas.Inicio;

import javax.swing.*;

public class MainConroller {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Inicio inicio=new Inicio();
                inicio.setVisible(true);
                inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
