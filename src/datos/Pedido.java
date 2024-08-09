package datos;

//IMPORTAMOS LIBRERIAS
import java.time.LocalDate;

public class Pedido extends Stock {
	
	//DEFINICION DE ATRIBUTOS
	private int idPedido;
	private LocalDate fecha;
	private String cliente;
	
	//CONSTRUCTORES
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pedido(int cantidad, Producto producto, Lote lote, int idPedido, LocalDate fecha, String cliente) {
		super(cantidad, producto, lote);
		// TODO Auto-generated constructor stub
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.cliente = cliente;
	}
	
	//GETTERS Y SETTERS
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "\nDatos del Pedido: [Fecha = " + fecha + " - Cliente = " 
				+ cliente + super.toString();
	}
}