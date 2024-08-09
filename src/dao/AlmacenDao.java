package dao;

//IMPORTAMOS LIBRERIAS
import java.util.List;
import org.hibernate.HibernateException;
import datos.Almacen;
import datos.Stock;

public class AlmacenDao extends Dao <Almacen> {
	
	//TRAEMOS UNA LISTA DE STOCK POR UBICACION - CU 5
	//---------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public List <Stock> traer (String ubicacion) {
		
		List <Stock> lista = null;
		
		try {
			
			this.iniciaOperacion();
			String HQL = "FROM Almacen a INNER JOIN FETCH a.producto INNER JOIN FETCH a.lote "
					+ "WHERE a.ubicacion = :ubicacion";
			lista = (List <Stock>) session.createQuery(HQL).setParameter("ubicacion", ubicacion).list();
			
		} catch (HibernateException he) {
			
			this.manejaExcepcion(he);
		
		} finally {
			
			session.close();
		}
		
		return lista;
	}
	//---------------------------------------------------------------
}