package negocio;

//IMPORTAMOS LIBRERIAS
import java.time.LocalDate;
import java.util.List;
import dao.PedidoDao;
import datos.Stock;

public class PedidoABM {
	
	//INSTANCIAMOS NUESTRO PEDIDO ABM
	//---------------------------------------------------------------
	PedidoDao dao = new PedidoDao ();
	//---------------------------------------------------------------
	
	//TRAEMOS UNA LISTA DE STCOK POR FECHAS - CU 6
	//---------------------------------------------------------------
	public List <Stock> traer (LocalDate desde, LocalDate hasta) {
		
		return dao.traer(desde, hasta);
	}
	//---------------------------------------------------------------
	
	//TRAEMOS UNA LISTA DE STCOK POR FECHAS Y CLIENTE - CU 7
	//---------------------------------------------------------------
	public List <Stock> traer (LocalDate desde, LocalDate hasta, String cliente) {
		
		return dao.traer(desde, hasta, cliente);
	}
	//---------------------------------------------------------------


}
