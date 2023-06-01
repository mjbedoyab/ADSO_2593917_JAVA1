import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Elax extends JFrame implements ActionListener {
    private int[][] board;
    private int turn;
    private JButton[][] buttons;
    private JButton resetButton;
    
    public Elax() {
        board = new int[3][3];
        turn = 1;
        buttons = new JButton[3][3];
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(this);
                c.gridx = i;
                c.gridy = j;
                panel.add(buttons[i][j], c);
            }
        }
        resetButton = new JButton("Reiniciar");
        resetButton.addActionListener(e -> reset());
        add(panel);
        add(resetButton, "South");
        setSize(300, 300);
        setResizable(false);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (e.getSource() == buttons[i][j]) {
                    if (board[i][j] == 0) {
                        board[i][j] = turn;
                        buttons[i][j].setText(turn == 1 ? "X" : "O");
                        turn = 3 - turn;
                        if (checkWin()) {
                            JOptionPane.showMessageDialog(this, "Ha ganado el jugador " + (3 - turn) + "!");
                            resetButton.setEnabled(true);
                            for (int k = 0; k < 3; k++) {
                                for (int l = 0; l < 3; l++) {
                                    buttons[k][l].setEnabled(false);
                                }
                            }
                        } else {
                            playAI();
                        }
                    }
                }
            }
        }
    }
    
    public boolean checkWin() {
        // Comprobación de columnas
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }
        
        // Comprobación de diagonal principal
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        
        // Comprobación de diagonal secundaria
        if (board[0][2] != 0 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        
        return false;
    }
    public void reset() {
        board = new int[3][3];
        turn = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
        resetButton.setEnabled(false);
    }
    
    public void playAI() {
        // Implementación de la lógica de la IA
        // En este ejemplo, la IA simplemente elige una casilla aleatoria disponible
        
        boolean played = false;
        
        while (!played) {
            int row = (int) (Math.random() * 3);
            int col = (int) (Math.random() * 3);
            if (board[row][col] == 0) {
                board[row][col] = turn;
                buttons[row][col].setText(turn == 1 ? "X" : "O");
                turn = 3 - turn;
                played = true;
                
                if (checkWin()) {
                    JOptionPane.showMessageDialog(this, "Ha ganado el jugador " + (3 - turn) + "!");
                    resetButton.setEnabled(true);
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            buttons[i][j].setEnabled(false);
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        new Elax();
    }
}


