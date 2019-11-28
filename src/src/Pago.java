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
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;

public class Pago {

	private JFrame frame3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		JLabel lblNumeroTarjeta = new JLabel("Numero tarjeta:");
		lblNumeroTarjeta.setBounds(58, 179, 126, 20);
		frame3.getContentPane().add(lblNumeroTarjeta);
		
		JLabel lblCcv = new JLabel("CCV:");
		lblCcv.setBounds(58, 225, 69, 20);
		frame3.getContentPane().add(lblCcv);
		
		JLabel lblDniCliente = new JLabel("DNI cliente:");
		lblDniCliente.setBounds(58, 257, 126, 20);
		frame3.getContentPane().add(lblDniCliente);
		
		JLabel lblIntroduceLosDatos = new JLabel("Introduce los datos de tu tarjeta para validar los datos");
		lblIntroduceLosDatos.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblIntroduceLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduceLosDatos.setBounds(15, 16, 534, 49);
		frame3.getContentPane().add(lblIntroduceLosDatos);
		
		textField = new JTextField();
		textField.setBounds(212, 173, 278, 26);
		frame3.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 222, 111, 26);
		frame3.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 254, 146, 26);
		frame3.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBackground(Color.GREEN);
		btnPagar.setBounds(344, 313, 115, 29);
		frame3.getContentPane().add(btnPagar);
		
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
		
		JLabel lblCorreo = new JLabel("E-mail:");
		lblCorreo.setBounds(58, 143, 69, 20);
		frame3.getContentPane().add(lblCorreo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 140, 278, 26);
		frame3.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox.setBounds(212, 97, 278, 26);
		frame3.getContentPane().add(comboBox);
		comboBox.addItem("entrada para el dreambeach");
		comboBox.addItem("entrada para el medusa");
		comboBox.addItem("entrada para el riverland");
		comboBox.addItem("entrada para el bilbao bbk");
		comboBox.addItem("entrada para el viñarock");
		
		JLabel lblFestival = new JLabel("Festival:");
		lblFestival.setBounds(58, 100, 69, 20);
		frame3.getContentPane().add(lblFestival);
		
		JButton btnGestion = new JButton("gestion");
		btnGestion.setBounds(466, 358, 83, 29);
		frame3.getContentPane().add(btnGestion);
		
		String admin = "";
		if(admin == "1") {
			btnGestion.setVisible(true);
		}else
			btnGestion.setVisible(false);
	}
}
