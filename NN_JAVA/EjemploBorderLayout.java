import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.channels.UnsupportedAddressTypeException;

public class EjemploBorderLayout extends JFrame {
    
    public EjemploBorderLayout(){
        initComponente();
    }
    public void initComponente(){

        setTitle("BorderLayout");
        setSize(500, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
 
        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);

        JLabel etiqueta_superior = new JLabel("SUPERIOR", SwingConstants.CENTER);
        etiqueta_superior.setOpaque(true);
        etiqueta_superior.setBackground(Color.red);

        JLabel etiqueta_izquierda = new JLabel("IZQUIERDA");
        etiqueta_izquierda.setOpaque(true);
        etiqueta_izquierda.setBackground(Color.blue);

        JLabel etiqueta_centro = new JLabel("CENTRO", SwingConstants.CENTER);
        etiqueta_centro.setOpaque(true);
        etiqueta_centro.setBackground(Color.green);

        JLabel etiqueta_derecha = new JLabel("DERECHA");
        etiqueta_derecha.setOpaque(true);
        etiqueta_derecha.setBackground(Color.yellow);

        JLabel etiqueta_inferior = new JLabel("INFERIOR", SwingConstants.CENTER);
        etiqueta_inferior.setOpaque(true);
        etiqueta_inferior.setBackground(Color.orange);

        contenedor.add(etiqueta_superior, BorderLayout.NORTH);
        contenedor.add(etiqueta_izquierda, BorderLayout.WEST);
        contenedor.add(etiqueta_centro, BorderLayout.CENTER);
        contenedor.add(etiqueta_derecha, BorderLayout.EAST);
        contenedor.add(etiqueta_inferior, BorderLayout.SOUTH);

        add(contenedor);
        revalidate();

    }
}
