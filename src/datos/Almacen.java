package datos;

public class Almacen extends Stock {
	
	//DEFINICION DE ATRIBUTOS
	private int idAlmacen;
	private String ubicacion;
	
	//CONSTRUCTORES
	public Almacen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Almacen(int cantidad, Producto producto, Lote lote, String ubicacion) {
		super(cantidad, producto, lote);
		// TODO Auto-generated constructor stub
		this.ubicacion = ubicacion;
	}
	
	//GETTERS Y SETTERS
	public int getIdAlmacen() {
		return idAlmacen;
	}
	protected void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "\n- Datos del Almacen: [Ubicacion = " + ubicacion + super.toString();
	}
}