
public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	private int stock;
	private String desc;
	
	public Producto(String codigo, String nombre, double precio, int stock, String desc) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.desc = desc;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public String getDesc() {
		return desc;
	}

	public String getDisponibilidad () {
		if (stock>0) {
			return "Stock disponible";
		}else {
			return "Agotado";
		}
	}
	
	
}
