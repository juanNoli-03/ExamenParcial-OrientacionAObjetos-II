package dao;

//IMPORTAMOS LIBRERIAS
import java.util.List;
import org.hibernate.HibernateException;
import datos.Lote;
import datos.Producto;

public class LoteDao extends Dao <Lote> {
	
	//TRAEMOS A UN LOTE POR SU CODIGO - CU 3
	//---------------------------------------------------------------
	public Lote traer (String codigo) {
		
		Lote lote = null;
	
		try {
			
			this.iniciaOperacion();
			String HQL = "FROM Lote l INNER JOIN FETCH l.producto p WHERE l.codigo = :codigo";
			lote = (Lote) session.createQuery(HQL).setParameter("codigo", codigo).uniqueResult();
		
		} catch (HibernateException he) {
			
			this.manejaExcepcion(he);
			
		} finally {
			
			session.close();
		}
		
		return lote;
	}	
	//---------------------------------------------------------------
	
	//TRAEMOS UNA LISTA DE LOTES POR PRODUCTO - CU 4
	//---------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public List <Lote> traer (Producto producto) {
		
		List <Lote> lista = null;
		
		try {
			
			this.iniciaOperacion();
			String HQL = "FROM Lote l INNER JOIN FETCH l.producto p WHERE p.codigo = :codigo";
			lista = session.createQuery(HQL).setParameter("codigo", producto.getCodigo()).list();
			
		} catch (HibernateException he) {
			
			this.manejaExcepcion(he);
		
		} finally {
			
			session.close();
		}
		
		return lista;
	}
	//---------------------------------------------------------------
}