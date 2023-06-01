import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.nio.channels.UnsupportedAddressTypeException;

public class EjercicicoLayout extends JFrame{
    
    public EjercicicoLayout(){

        initComponet();
    }
    public void initComponet() {
        
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamano = sistema.getScreenSize();

        setTitle("FORMATO MONEDA");
        setSize(tamano.width/2, tamano.height/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel principal = new JPanel();
        GridLayout capa1 = new GridLayout(2,1);
        principal.setLayout(capa1);
        principal.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(1,3);
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(10, 10, 10, 10));
        principal.add(contenedor);

        JLabel cantidad = new JLabel("CANTIDAD: ");
        JTextField campo = new JTextField();
        JButton btn_ejecutar = new JButton("EJECUTAR");
        JLabel vacio = new JLabel();


        contenedor.add(cantidad);
        contenedor.add(campo);
        contenedor.add(btn_ejecutar);

        principal.add(vacio);

        add(principal);
        pack();

        ActionListener evento_01 = new ActionListener() {

            public void actionPerformed( ActionEvent e) {
                String texto = campo.getText();
                if (!texto.equalsIgnoreCase("")) {
                    vacio.setText(texto);
                    campo.setText("");
                }

            }
        };
        btn_ejecutar.addActionListener(evento_01);

    }
}
