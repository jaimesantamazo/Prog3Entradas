
public class Administrador extends Usuario{
	private String usuario;
	private String contraseña;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String constraseña) {
		this.contraseña = constraseña;
	}
	public Administrador(String usuario, String constraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	public Administrador() {}
	
	

}
