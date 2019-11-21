
public class Entrada {
	private static int contador=0;
	private int id;
	private String nombre;
	private String fechainicio;
	private String fechafinal;
	
	public Entrada(int id,String nombre,  String fechainicio, String fechafinal) {
		super();
		contador++;
		this.id=contador;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.fechafinal = fechafinal;
		
	}
	public Entrada() {
		super();
		this.id = contador;
		this.nombre = "";
		this.fechainicio = "";
		this.fechafinal = "";
		
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getFechainicio() {
		return fechainicio;
	}
	public String getFechafinal() {
		return fechafinal;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setHorainicio(String horainicio) {
		this.fechainicio = horainicio;
	}
	public void setHorafinal(String horafinal) {
		this.fechafinal = horafinal;
	}
	
	
	
}
