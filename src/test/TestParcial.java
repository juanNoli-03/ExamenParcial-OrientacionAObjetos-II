package test;

//IMPORTAMOS LIBRERIAS
import java.time.LocalDate;
import datos.Producto;
import negocio.AlmacenABM;
import negocio.LoteABM;
import negocio.PedidoABM;
import negocio.ProductoABM;

public class TestParcial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n----PARCIAL OBJETOS II 2024 (TEMA 1)- Juan Manuel Noli (45233126)----\n");
		
		//INSTANCIAMOS NUESTRAS CLASES DE NEGOCIO
		//---------------------------------------------------------------
		ProductoABM productoAbm = new ProductoABM ();
		LoteABM loteAbm = new LoteABM ();
		AlmacenABM almacenAbm = new AlmacenABM ();
		PedidoABM pedidoAbm = new PedidoABM ();
		//---------------------------------------------------------------

		//1- AGREGAMOS UN PRODUCTO A LA BD Y LO MOSTRAMOS
		//---------------------------------------------------------------
		System.out.println("\nCU 1: AGREGAMOS UN PRODUCTO A LA BD Y LO MOSTRAMOS");
		System.out.println("\n------------------------------------------------------------\n");
		
		//CREAMOS EL PRODUCTO
		Producto producto1 = new Producto ("6", "audifonos", 500);
		
		//LO AGREGAMOS
		System.out.println("\n- Agregamos: ");
		try {
			System.out.println("\nEl producto fue agregado a la BD con el ID = " + productoAbm.agregar(producto1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//LO MOSTRAMOS
		System.out.println("\n- Mostramos: ");
		System.out.println(productoAbm.traer("6"));
		
		System.out.println("\n------------------------------------------------------------");
		//---------------------------------------------------------------
		
		//2- INTENTAMOS AGREGAR UN PRODUCTO A LA BD
		//---------------------------------------------------------------
		System.out.println("\nCU 2: INTENTAMOS AGREGAR UN PRODUCTO A LA BD");
		System.out.println("\n------------------------------------------------------------\n");
		
		//CREAMOS EL PRODUCTO
		Producto producto2 = new Producto ("6", "placa de video", 500000);
		
		//LO INTENTAMOS AGREGAR
		try {
			productoAbm.agregar(producto2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("\n------------------------------------------------------------");
		//---------------------------------------------------------------
		
		//3- TRAEMOS A UN LOTE POR CODIGO E IMPRIMIMOS SU INFO COMPLETA
		//---------------------------------------------------------------
		System.out.println("\nCU 3: TRAEMOS A UN LOTE POR CODIGO E IMPRIMIMOS SU INFO COMPLETA");
		System.out.println("\n------------------------------------------------------------\n");
		System.out.println(loteAbm.traer("1"));
		System.out.println("\n------------------------------------------------------------");
		//---------------------------------------------------------------
		
		//4- TRAEMOS LISTA DE LOTES POR PRODUCTO
		//---------------------------------------------------------------
		System.out.println("\nCU 4: TRAEMOS LISTA DE LOTES POR PRODUCTO");
		System.out.println("\n------------------------------------------------------------\n");
		System.out.println(loteAbm.traer(productoAbm.traer("1")));
		System.out.println("\n------------------------------------------------------------");
		//---------------------------------------------------------------
		
		//5- TRAEMOS LISTA DE STOCK POR UBICACION
		//---------------------------------------------------------------
		System.out.println("\nCU 5: TRAEMOS LISTA DE STOCK POR UBICACION");
		System.out.println("\n------------------------------------------------------------\n");
		System.out.println(almacenAbm.traer("Lanus"));
		System.out.println("\n------------------------------------------------------------");
		//---------------------------------------------------------------
		
		//6- TRAEMOS LISTA DE STOCK ENTRE FECHAS
		//---------------------------------------------------------------
		System.out.println("\nCU 6: TRAEMOS LISTA DE STOCK ENTRE FECHAS");
		System.out.println("\n------------------------------------------------------------\n");
		System.out.println(pedidoAbm.traer(LocalDate.of(2024, 5, 18), LocalDate.of(2024, 5, 23)));
		System.out.println("\n------------------------------------------------------------");
		//---------------------------------------------------------------
		
		//7- TRAEMOS LISTA DE STOCK ENTRE FECHAS Y POR CLIENTE
		//---------------------------------------------------------------
		System.out.println("\nCU 7: TRAEMOS LISTA DE STOCK ENTRE FECHAS Y POR CLIENTE");
		System.out.println("\n------------------------------------------------------------\n");
		System.out.println(pedidoAbm.traer(LocalDate.of(2024, 5, 18), LocalDate.of(2024, 5, 23), "Juan"));
		System.out.println("\n------------------------------------------------------------");
		//---------------------------------------------------------------


	}

}
