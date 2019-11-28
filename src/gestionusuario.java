import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class gestionusuario {
	
	public usuario obtenerusuario(usuario usu) {
		usuario usuario = null;
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = conexion2.getConexion();
			String sql = "select * from usuario where username = ? and contraseña = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, usu.getUsername());
			pst.setString(2, usu.getContraseña());
			rs = pst.executeQuery();
			
			while(rs.next()) {
				usuario = new usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
			}
			
		}catch (Exception e) {
			System.out.println("error en obtener usuario");
		}
		return usuario;
	}

}
