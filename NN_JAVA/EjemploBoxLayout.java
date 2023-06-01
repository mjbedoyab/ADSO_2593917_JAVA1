import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.channels.UnsupportedAddressTypeException;

public class EjemploBoxLayout extends JFrame {
    
    public EjemploBoxLayout(){
        initComponente();
    }
    public void initComponente(){
        setTitle("BoxLayout");
        setSize(500, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
 
        JPanel contenedor = new JPanel();
        BoxLayout capa = new BoxLayout(contenedor, BoxLayout.Y_AXIS);
        contenedor.setLayout(capa);

        JLabel etiqueta_01 = new JLabel("etiqueta 01");
        JLabel etiqueta_02 = new JLabel("etiqueta 02");
        JLabel etiqueta_03 = new JLabel("etiqueta 03");
        JLabel etiqueta_04 = new JLabel("etiqueta 04");
        JLabel etiqueta_05 = new JLabel("etiqueta 05");

        contenedor.add(etiqueta_01);
        contenedor.add(etiqueta_02);
        contenedor.add(etiqueta_03);
        contenedor.add(etiqueta_04);
        contenedor.add(etiqueta_05);

        add(contenedor);
        revalidate();
    }
}
