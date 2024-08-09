package dao;

//IMPORTAMOS LIBRERIAS
import java.time.LocalDate;
import java.util.List;
import org.hibernate.HibernateException;
import datos.Pedido;
import datos.Stock;

public class PedidoDao extends Dao <Pedido> {

	//TRAEMOS UNA LISTA DE STOCK ENTRE FECHAS - CU 6
	//---------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public List <Stock> traer (LocalDate desde, LocalDate hasta) {
		
		List <Stock> lista = null;
		
		try {
			
			this.iniciaOperacion();
			String HQL = "FROM Pedido pe INNER JOIN FETCH pe.producto INNER JOIN FETCH pe.lote "
					+ "WHERE pe.fecha BETWEEN :desde AND :hasta";
			lista = (List <Stock>) session.createQuery(HQL)
					.setParameter("desde", desde)
					.setParameter("hasta", hasta)
					.list();
		
		} catch (HibernateException he) {
			
			this.manejaExcepcion(he);
		
		} finally {
			
			session.close();
		}
		
		return lista;
	}
	//---------------------------------------------------------------
	
	//TRAEMOS UNA LISTA DE STOCK ENTRE FECHAS Y POR CLIENTE - CU 7
	//---------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public List <Stock> traer (LocalDate desde, LocalDate hasta, String cliente) {
		
		List <Stock> lista = null;
		
		try {
			
			this.iniciaOperacion();
			String HQL = "FROM Pedido pe INNER JOIN FETCH pe.producto INNER JOIN FETCH pe.lote "
					+ "WHERE pe.fecha BETWEEN :desde AND :hasta AND pe.cliente = :cliente";
			lista = (List <Stock>) session.createQuery(HQL)
					.setParameter("desde", desde)
					.setParameter("hasta", hasta)
					.setParameter("cliente", cliente)
					.list();
		
		} catch (HibernateException he) {
			
			this.manejaExcepcion(he);
		
		} finally {
			
			session.close();
		}
		
		return lista;
	}
	//---------------------------------------------------------------

	
	
}
