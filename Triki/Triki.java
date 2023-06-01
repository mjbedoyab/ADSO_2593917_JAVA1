import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triki extends JFrame{

	int ganador;
	int turno;
	char tablero_interno [][];
	JLabel tablero_lbls [][];
	JLabel etq_usuario;

	public Triki(){
		this.ganador = 0;
		this.turno = 1;
		initComponents();
	}

	public void initComponents(){

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(5, 5, 5, 5) );
		GridBagConstraints restriccion = new GridBagConstraints();

		etq_usuario = new JLabel("-");
		etq_usuario.setFont(new Font("Arial black", Font.BOLD, 30));
		etq_usuario.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 1;
		restriccion.weightx = 3;
		restriccion.insets = new Insets(5,5,5,5);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(etq_usuario, restriccion);

		tablero_interno = new char [3][3];
		tablero_lbls = new JLabel [3][3];
		for (int i=0; i<tablero_lbls.length; i++) {
			for (int j=0; j<tablero_lbls[i].length; j++) {
				tablero_lbls[i][j] = new JLabel();
				tablero_interno[i][j] = '-';
				tablero_lbls[i][j].setFont(new Font("Snap ITC",Font.BOLD,65));
				tablero_lbls[i][j].setOpaque(true);
				tablero_lbls[i][j].setBackground( Color.white );
				tablero_lbls[i][j].setHorizontalAlignment( JLabel.CENTER );
				restriccion.gridy = (i+1);
				restriccion.gridx = j;
				restriccion.gridheight = 1;
				restriccion.gridwidth = 1;
				restriccion.weighty = 1;
				restriccion.weightx = 1;
				restriccion.fill = GridBagConstraints.BOTH;
				restriccion.insets = new Insets(5,5,5,5);
				contPrincipal.add( tablero_lbls[i][j], restriccion );

				final int fila = i;
                final int columna = j;
                MouseAdapter evento = new MouseAdapter(){
                    @Override
	                public void mouseClicked(MouseEvent e) {
	                    marcarCasilla( fila, columna);
	                }             
                };
                this.tablero_lbls[i][j].addMouseListener(evento);
			}
		}
		add(contPrincipal);
		setTitle("Tres en Linea");
		setSize(400,400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setVisible(true);

		imprimirTablero();
	}

	public void imprimirTablero(){
		this.etq_usuario.setText( (this.turno==1)? "Usuario":"IA" );
		this.etq_usuario.setForeground( (this.turno==1)? Color.black:Color.red );
		for (int i=0; i<tablero_interno.length; i++) {
			for (int j=0; j<tablero_interno[i].length; j++) {
				this.tablero_lbls[i][j].setText( String.valueOf(this.tablero_interno[i][j]) );
			}
		}
		revalidate();
	}
	public void marcarCasilla(int fila, int columna) {
		if (this.tablero_interno[fila][columna] == '-') {
			char ficha = (this.turno == 1) ? 'X' : 'O';
			this.tablero_interno[fila][columna] = ficha;
			this.tablero_lbls[fila][columna].setForeground((this.turno == 1) ? Color.black : Color.red);
			this.turno = (this.turno % 2) + 1;
			this.imprimirTablero();
	
			if (validarGanador()) {
				JOptionPane.showMessageDialog(this, "¡Ha ganado el jugador " + ((this.turno == 1) ? "Usuario" : "IA") + "!");
				reiniciarJuego();
			} else if (empate()) {
				JOptionPane.showMessageDialog(this, "¡Empate!");
				reiniciarJuego();
			} else if (this.turno == 2) {
				jugadaMaquina();
			}
		} else {
			System.out.println("La posición es inválida.");
		}
	}
	
	public boolean validarGanador() {
		// Validar filas
		for (int i = 0; i < tablero_interno.length; i++) {
			if (tablero_interno[i][0] != '-' && tablero_interno[i][0] == tablero_interno[i][1] && tablero_interno[i][1] == tablero_interno[i][2]) {
				this.ganador = (tablero_interno[i][0] == 'X') ? 1 : 2;
				return true;
			}
		}
		// Validar columnas
		for (int j = 0; j < tablero_interno[0].length; j++) {
			if (tablero_interno[0][j] != '-' && tablero_interno[0][j] == tablero_interno[1][j] && tablero_interno[1][j] == tablero_interno[2][j]) {
				this.ganador = (tablero_interno[0][j] == 'X') ? 1 : 2;
				return true;
			}
		}
		// Validar diagonal principal
		if (tablero_interno[0][0] != '-' && tablero_interno[0][0] == tablero_interno[1][1] && tablero_interno[1][1] == tablero_interno[2][2]) {
			this.ganador = (tablero_interno[0][0] == 'X') ? 1 : 2;
			return true;
		}
		// Validar diagonal secundaria
		if (tablero_interno[0][2] != '-' && tablero_interno[0][2] == tablero_interno[1][1] && tablero_interno[1][1] == tablero_interno[2][0]) {
			this.ganador = (tablero_interno[0][2] == 'X') ? 1 : 2;
			return true;
		}
		return false;
	}
	
	public boolean empate() {
		for (int i = 0; i < tablero_interno.length; i++) {
			for (int j = 0; j < tablero_interno[0].length; j++) {
				if (tablero_interno[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
	
	public void reiniciarJuego() {
		this.ganador = 0;
		this.turno = 1;
		for (int i = 0; i < tablero_interno.length; i++) {
			for (int j = 0; j < tablero_interno[i].length; j++) {
				tablero_interno[i][j] = '-';
				tablero_lbls[i][j].setText("");
				tablero_lbls[i][j].setBackground(Color.white);
			}
		}
		imprimirTablero();
	}
	
	public void jugadaMaquina() {
		Random random = new Random();
		int fila, columna;
		
		// Buscar una jugada para bloquear al jugador
		if (hayJugadaParaBloquear()) {
			// Realizar la jugada para bloquear
			int[] jugadaBloqueo = obtenerJugadaParaBloquear();
			fila = jugadaBloqueo[0];
			columna = jugadaBloqueo[1];
		} else {
			// Hacer un movimiento aleatorio
			do {
				fila = random.nextInt(3);
				columna = random.nextInt(3);
			} while (tablero_interno[fila][columna] != '-');
		}
		
		marcarCasilla(fila, columna);
	}
	private boolean hayJugadaParaBloquear() {
		// Verificar filas
		for (int i = 0; i < 3; i++) {
			if (tablero_interno[i][0] == 'X' && tablero_interno[i][1] == 'X' && tablero_interno[i][2] == '-') {
				return true;
			}
			if (tablero_interno[i][0] == 'X' && tablero_interno[i][1] == '-' && tablero_interno[i][2] == 'X') {
				return true;
			}
			if (tablero_interno[i][0] == '-' && tablero_interno[i][1] == 'X' && tablero_interno[i][2] == 'X') {
				return true;
			}
		}
		
		// Verificar columnas
		for (int j = 0; j < 3; j++) {
			if (tablero_interno[0][j] == 'X' && tablero_interno[1][j] == 'X' && tablero_interno[2][j] == '-') {
				return true;
			}
			if (tablero_interno[0][j] == 'X' && tablero_interno[1][j] == '-' && tablero_interno[2][j] == 'X') {
				return true;
			}
			if (tablero_interno[0][j] == '-' && tablero_interno[1][j] == 'X' && tablero_interno[2][j] == 'X') {
				return true;
			}
		}
		
		// Verificar diagonales
		if (tablero_interno[0][0] == 'X' && tablero_interno[1][1] == 'X' && tablero_interno[2][2] == '-') {
			return true;
		}
		if (tablero_interno[0][0] == 'X' && tablero_interno[1][1] == '-' && tablero_interno[2][2] == 'X') {
			return true;
		}
		if (tablero_interno[0][0] == '-' && tablero_interno[1][1] == 'X' && tablero_interno[2][2] == 'X') {
			return true;
		}
		
		// Verificar diagonal inversa
		if (tablero_interno[0][2] == 'X' && tablero_interno[1][1] == 'X' && tablero_interno[2][0] == '-') {
			return true;
		}
		if (tablero_interno[0][2] == 'X' && tablero_interno[1][1] == 'X' && tablero_interno[2][0] == '-') {
			return true;
		}
		if (tablero_interno[0][2] == 'X' && tablero_interno[1][1] == '-' && tablero_interno[2][0] == 'X') {
			return true;
		}
		if (tablero_interno[0][2] == '-' && tablero_interno[1][1] == 'X' && tablero_interno[2][0] == 'X') {
			return true;
		}
		
		return false;
	}
	
	private int[] obtenerJugadaParaBloquear() {
		int[] jugada = new int[2];
	
		// Verificar filas
		for (int i = 0; i < 3; i++) {
			if (tablero_interno[i][0] == 'X' && tablero_interno[i][1] == 'X' && tablero_interno[i][2] == '-') {
				jugada[0] = i;
				jugada[1] = 2;
				return jugada;
			}
			if (tablero_interno[i][0] == 'X' && tablero_interno[i][1] == '-' && tablero_interno[i][2] == 'X') {
				jugada[0] = i;
				jugada[1] = 1;
				return jugada;
			}
			if (tablero_interno[i][0] == '-' && tablero_interno[i][1] == 'X' && tablero_interno[i][2] == 'X') {
				jugada[0] = i;
				jugada[1] = 0;
				return jugada;
			}
		}
	
		// Verificar columnas
		for (int j = 0; j < 3; j++) {
			if (tablero_interno[0][j] == 'X' && tablero_interno[1][j] == 'X' && tablero_interno[2][j] == '-') {
				jugada[0] = 2;
				jugada[1] = j;
				return jugada;
			}
			if (tablero_interno[0][j] == 'X' && tablero_interno[1][j] == '-' && tablero_interno[2][j] == 'X') {
				jugada[0] = 1;
				jugada[1] = j;
				return jugada;
			}
			if (tablero_interno[0][j] == '-' && tablero_interno[1][j] == 'X' && tablero_interno[2][j] == 'X') {
				jugada[0] = 0;
				jugada[1] = j;
				return jugada;
			}
		}
	
		// Verificar diagonales
		if (tablero_interno[0][0] == 'X' && tablero_interno[1][1] == 'X' && tablero_interno[2][2] == '-') {
			jugada[0] = 2;
			jugada[1] = 2;
			return jugada;
		}
		if (tablero_interno[0][0] == 'X' && tablero_interno[1][1] == '-' && tablero_interno[2][2] == 'X') {
			jugada[0] = 1;
			jugada[1] = 1;
			return jugada;
		}
		if (tablero_interno[0][0] == '-' && tablero_interno[1][1] == 'X' && tablero_interno[2][2] == 'X') {
			jugada[0] = 0;
			jugada[1] = 0;
			return jugada;
		}
	
		// Verificar diagonal inversa
		if (tablero_interno[0][2] == 'X' && tablero_interno[1][1] == 'X' && tablero_interno[2][0] == '-') {
			jugada[0] = 2;
			jugada[1] = 0;
			return jugada;
		}
		if (tablero_interno[0][2] == 'X' && tablero_interno[1][1] == '-' && tablero_interno[2][0] == 'X') {
			jugada[0] = 1;
			jugada[1] = 1;
			return jugada;
		}
		if (tablero_interno[0][2] == '-' && tablero_interno[1][1] == 'X' && tablero_interno[2][0] == 'X') {
			jugada[0] = 0;
			jugada[1] = 2;
			return jugada;
		}
	
		return jugada;
	}
	
	
	


	public static void main(String[] args) {
        // TODO code application logic here
        new Triki();
    }


}