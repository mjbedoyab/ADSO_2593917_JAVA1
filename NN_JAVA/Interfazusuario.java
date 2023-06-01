import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.UnsupportedAddressTypeException;

public class Interfazusuario {
    public static void main(String[] args) {
        
        Toolkit info_sistema = Toolkit.getDefaultToolkit();
        Dimension pantalla = info_sistema.getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;

        JFrame ventana = new JFrame();
        ventana.setVisible(true);

        int ancho_app = (int)(ancho*0.5);
        int alto_app = (int)(alto*0.5);
        //ventana.setSize(ancho_app, alto_app);

        ventana.setTitle("INGRESO");
        ventana.setResizable(false);
        ventana.setLocation( (int) (ancho*0.25) , (int) (alto*0.25) );
        //ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );


        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(3,2);
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(10,10,10,10));

        //ETIQUETAS
        JLabel etiquet_username = new JLabel("USERNAME: ");
        JLabel etiqueta_password = new JLabel("PASSWORD: ");

        //CAMPOS FE TEXTO
        JTextField campo_username = new JTextField();
        JPasswordField campo_Password = new JPasswordField();

        //BOTONES
        JButton btn_ingresar = new JButton("INGRESAR");
        JButton btn_cancelar = new JButton("CANCELAR");


        contenedor.add(etiquet_username);
        contenedor.add(campo_username);
        contenedor.add(etiqueta_password);
        contenedor.add(campo_Password);
        contenedor.add(btn_ingresar);
        contenedor.add(btn_cancelar);

        ventana.add(contenedor);
        //ventana.revalidate();
        ventana.pack();


        //EVENTOS
        ActionListener evento_ingresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n\nSe ha dado click en el boton ingresar");

                String texto_usuario = campo_username.getText();
                String texto_pass = campo_Password.getText();
                System.out.println(" -> Usuario: "+texto_usuario);
                System.out.println(" -> password: "+texto_pass);
            }
        };
        ActionListener evento_cancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha dado click en cancelar");
                ventana.dispose();
            }
        };

        btn_ingresar.addActionListener(evento_ingresar);
        btn_cancelar.addActionListener(evento_cancelar);

    }

}
