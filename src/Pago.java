import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class Pago {

	private JFrame frame3;
	private JTextField textTarjeta;
	private JTextField textFecha;
	private JTextField textCCV;
	private JTextField textDNI;
	private JTextField textemail;
	private int limiteTarjeta =16;
	private int limiteCCV=3;
	private int limiteFecha=4;
	private int limiteDNI=9;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Pago window = new Pago();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pago() {
		super();
		initialize();
		frame3.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setBounds(100, 100, 586, 459);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);

		JLabel lblCorreo = new JLabel("E-mail:");
		lblCorreo.setBounds(25, 143, 69, 20);
		frame3.getContentPane().add(lblCorreo);

		textemail = new JTextField();
		textemail.setBounds(205, 140, 258, 26);
		frame3.getContentPane().add(textemail);
		textemail.setColumns(10);


		JLabel lblNumeroTarjeta = new JLabel("Numero tarjeta:");
		lblNumeroTarjeta.setBounds(25, 179, 126, 20);
		frame3.getContentPane().add(lblNumeroTarjeta);


		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(25, 210, 69, 20);
		frame3.getContentPane().add(lblFecha);


		JLabel lblCcv = new JLabel("CCV:");
		lblCcv.setBounds(25, 246, 69, 20);
		frame3.getContentPane().add(lblCcv);


		JLabel lblDniCliente = new JLabel("DNI cliente:");
		lblDniCliente.setBounds(25, 277, 126, 20);
		frame3.getContentPane().add(lblDniCliente);



		JLabel lblIntroduceLosDatos = new JLabel("Introduce los datos de tu tarjeta para validar los datos");
		lblIntroduceLosDatos.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblIntroduceLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduceLosDatos.setBounds(15, 16, 534, 49);
		frame3.getContentPane().add(lblIntroduceLosDatos);

		textemail = new JTextField();
		textemail.setBounds(212, 140, 250, 26);
		frame3.getContentPane().add(textemail);
		textemail.setColumns(10);

		textTarjeta= new JTextField();
		textTarjeta.setBounds(205, 176, 258, 26);
		frame3.getContentPane().add(textTarjeta);
		textTarjeta.setColumns(10);


		textTarjeta.addKeyListener(new KeyListener(){

		public void keyTyped(KeyEvent e){
			char c= e.getKeyChar();
			if (textTarjeta.getText().length()== limiteTarjeta | !Character.isDigit(c))

		     e.consume();

		}

		public void keyPressed(KeyEvent arg0) {
		}

		public void keyReleased(KeyEvent arg0) {
		}
		});
		textFecha = new JTextField();
		textFecha.setBounds(205, 207, 132, 26);
		frame3.getContentPane().add(textFecha);
		textFecha.setColumns(10);


		textFecha.addKeyListener(new KeyListener(){


			public void keyTyped(KeyEvent e){
				char c=e.getKeyChar();

				if (textFecha.getText().length()== limiteFecha|!Character.isDigit(c))

			     e.consume();
			}

			public void keyPressed(KeyEvent arg0) {
			}

			public void keyReleased(KeyEvent arg0) {
			}
			});


		textCCV = new JTextField();
		textCCV.setBounds(205, 243, 132, 26);
		frame3.getContentPane().add(textCCV);
		textCCV.setColumns(10);

		textCCV.addKeyListener(new KeyListener(){


			public void keyTyped(KeyEvent e)

			{
				char c=e.getKeyChar();
				if (textCCV.getText().length()== limiteCCV| !Character.isDigit(c)) {

			     e.consume();}
			}

			public void keyPressed(KeyEvent arg0) {
			}

			public void keyReleased(KeyEvent arg0) {
			}
			});




		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBackground(Color.GREEN);
		btnPagar.setBounds(344, 313, 115, 29);
		frame3.getContentPane().add(btnPagar);
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textDNI.getText().isEmpty()|textCCV.getText().isEmpty()|textTarjeta.getText().isEmpty()|textFecha.getText().isEmpty()|textemail.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Rellene los campos vacios");
				}else {
					JOptionPane.showMessageDialog(null, "Gracias por su compra");
				}
				conexion conexion = new conexion();
				Connection cn4 = conexion.conectar();
				String nombre;
				int cantidad = 0;
				String sql4 = "";
				nombre = textField_1.getText();
				sql4 = "update entradas set cantidad = cantidad-1 where nombre = ?";
				try {
					PreparedStatement pst4 = cn4.prepareStatement(sql4);
					pst4.setString(2, nombre);
					pst4.setInt(6, cantidad);
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
			}		
			
		});


		JButton btnCancel = new JButton("Salir\r\n");
		btnCancel.setActionCommand("Open20");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btnVueltaAlLogin = new JButton("Vuelta al login");
				String cmd20 = e.getActionCommand();

		        if(cmd20.equals("Open20"))
		        {
		            frame3.dispose();
		            new Login();
		        }		
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(97, 313, 115, 29);
		frame3.getContentPane().add(btnCancel);

		JComboBox comboBox = new JComboBox();
		comboBox.addItem("concierto1");
		comboBox.addItem("concierto2");
		comboBox.setBounds(185, 66, 132, 26);
		frame3.getContentPane().add(comboBox);
		

		JLabel lblFestival = new JLabel("Festival:");
		lblFestival.setBounds(25, 69, 69, 20);
		frame3.getContentPane().add(lblFestival);

		JButton btnGestion = new JButton("gestion");
		btnGestion.setActionCommand("Open40");
		btnGestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();

				    if(cmd.equals("Open40"))
				        {
				            frame3.dispose();
				            new gestion();
				            
				        }
					}
				});
			
		btnGestion.setBounds(466, 358, 83, 29);
		frame3.getContentPane().add(btnGestion);
		
		textField = new JTextField();
		textField.setBounds(205, 274, 132, 26);
		frame3.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblConciertoSeleccionado = new JLabel("concierto seleccionado:");
		lblConciertoSeleccionado.setBounds(26, 107, 174, 20);
		frame3.getContentPane().add(lblConciertoSeleccionado);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 108, 258, 26);
		frame3.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSeleccion = new JButton("seleccion");
		btnSeleccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(comboBox.getSelectedItem().toString());
			}
		});
		btnSeleccion.setBounds(332, 65, 115, 29);
		frame3.getContentPane().add(btnSeleccion);
		
		String admin = "1";
		if(admin == "1") {
			btnGestion.setVisible(true);
		}else {
			btnGestion.setVisible(false);
		}

	}
} 