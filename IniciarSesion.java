import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JPasswordField;

public class IniciarSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IniciarSesion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 200, 556, 389);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 279, 356);
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		TextField textField = new TextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setBounds(67, 112, 142, 33);
		panel.add(textField);
		
		Label label = new Label("NOMBRE DE USUARIO");
		label.setForeground(Color.BLACK);
		label.setBounds(67, 73, 142, 33);
		panel.add(label);
		
		Label label_1 = new Label("CONTRASEÑA");
		label_1.setBounds(67, 161, 142, 33);
		panel.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 200, 142, 33);
		panel.add(passwordField);
		
		JButton btnIniciar = new JButton("INICIAR");
		btnIniciar.setBounds(351, 166, 117, 29);
		contentPane.add(btnIniciar);
	}

}
