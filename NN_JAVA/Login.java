import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.channels.UnsupportedAddressTypeException;


public class Login extends JFrame {
    
    private JPanel contenedor;
    private GridLayout capa;
    private JLabel etiqueta_usuario;
    private JLabel etiqueta_password;
    private JTextField campo_usuario;
    private JPasswordField campo_password;
    private JButton btn_ingresar;
    private JButton btn_cancelar;

    public Login() {
        initComponente();
    }
    public void initComponente() {

        setVisible(true);
        setTitle("NUEVA");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contenedor = new JPanel();
        capa = new GridLayout(3,2);
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(10, 10, 10, 10));

        etiqueta_usuario = new JLabel("USUARIO: ");
        etiqueta_password = new JLabel("PASSWORD: ");
        campo_usuario = new JTextField();
        campo_password = new JPasswordField();
        btn_ingresar = new JButton("INGRESAR");
        btn_cancelar = new JButton("CANCELAR");

        contenedor.add(etiqueta_usuario);
        contenedor.add(campo_usuario);
        contenedor.add(etiqueta_password);
        contenedor.add(campo_password);
        contenedor.add(btn_ingresar);
        contenedor.add(btn_cancelar);

        add(contenedor);
        pack();

        ActionListener evento_ingresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarDatosSesion();
            }
        };
        btn_ingresar.addActionListener(evento_ingresar);

        ActionListener evento_cancela = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarVentana();
            }
        };
        btn_cancelar.addActionListener(evento_cancela);
    }
    public void validarDatosSesion() {
        String texto_usuario = campo_usuario.getText();
        String texto_password = campo_password.getText();

        System.out.println(" --> Usuario: "+texto_usuario);
        System.out.println(" --> Pass: "+texto_password);
    }
    public void cerrarVentana() {
        System.out.println("-- CERRANDO APLICACION ---------");
        dispose();
    } 
}

