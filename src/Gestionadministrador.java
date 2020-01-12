import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Gestionadministrador {
	public Administrador obteneradministrador(Administrador admin) {
		Administrador administrador = null;
		
		Conexion conexion1 = new Conexion();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			Connection cn1 = conexion1.conectar();
			String sql = "select * from administrador where usuario = ? and contraseña = ?";
			pst = cn1.prepareStatement(sql);
			pst.setString(1, admin.getUsuario());
			pst.setString(2, admin.getContraseña());
			rs = pst.executeQuery();
			
			while(rs.next()) {
				administrador = new Administrador(rs.getString(1), rs.getString(2));
			}
			
		}catch (Exception e) {
			System.out.println("error en obtener administrador");
		}
		return administrador;
	}

}
