package negocio;

import java.util.List;

//IMPORTAMOS LIBRERIAS
import dao.LoteDao;
import datos.Lote;
import datos.Producto;

public class LoteABM {
	
	//INSTANCIAMOS NUESTRO LOTE DAO
	//---------------------------------------------------------------
	LoteDao dao = new LoteDao ();
	//---------------------------------------------------------------
	
	//TRAEMOS A UN LOTE POR SU CODIGO - CU 3
	//---------------------------------------------------------------
	public Lote traer (String codigo) {
		
		return dao.traer(codigo);
	}
	//---------------------------------------------------------------
	
	//TRAEMOS UNA LISTA DE LOTES POR PRODUCTO - CU 4
	//---------------------------------------------------------------
	public List <Lote> traer (Producto producto) {
		
		return dao.traer(producto);
	}
	//---------------------------------------------------------------
}