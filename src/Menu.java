import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		super();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Comprar entradas");
		btnNewButton.setActionCommand("Open60");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
								String cmd = e.getActionCommand();

						        if(cmd.equals("Open60"))
						        {
						            frame.dispose();
						            new Pago();
						        }
					}
				});
		btnNewButton.setBounds(43, 135, 159, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tus entradas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				properties properties = new properties();
				try {
					properties.sleep(1000);
					properties.start();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(261, 135, 176, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("salir del usuario");
		btnNewButton_2.setActionCommand("Open50");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String cmd = e.getActionCommand();

				        if(cmd.equals("Open50"))
				        {
				            frame.dispose();
				            Login.log.log(Level.FINER,"Usuario desconectado");
				            new Login();
				        }
			}
		});
		
		btnNewButton_2.setBounds(15, 237, 159, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblMenuPrincipal = new JLabel("MENU PRINCIPAL");
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMenuPrincipal.setBounds(164, 42, 215, 29);
		frame.getContentPane().add(lblMenuPrincipal);
	}
}
