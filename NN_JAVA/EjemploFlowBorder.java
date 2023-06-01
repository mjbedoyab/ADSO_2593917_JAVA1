import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.UnsupportedAddressTypeException;

public class EjemploFlowBorder extends JFrame {
    
    public EjemploFlowBorder(){
        initComponente();
    }
    public void initComponente(){
       setTitle("FlowBorderLayout");
       setSize(500, 400); 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);

       JPanel contenedor = new JPanel();
       BorderLayout capa = new BorderLayout();
       contenedor.setLayout(capa);

       JButton btn_1 = new JButton("BOTON 1");
       btn_1.setOpaque(true);
       btn_1.setBackground(Color.orange);

       JButton btn_2 = new JButton("BOTON 2");
       JButton btn_3 = new JButton("BOTON 3");

       JPanel contenedor_centro = new JPanel();
       FlowLayout panel_centro = new FlowLayout();
       contenedor_centro.setLayout(panel_centro);

       contenedor_centro.add(btn_1);
       contenedor_centro.add(btn_2);

       contenedor.add(contenedor_centro, BorderLayout.CENTER);
       contenedor.add(btn_3, BorderLayout.SOUTH);

       add(contenedor);
       pack();
    }
}
