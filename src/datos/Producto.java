package datos;

public class Producto {
	
	//DEFINICION DE ATRIBUTOS
	private int idProducto;
	private String codigo;
	private String nombre;
	private double precio;
	
	//CONSTRUCTORES
	public Producto() {};
	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//GETTERS Y SETTERS
	public int getIdProducto() {
		return idProducto;
	}
	protected void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "\n- Datos del Producto: [idProducto = " + idProducto + " - Codigo = " + codigo + " - Nombre = " 
				+ nombre + " - Precio = " + precio + "]\n";
	};
}