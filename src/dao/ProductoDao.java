package dao;

//IMPORTAMOS LIBRERIAS
import org.hibernate.HibernateException;
import datos.Producto;

public class ProductoDao extends Dao <Producto> {
	
	//TRAEMOS A UN PRODUCTO POR SU CODIGO - CU 1
	//---------------------------------------------------------------
	public Producto traer (String codigo) {
		
		Producto producto = null;
		
		try {
			
			this.iniciaOperacion();
			String HQL = "FROM Producto p WHERE p.codigo = :codigo";
			producto = (Producto) session.createQuery(HQL).setParameter("codigo", codigo).uniqueResult();
		
		} catch (HibernateException he) {
			
			this.manejaExcepcion(he);
		
		} finally {
			
			session.close();
		}
		
		return producto;
	}
	//---------------------------------------------------------------

}
