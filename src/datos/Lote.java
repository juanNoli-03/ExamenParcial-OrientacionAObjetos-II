package datos;

public class Lote {
	
	//DEFINICION DE ATRIBUTOS
	private int idLote;
	private String codigo;
	private Producto producto;
	
	//CONSTRUCTORES
	public Lote() {};
	public Lote(String codigo, Producto producto) {
		this.codigo = codigo;
		this.producto = producto;
	}
	
	//GETTERS Y SETTERS
	public int getIdLote() {
		return idLote;
	}
	protected void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "\n- Datos del Lote: [\n" + 
				"\n- idLote = " + idLote + " - Codigo = " + codigo + 
				"\n" +
				producto 
				+ "]\n";
	};
}