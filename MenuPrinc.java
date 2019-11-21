import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.TextField;
import java.awt.Label;

public class MenuPrinc extends JFrame {

	private JPanel contentPane;
	int xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrinc frame = new MenuPrinc();
					frame.setUndecorated(true);
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
	public MenuPrinc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 1000, 703);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Iniciar Sesión\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSesion abrir= new IniciarSesion();
				abrir.setVisible(true);
				this.setVisible(false);
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(128, 128, 128));
		button.setBounds(677, 230, 291, 57);
		contentPane.add(button);
		
		Button button_1 = new Button("Nuevo Usuario");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Registro abrir= new Registro();
				abrir.setVisible(true);
				this.setVisible(false);
				
			
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setBounds(677, 431, 291, 57);
		contentPane.add(button_1);
		
		Button button_2 = new Button("X"); 
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		button_2.setBackground(Color.BLACK);
		button_2.setForeground(Color.DARK_GRAY);
		button_2.setFont(new Font("Tahoma",Font.PLAIN,18));
		button_2.setBounds(946, 5, 44, 41);
		contentPane.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 628, 853);
		contentPane.add(panel);
		
		JLabel label=new JLabel("");
		panel.add(label);
		label.setLabelFor(contentPane);
		label.setForeground(Color.GRAY);
		label.setIcon(new ImageIcon(MenuPrinc.class.getResource("/images/18216.png")));
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
				
			}
		});
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x=arg0.getXOnScreen();
				int y=arg0.getYOnScreen();
				MenuPrinc.this.setLocation(x-xx,y-xy);
			}
		});
		label.setBackground(Color.GRAY);
		
		Label label_1 = new Label("ENTRADAS  DEUSTO");
		panel.add(label_1);
		label_1.setAlignment(Label.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 31));
		label_1.setForeground(Color.ORANGE);
	}
}
