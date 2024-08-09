package negocio;

//IMPORTAMOS LIBRERIAS
import dao.ProductoDao;
import datos.Producto;

public class ProductoABM {
	
	//INSTANCIAMOS NUESTRO PRODUCTO DAO
	//---------------------------------------------------------------
	ProductoDao dao = new ProductoDao ();
	//---------------------------------------------------------------
	
	//TRAEMOS A UN PRODUCTO POR CODIGO - CU 1
	//---------------------------------------------------------------
	public Producto traer (String codigo) {
		
		return dao.traer(codigo);
	}
	//---------------------------------------------------------------
	
	//AGREGAR PRODUCTO A LA BD - CU 2
	//---------------------------------------------------------------
	public int agregar (Producto producto) throws Exception {
		
		if (dao.traer(producto.getCodigo()) != null) {
			
			throw new Exception ("\nERROR! Ya existe un PRODUCTO con ese CODIGO en la BD!\n");
		}
		
		return dao.agregar(producto);
	}
	//---------------------------------------------------------------
}