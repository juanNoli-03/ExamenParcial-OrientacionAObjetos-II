package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;

public abstract class Dao<T> {
	
	private Class<T> clasePersistente;
	protected static Session session;
    protected Transaction tx;
    
    //CLASE PERSISTENTE, INICIA OPERACION Y MANEJA EXCEPCION
    //--------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
	protected Dao(){  
        this.clasePersistente = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass())
        									.getActualTypeArguments()[0];
    } 
    
    public Class<T> getClasePersistente() {  
        return clasePersistente;  
    } 
    
    protected void iniciaOperacion() throws HibernateException {
    	
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }

    protected void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("ERROR en la capa de acceso a datos", he);
    }
    //--------------------------------------------------------------------------------------------

    //METODOS DE AGREGAR, ELIMINAR, MODIFICAR Y TRAER POR ID UN OBJETO
    //--------------------------------------------------------------------------------------------
    public int agregar (T objeto) {
    	
    	int idObjeto = 0;
    	
    	try {
    		
    		this.iniciaOperacion();
    		idObjeto = (int) session.save(objeto);
    		this.tx.commit();
    	
    	} catch (HibernateException he) {
    		
    		this.manejaExcepcion(he);
    	
    	} finally {
    		
    		session.close();
    	}
    	
    	return idObjeto;
    }
    
    public void eliminar (T objeto) {
    	
    	try {
    		
    		this.iniciaOperacion();
    		session.delete(objeto);
    		this.tx.commit();
    	
    	} catch (HibernateException he) {
    		
    		this.manejaExcepcion(he);
    	
    	} finally {
    		
    		session.close();
    	}
    }
    
    public void modificar (T objeto) {
    	
    	try {
    		
    		this.iniciaOperacion();
    		session.update(objeto);
    		this.tx.commit();
    	
    	} catch (HibernateException he) {
    		
    		this.manejaExcepcion(he);
    	
    	} finally {
    		
    		session.close();
    	}
    }
    
    public T traer (int idObjeto) {
    	
    	T objeto = null;
    	
    	try {
    		
    		this.iniciaOperacion();
    		objeto = (T) session.get(this.clasePersistente, idObjeto);
    	
    	} catch (HibernateException he) {
    		
    		this.manejaExcepcion(he);
    	
    	} finally {
    		
    		session.close();
    	}
    	
    	return objeto;
    }
    //--------------------------------------------------------------------------------------------
}