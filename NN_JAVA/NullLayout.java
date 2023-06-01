import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.channels.UnsupportedAddressTypeException;

public class NullLayout extends JFrame {
    
    public NullLayout(){
        initComponente();
    }
    public void initComponente(){
        setVisible(true);
        setSize(400, 500);
        setTitle("NULL LAYOUT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(null);

        JButton btn = new JButton("Hola Mundo");
        contenedor.add(btn);
        btn.setBounds(100, 100, 100, 50);

        add(contenedor);
        revalidate();

    }
}
