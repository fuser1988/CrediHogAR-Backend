import org.hibernate.Session;
import org.hibernate.query.Query;

import modelo.Cliente;
import repositorio.ClienteDao;
import repositorio.Runner;
import repositorio.SessionFactoryProvider;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {

	public static void main(String[] args) {

		/**
		ClienteDao clienteDao = new ClienteDao();
		Cliente cliente = new Cliente();
		Session session;
		
		session = SessionFactoryProvider.getInstance().createSession();

		Runner.addSession(session);
		
		//String hql = " SELECT SUM(p.monto) FROM Pago p WHERE p.fecha BETWEEN '2017-10-01' AND '2018-02-20' ";
		String hql = "FROM Cliente c WHERE c.calificacion IS 'No Apto'";
		Query query = session.createQuery(hql);
		//long cantidad = (long) query.uniqueResult();
		Cliente resultado = (Cliente) query.getSingleResult();
		
		System.out.println("El total es: " + resultado.getNombre() + " " + resultado.getCalificacion());
		
		session.close();
		
		
		 * pruebaDAO pb = new pruebaDAO(); prueba pr = new prueba(1234, "Elkin blanco",
		 * 123); pb.AgregarDatos(pr);
		 * 
		 * System.out.println(pb.busqueda());
		 * 
		 * 
		 * prueba[] pr = new prueba[4];
		 * 
		 * pr[0] = new prueba(2332, "Rosa Melano", 2323); pr[1] = new prueba(243345,
		 * "Elvis Presli", 8766);
		 * 
		 * for (prueba e : pr) { pb.save(e); }
		 * 
		 * pb.close(); System.exit(0);
		 **/
	}
}
