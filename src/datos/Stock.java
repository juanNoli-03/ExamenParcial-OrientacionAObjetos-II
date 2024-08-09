package datos;

public abstract class Stock {
	
	//DEFINICION DE ATRIBUTOS
	protected int idStock;
	protected int cantidad;
	protected Producto producto;
	protected Lote lote;
	
	//CONSTRUCTORES
	public Stock() {};
	public Stock(int cantidad, Producto producto, Lote lote) {
		this.cantidad = cantidad;
		this.producto = producto;
		this.lote = lote;
	}
	
	//GETTERS Y SETTERS
	public int getIdStock() {
		return idStock;
	}
	protected void setIdStock(int idStock) {
		this.idStock = idStock;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Lote getLote() {
		return lote;
	}
	public void setLote(Lote lote) {
		this.lote = lote;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return " - idStock = " + idStock + " - Cantidad = " + cantidad + 
				"\n" +
				producto + 
				lote
				+ "]\n";
	};
}