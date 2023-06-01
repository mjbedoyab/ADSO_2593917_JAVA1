import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class TriikiiLayout extends JFrame {

    int ganador;
	int turno;
    private JLabel campo [][];
    char tablero_interno [][];
    private JLabel etq_usuario;
    
    public TriikiiLayout () {
        this.ganador = 0;
		this.turno = 1;
        initComponet();
    }
    public void initComponet() {
        Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

        setTitle(" TRIKI ");
		setSize( tamanio.width/2 , tamanio.height/2 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);

        JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(1, 1, 1, 1) );
		GridBagConstraints restriccion = new GridBagConstraints(); 

        tablero_interno = new char [3][3];
        campo = new JLabel [3][3];
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                campo[i][j] = new JLabel();
                tablero_interno[i][j] = '-';
                campo[i][j].setFont( new Font("Snap ITC", Font.BOLD, 70) );
                campo[i][j].setHorizontalAlignment( JLabel.CENTER );
                campo[i][j].setOpaque(true); 
                campo[i][j].setBackground(Color.white);
                campo[i][j].setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                restriccion.gridy = i;
                restriccion.gridx = j;
                restriccion.gridheight = 1;
                restriccion.gridwidth = 1;
                restriccion.weighty = 1;
                restriccion.weightx = 1;
                restriccion.fill = GridBagConstraints.BOTH;
                restriccion.insets = new Insets(3, 3, 3, 3);
                contPrincipal.add( campo[i][j], restriccion );

                final int fila = i;
                final int columna = j;
                MouseAdapter evento = new MouseAdapter(){
                    @Override
	                public void mouseClicked(MouseEvent e) {
	                    marcarCasilla( fila, columna);
	                }             
                };
                this.campo[i][j].addMouseListener(evento);
                
            }
            
        }

        etq_usuario = new JLabel("-");
		etq_usuario.setFont(new Font("Arial black", Font.BOLD, 30));
		etq_usuario.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 3;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 1;
		restriccion.weightx = 3;
		restriccion.insets = new Insets(5,5,5,5);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(etq_usuario, restriccion);

        add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();
        imprimirTablero();
    }
    public void imprimirTablero(){
		this.etq_usuario.setText( (this.turno==1)? "Usuario":"IA" );
		this.etq_usuario.setForeground( (this.turno==1)? Color.black:Color.red );
		for (int i=0; i<tablero_interno.length; i++) {
			for (int j=0; j<tablero_interno[i].length; j++) {
				this.campo[i][j].setText( String.valueOf(this.tablero_interno[i][j]) );
			}
		}
		revalidate();
	}

    public void marcarCasilla(int fila, int columna){
		if( this.tablero_interno[fila][columna]=='-'){
			char ficha = (this.turno==1)? 'X':'0';
			this.tablero_interno[fila][columna] = ficha;
			this.campo[fila][columna].setForeground( (this.turno==1)? Color.black:Color.red );
			this.turno = (this.turno%2)+1;
			this.imprimirTablero();
		}else{
			System.out.println("La Posicion es invalida.");
		}

	}
    public static void main(String[] args) {
        new TriikiiLayout();
    }
}
