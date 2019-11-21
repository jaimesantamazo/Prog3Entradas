import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setEnabled(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(6, 6, 213, 666);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APELLIDO 1");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(44, 153, 128, 16);
		panel.add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("APELLIDO 2");
		lblCorreo.setBounds(42, 206, 145, 16);
		panel.add(lblCorreo);
		
		JLabel lblNewLabel_1 = new JLabel("FECHA NACIMIENTO");
		lblNewLabel_1.setBounds(42, 267, 130, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNombreUsuario = new JLabel("NOMBRE USUARIO");
		lblNombreUsuario.setBounds(42, 322, 130, 16);
		panel.add(lblNombreUsuario);
		
		JLabel lblCorreoElectrnico = new JLabel("CORREO ELECTRÓNICO");
		lblCorreoElectrnico.setBounds(42, 378, 145, 16);
		panel.add(lblCorreoElectrnico);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setBounds(42, 443, 145, 16);
		panel.add(lblContrasea);
		
		JLabel lblRepetirContrasea = new JLabel("REPETIR CONTRASEÑA");
		lblRepetirContrasea.setBounds(42, 502, 145, 16);
		panel.add(lblRepetirContrasea);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(42, 91, 61, 16);
		panel.add(lblNombre);
		
		TextField textField_4 = new TextField();
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setBounds(261, 86, 158, 37);
		contentPane.add(textField_4);
		
		TextField textField = new TextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(261, 147, 158, 37);
		contentPane.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(261, 205, 158, 37);
		contentPane.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setBounds(261, 259, 158, 37);
		contentPane.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setBounds(261, 313, 158, 37);
		contentPane.add(textField_3);
		
		TextField textField_5 = new TextField();
		textField_5.setForeground(Color.BLACK);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_5.setBounds(261, 372, 158, 37);
		contentPane.add(textField_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(261, 434, 158, 37);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(261, 492, 158, 37);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_2 = new JLabel("GUARDAR");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setBounds(275, 592, 118, 46);
		contentPane.add(lblNewLabel_2);
		
	
		
	}
}
