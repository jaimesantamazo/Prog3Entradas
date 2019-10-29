
import java.util.HashMap;
import java.util.Map;

public class Carrito {
	private String codigo;
	private String usuario;
	private Map <String,Integer> articulos= new HashMap <String,Integer>();
	private double precio;
	private String fecha;
	private String hora;
	private String formaPago;
	
public Carrito(String codigo, String usuario, double precio, String fecha, String hora, String formaPago) {
    this.codigo = codigo;
    this.usuario = usuario;
    this.precio = precio;
    this.fecha = fecha;
    this.hora = hora;
    this.formaPago = formaPago;
    }  

public void anadirProducto (String newProd, int cantidad, double prodPrice){
    if (this.articulos.containsKey(newProd) == true){
        int newCant = this.articulos.get(newProd) + cantidad;
        this.articulos.put(newProd, newCant);
        this.precio += (cantidad * prodPrice);
    }else{
        this.articulos.put(newProd, cantidad);
        this.precio += (prodPrice * cantidad);
    }
}

public void eliminarProducto(String prod, double precioProd){
    this.precio -= (precioProd * this.articulos.get(prod));
    this.articulos.remove(prod);
}

public boolean editarCantidad (String prod, int cantidad, double prodPrice){
    if (this.articulos.containsKey(prod) == true){
        if (cantidad == 0){
            eliminarProducto (prod, prodPrice);
            return true;
        }
        int cantidadActual = this.articulos.get(prod);
        this.precio += ((cantidad-cantidadActual) * prodPrice);
        this.articulos.put(prod, cantidad);
        return true;
    }else{
        return false;
    }
}

public String getCodigo() {
	return codigo;
}

public String getUsuario() {
	return usuario;
}

public Map<String, Integer> getArticulos() {
	return articulos;
}

public double getPrecio() {
	return precio;
}

public String getFecha() {
	return fecha;
}

public String getHora() {
	return hora;
}

public String getFormaPago() {
	return formaPago;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public void setArticulos(Map<String, Integer> articulos) {
	this.articulos = articulos;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public void setHora(String hora) {
	this.hora = hora;
}

public void setFormaPago(String formaPago) {
	this.formaPago = formaPago;
}



}
