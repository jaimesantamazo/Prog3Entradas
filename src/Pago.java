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

public class Pago {

	private JFrame frame3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblNumeroTarjeta.setBounds(71, 113, 126, 20);
		frame3.getContentPane().add(lblNumeroTarjeta);
		
		JLabel lblCcv = new JLabel("CCV:");
		lblCcv.setBounds(71, 168, 69, 20);
		frame3.getContentPane().add(lblCcv);
		
		JLabel lblDniCliente = new JLabel("DNI cliente:");
		lblDniCliente.setBounds(71, 221, 126, 20);
		frame3.getContentPane().add(lblDniCliente);
		
		JLabel lblIntroduceLosDatos = new JLabel("Introduce los datos de tu tarjeta para validar los datos");
		lblIntroduceLosDatos.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblIntroduceLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduceLosDatos.setBounds(15, 32, 534, 49);
		frame3.getContentPane().add(lblIntroduceLosDatos);
		
		textField = new JTextField();
		textField.setBounds(212, 110, 278, 26);
		frame3.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 165, 111, 26);
		frame3.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 218, 146, 26);
		frame3.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBackground(Color.GREEN);
		btnPagar.setBounds(336, 292, 115, 29);
		frame3.getContentPane().add(btnPagar);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(95, 292, 115, 29);
		frame3.getContentPane().add(btnCancel);
		
		JButton btnNewButton = new JButton("Vuelta al menu");
		btnNewButton.setActionCommand("Open2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();

		        if(cmd.equals("Open2"))
		        {
		            frame3.dispose();
		            new Mainmenu();
		        }  
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(15, 358, 139, 29);
		frame3.getContentPane().add(btnNewButton);
	}
}
