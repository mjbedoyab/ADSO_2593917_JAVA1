import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.channels.UnsupportedAddressTypeException;

public class EjemploFlowLayout extends JFrame {
    
    public EjemploFlowLayout(){
        initComponente();
    }
    public void initComponente(){
       setTitle("FlowLayout");
       setSize(500, 400); 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);

       JPanel contenedor = new JPanel();
       FlowLayout capa = new FlowLayout();
       contenedor.setLayout(capa);

       JButton btn = new JButton("Boton");
       JTextField campo = new JTextField();
       campo.setColumns(15);
       JCheckBox check = new JCheckBox("CheckBox");
       JLabel etiqueta = new JLabel("etiqueta");

       contenedor.add(btn);
       contenedor.add(campo);
       contenedor.add(check);
       contenedor.add(etiqueta);

       add(contenedor);
       revalidate();

    }
}
