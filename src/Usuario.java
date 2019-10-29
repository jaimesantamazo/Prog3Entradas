
public class Usuario  {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fechancto;
	private String email;
	private String pass;
	private char permisos;
	
	public Usuario(String nombre, String apellido1, String apellido2, String fechancto, String email, String pass,
			char permisos) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechancto = fechancto;
		this.email = email;
		this.pass = pass;
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String getFechancto() {
		return fechancto;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public char getPermisos() {
		return permisos;
	}

	public String getPrintablePermissions () {
		if (this.permisos=='a') {
			return "Administrador";
		}else {
			return "Cliente registrado";
		}
	}
	
	
}