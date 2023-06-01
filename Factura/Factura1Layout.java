import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Factura1Layout extends JFrame {

	private Persona listaClientes [];
	private PersonaV listaVendedores [];
	private JTextField input_cedula;
	private JTextField input_nombre;
	private JTextField input_direccion;
	private JTextField input_cedulas;
	private JTextField input_nombres;
	private JTextField input_nom;
    
    public Factura1Layout(Persona[] listaClientes, PersonaV[] listaVendedores) {
		this.listaClientes = listaClientes;
		this.listaVendedores = listaVendedores;
        initComponet();
    }
    public void initComponet() {
        
        Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

        setTitle("FACTURA");
		setSize( tamanio.width/2 , tamanio.height/2 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);

        JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20) );
		GridBagConstraints restriccion = new GridBagConstraints();

        JLabel datos_cliente = new JLabel("DATOS CLIENTES:");
        datos_cliente.setFont( new Font("Arial", Font.BOLD, 15) );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( datos_cliente, restriccion );

        JLabel cedula = new JLabel("CEDULA:");
		restriccion.gridy = 1;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( cedula, restriccion );

		input_cedula = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 1;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 1;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedula, restriccion );

		JButton btn_buscar = new JButton("BUSCAR");
		restriccion.gridy = 1;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar, restriccion );

        JLabel nombre = new JLabel("NOMBRE:");
		restriccion.gridy = 2;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( nombre, restriccion );

		input_nombre = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 2;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 1;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(5, 10, 5, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombre, restriccion );

        JLabel direccion = new JLabel("DIRECCION:");
		restriccion.gridy = 3;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( direccion, restriccion );

		input_direccion = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 3;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 1;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(5, 10, 5, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_direccion, restriccion );

        JLabel datos_vendedor = new JLabel("DATOS VENDEDOR:");
        datos_vendedor.setFont( new Font("Arial", Font.BOLD, 15) );
		restriccion.gridy = 4;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( datos_vendedor, restriccion );

        JLabel cedulas = new JLabel("CEDULAS:");
		restriccion.gridy = 5;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( cedulas, restriccion );

        input_cedulas = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 5;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 1;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedulas, restriccion );

		JButton btn_buscar1 = new JButton("BUSCAR");
		restriccion.gridy = 5;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar1, restriccion );

        JLabel nombres = new JLabel("NOMBRE:");
		restriccion.gridy = 6;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( nombres, restriccion );

		input_nombres = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 6;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 1;
		restriccion.weightx = 90;
		restriccion.insets = new Insets(5, 10, 5, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombres, restriccion );

        JLabel lista_productos = new JLabel("LISTA DE PRODUCTOS FACTURADOS:");
        lista_productos.setFont( new Font("Arial", Font.BOLD, 15) );
		restriccion.gridy = 7;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( lista_productos, restriccion );

        JLabel id = new JLabel("ID:");
        id.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( id, restriccion );

        JLabel nombre1 = new JLabel("NOMBRE:");
        nombre1.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 70;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( nombre1, restriccion );

        JLabel cant = new JLabel("CANT:");
        cant.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( cant, restriccion );

        JLabel vacio = new JLabel();
		restriccion.gridy = 8;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( vacio, restriccion );

        JTextField input_id = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 9;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_id, restriccion );

        input_nom = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 9;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 70;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nom, restriccion );

        JTextField input_cant = new JTextField();
		input_cedula.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy = 9;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cant, restriccion );

        JButton btn_agregar = new JButton("AGREGAR");
		restriccion.gridy = 9;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_agregar, restriccion );

        JLabel etq_resultado = new JLabel(" ---- ");
		etq_resultado.setHorizontalAlignment( JLabel.RIGHT );
		etq_resultado.setVerticalAlignment( JLabel.TOP );
		etq_resultado.setFont( new Font("Arial", Font.BOLD, 10) );
		etq_resultado.setOpaque(true);
		etq_resultado.setBackground( Color.white );
		etq_resultado.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
		restriccion.gridy = 10;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 89;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		restriccion.insets = new Insets(10, 0, 0, 10);
		contPrincipal.add( etq_resultado, restriccion );

		JLabel etq_total = new JLabel("Total: $ 0");
		etq_total.setHorizontalAlignment( JLabel.RIGHT );
		etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_total.setOpaque(true);
		etq_total.setBackground( Color.white );
		etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 11;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		restriccion.insets = new Insets(0, 0, 0, 10);
		contPrincipal.add( etq_total, restriccion );
        

        add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

		ActionListener evento_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarCliente();
			}
		};
		btn_buscar.addActionListener( evento_01 );

		ActionListener evento_02 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarvendedor();
			}
		};
		btn_buscar1.addActionListener( evento_02 );

    }
	public boolean validarNumero(String texto){
		int contador = 0;
		for (int i=0; i<texto.length(); i++) {
			int codigo = (int) texto.charAt(i);
			if ((codigo<48 || codigo>57) && codigo!=44 && codigo!=45 && codigo!=46){
				return false;
			}
			if (codigo==44 || codigo==46){
				contador++;
			}
		}
		return (contador<=1);
	}

	public String formatoMoneda(String texto){
		Double numero = Double.parseDouble(texto.replace(",","."));
		NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		return formatoMoneda.format(numero).replaceAll(",00","");
	}

	public void buscarCliente(){
		String texto = input_cedula.getText().replaceAll(" ", "");
		boolean encontrado = false;
		for (int i=0; i<this.listaClientes.length; i++) {
			if(this.listaClientes[i]!=null && this.listaClientes[i].getCedula().equalsIgnoreCase(texto)){
				this.input_nombre.setText( this.listaClientes[i].getNombres() );
				this.input_direccion.setText( this.listaClientes[i].getDireccion() );
				encontrado = true;
				break;
			}
		}

		if(encontrado){
			deshabilitarInput(this.input_nombre);
			deshabilitarInput(this.input_direccion);
			this.input_cedulas.requestFocus();
		}else{
			habilitarInput(this.input_nombre);
			habilitarInput(this.input_direccion);
			this.input_nombre.requestFocus();
		}	
	}

	public void buscarvendedor(){
		String texto = input_cedulas.getText().replaceAll(" ", "");
		boolean encontrado1 = false;
		for (int i=0; i<this.listaVendedores.length; i++) {
			if(this.listaVendedores[i]!=null && this.listaVendedores[i].getCedulavendedores().equalsIgnoreCase(texto)){
				this.input_nombres.setText( this.listaVendedores[i].getNombrevendedores() );
				encontrado1 = true;
				break;
			}
		}

		if(encontrado1){
			deshabilitarInput(this.input_nombres);
			this.input_cedulas.requestFocus();
		}else{
			habilitarInput(this.input_nombres);
			this.input_nombres.requestFocus();
		}	
	}

	

	public void deshabilitarInput(JTextField input){
		input.setEditable(false);
		input.setEnabled(false);
		input.setDisabledTextColor(Color.black);
	}

	public void habilitarInput(JTextField input){
		input.setText("");
		input.setEditable(true);
		input.setEnabled(true);
	}
}
