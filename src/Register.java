import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Register {

	public JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		super();
		initialize();
		frame1.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 450, 600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:\r\n");
		lblNewLabel.setBounds(46, 87, 87, 20);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido 1:");
		lblNewLabel_1.setBounds(46, 191, 87, 20);
		frame1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido 2");
		lblNewLabel_2.setBounds(46, 227, 135, 20);
		frame1.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setBounds(46, 123, 69, 20);
		frame1.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Cancel\r\n");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(46, 435, 115, 29);
		frame1.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login\r\n");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(259, 435, 115, 29);
		frame1.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(197, 84, 146, 26);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 120, 146, 26);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 188, 146, 26);
		frame1.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(197, 224, 146, 26);
		frame1.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblIntroduceTusDatos = new JLabel("Introduce tus datos para crear una cuenta nueva");
		lblIntroduceTusDatos.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblIntroduceTusDatos.setBounds(15, 16, 398, 52);
		frame1.getContentPane().add(lblIntroduceTusDatos);
		
		JButton btnVueltaAlLogin = new JButton("Vuelta al login");
		btnVueltaAlLogin.setActionCommand("Open1");
		btnVueltaAlLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd1 = e.getActionCommand();

		        if(cmd1.equals("Open1"))
		        {
		            frame1.dispose();
		            new login();
		        }
			}
		});
		btnVueltaAlLogin.setBackground(Color.YELLOW);
		btnVueltaAlLogin.setBounds(15, 497, 146, 31);
		frame1.getContentPane().add(btnVueltaAlLogin);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(46, 155, 69, 20);
		frame1.getContentPane().add(lblNombre);
		
		textField_4 = new JTextField();
		textField_4.setBounds(197, 152, 146, 26);
		frame1.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
		lblFechaNacimiento.setBounds(46, 301, 135, 20);
		frame1.getContentPane().add(lblFechaNacimiento);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(46, 337, 103, 20);
		frame1.getContentPane().add(lblContrasea);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a:");
		lblRepetirContrasea.setBounds(46, 373, 146, 20);
		frame1.getContentPane().add(lblRepetirContrasea);
		
		textField_5 = new JTextField();
		textField_5.setBounds(197, 298, 146, 26);
		frame1.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 334, 146, 26);
		frame1.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(197, 370, 146, 26);
		frame1.getContentPane().add(passwordField_1);
	}
}
