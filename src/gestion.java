import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class gestion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestion window = new gestion();
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
	public gestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 899, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGestion = new JLabel("Gestion");
		lblGestion.setBounds(383, 27, 69, 20);
		frame.getContentPane().add(lblGestion);
		
		JList list = new JList();
		list.setBounds(15, 300, 402, 260);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(432, 300, 430, 260);
		frame.getContentPane().add(list_1);
		
		JButton btnBorrarUsuario = new JButton("borrar usuario");
		btnBorrarUsuario.setBounds(588, 265, 133, 29);
		frame.getContentPane().add(btnBorrarUsuario);
		
		JButton btnAadirEvento = new JButton("a\u00F1adir evento");
		btnAadirEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conexion conexion1 = new conexion();
				Connection cn1 = conexion1.conectar();
				String codigo;
				String nombre;
				String precio;
				String fecha_ini;
				String fecha_fin;
				String cantidad;
				
				String sql1 = "";
				codigo = textField.getText();
				nombre = textField_1.getText();
				precio = textField_2.getText();
				fecha_ini = textField_3.getText();
				fecha_fin = textField_4.getText();
				cantidad = textField_5.getText();
	
				sql1 = "INSERT INTO entradas (codigo, nombre, precio, fecha_ini, fecha_fin, cantidad) VALUES(?,?,?,?,?,?)";
				try {
					PreparedStatement pst1 = cn1.prepareStatement(sql1);
					pst1.setString(1, codigo);
					pst1.setString(2, nombre);
					pst1.setString(3, precio);
					pst1.setString(4, fecha_ini);
					pst1.setString(5, fecha_fin);
					pst1.setString(6, cantidad);
					
					int n = pst1.executeUpdate();
					if(n>0) {
						JOptionPane.showMessageDialog(null, "evento registrado");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			
			}
		});
		btnAadirEvento.setBounds(25, 265, 133, 29);
		frame.getContentPane().add(btnAadirEvento);
		
		JButton btnEliminarEvento = new JButton("eliminar evento");
		btnEliminarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conexion conexion2 = new conexion();
				Connection cn2 = conexion2.conectar();
				String codigo;
				String nombre;
				String precio;
				String fecha_ini;
				String fecha_fin;
				String cantidad;
				
				String sql2 = "";
				codigo = textField.getText();
				nombre = textField_1.getText();
				precio = textField_2.getText();
				fecha_ini = textField_3.getText();
				fecha_fin = textField_4.getText();
				cantidad = textField_5.getText();
	
				sql2 = "delete from entradas where codigo = ? and nombre = ? and precio = ? and fecha_ini = ? and fecha_fin = ? and cantidad = ?";
				try {
					PreparedStatement pst2 = cn2.prepareStatement(sql2);
					pst2.setString(1, codigo);
					pst2.setString(2, nombre);
					pst2.setString(3, precio);
					pst2.setString(4, fecha_ini);
					pst2.setString(5, fecha_fin);
					pst2.setString(6, cantidad);
					
					int n = pst2.executeUpdate();
					if(n>0) {
						JOptionPane.showMessageDialog(null, "evento eliminado");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnEliminarEvento.setBounds(264, 265, 141, 29);
		frame.getContentPane().add(btnEliminarEvento);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(25, 63, 69, 20);
		frame.getContentPane().add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(25, 99, 69, 20);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Precio:");
		lblNewLabel.setBounds(25, 135, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFechainicio = new JLabel("fecha_inicio:");
		lblFechainicio.setBounds(25, 174, 105, 20);
		frame.getContentPane().add(lblFechainicio);
		
		JLabel lblFechafin = new JLabel("fecha_fin:");
		lblFechafin.setBounds(25, 206, 89, 20);
		frame.getContentPane().add(lblFechafin);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(25, 233, 69, 20);
		frame.getContentPane().add(lblCantidad);
		
		textField = new JTextField();
		textField.setBounds(117, 60, 240, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 96, 240, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(117, 132, 240, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(117, 171, 240, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(117, 203, 240, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(117, 230, 240, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
}
