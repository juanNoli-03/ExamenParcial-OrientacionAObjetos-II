package negocio;

//IMPORTAMOS LIBRERIAS
import java.util.List;
import dao.AlmacenDao;
import datos.Stock;

public class AlmacenABM {
	
	//INSTANCIAMOS NUESTRO ALMACEN DAO
	//---------------------------------------------------------------
	AlmacenDao dao = new AlmacenDao ();
	//---------------------------------------------------------------
	
	//TRAEMOS UNA LISTA DE STOCK POR UBICACION - CU 5
	//---------------------------------------------------------------
	public List <Stock> traer (String ubicacion) {
		
		return dao.traer(ubicacion);
	}
	//---------------------------------------------------------------
}