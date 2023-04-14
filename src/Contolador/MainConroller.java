package Contolador;

import vistas.Inicio;

import javax.swing.*;
import java.awt.*;

public class MainConroller {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Inicio inicio=new Inicio();
                inicio.setSize(300,300);
                inicio.setVisible(true);
            }
        });
    }
}
