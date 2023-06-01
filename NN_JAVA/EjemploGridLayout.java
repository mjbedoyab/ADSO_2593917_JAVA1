import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.UnsupportedAddressTypeException;

public class EjemploGridLayout extends JFrame {
    
    public EjemploGridLayout(){
        initComponente();
    }
    public void initComponente(){

        setTitle("GridLayout");
        setSize(500, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
 
        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(3, 4);
        contenedor.setLayout(capa);

        //CREAR EL AREGLO DE JTextField
        JTextField arreglo_input [] = new JTextField [12];

        //INSTANCIAR CADA POSICION DEL ARRELO CON UN OBJETO JTextField
        for (int i = 0; i < arreglo_input.length; i++) {
            arreglo_input[i] = new JTextField();
        }

        //ASIGNAR CADA INPUT EN EL CONTENEDOR
        for (int i = 0; i < arreglo_input.length; i++) {
            contenedor.add(arreglo_input[i] );
        }

        add(contenedor);
        revalidate();

    }
}
