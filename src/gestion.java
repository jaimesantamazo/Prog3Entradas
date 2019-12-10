import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;

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
		super();
		initialize();
		frame.setVisible(true);
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
		lblGestion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGestion.setBounds(167, 25, 111, 20);
		frame.getContentPane().add(lblGestion);
		
		DefaultListModel<String> listmodel = new DefaultListModel<String>();
		JList<String> list = new JList<String>(listmodel);
		list.setFixedCellWidth(10);
		list.setBounds(354, 79, 508, 455);
		frame.getContentPane().add(list);
		
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
				if(!textField.getText().isEmpty() && !textField_1.getText().isEmpty() && !textField_2.getText().isEmpty() && !textField_3.getText().isEmpty() && !textField_4.getText().isEmpty() && !textField_5.getText().isEmpty()) {
					listmodel.addElement("cod:" +textField.getText()+",   "+"nom: "+textField_1.getText()+",   "+"precio: "+textField_2.getText()+",   "+"f.ini: "+textField_3.getText()+",   "+"f.fin :"+textField_4.getText()+",   "+"cant :"+textField_5.getText());
				}
				
			
			}
		});
		btnAadirEvento.setBounds(13, 437, 133, 29);
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
				int selectedindex = list.getSelectedIndex();
				if(selectedindex != -1) {
					listmodel.removeElementAt(selectedindex);
				}
			}
		});
		btnEliminarEvento.setBounds(198, 437, 141, 29);
		frame.getContentPane().add(btnEliminarEvento);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(15, 99, 69, 20);
		frame.getContentPane().add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 160, 69, 20);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Precio:");
		lblNewLabel.setBounds(15, 218, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFechainicio = new JLabel("fecha_inicio:");
		lblFechainicio.setBounds(15, 273, 105, 20);
		frame.getContentPane().add(lblFechainicio);
		
		JLabel lblFechafin = new JLabel("fecha_fin:");
		lblFechafin.setBounds(15, 330, 89, 20);
		frame.getContentPane().add(lblFechafin);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(15, 385, 69, 20);
		frame.getContentPane().add(lblCantidad);
		
		textField = new JTextField();
		textField.setBounds(99, 96, 240, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 157, 240, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 215, 240, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 270, 240, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(99, 327, 240, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(99, 382, 240, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 561, 402, -259);
		frame.getContentPane().add(scrollPane);
		
		JButton btnVueltaAlPago = new JButton("vuelta al pago");
		btnVueltaAlPago.setActionCommand("Open30");
		btnVueltaAlPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				 if(cmd.equals("Open30"))
			        {
			            frame.dispose();
			            new Pago();
			            
			        }
			}
		});
		btnVueltaAlPago.setBounds(15, 531, 131, 29);
		frame.getContentPane().add(btnVueltaAlPago);
		
		JButton btnCargarDatos = new JButton("cargar datos");
		btnCargarDatos.setBounds(198, 531, 141, 29);
		frame.getContentPane().add(btnCargarDatos);
		
		JLabel lblParaEliminarLos = new JLabel("Para eliminar los conciertos, ademas\r\n de marcarlo en la lista, tienes que \r\nescribir sus datos en los campos pertinentes");
		lblParaEliminarLos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblParaEliminarLos.setBounds(312, 12, 565, 54);
		frame.getContentPane().add(lblParaEliminarLos);
	}
}
