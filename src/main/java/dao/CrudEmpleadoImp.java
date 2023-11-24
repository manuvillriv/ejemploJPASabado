package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iempleadoable;
import modelo.TblEmpleado;

public class CrudEmpleadoImp implements Iempleadoable{

	@Override
	public void RegistrarEmpleado(TblEmpleado tbemp) {
		// ESTABLECEMOS CONEXION CON LA UNIDAD DE PERSISTENCIA...
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager=factory.createEntityManager();
		//	INICIALIZAR LA TRANSACCION...
		emanager.getTransaction().begin();
		// REGISTRAMOS 
		emanager.persist(tbemp);
		// CONFIRMAMOS...
		emanager.getTransaction().commit();
		// CERRAMOS...
		emanager.close();
		
		
	}

	@Override
	public void ActualizarEmpleado(TblEmpleado tbemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarEmpleado(TblEmpleado tbemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblEmpleado> ListadoEmpleado() {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		// LISTADO
		List<TblEmpleado> listado=em.createQuery("select e from TblEmpleado e", TblEmpleado.class).getResultList();
		// CONFIRMAMOS...
		em.getTransaction().commit();
		//cerramos...
		em.close();
		return listado;		
	}

	@Override
	public TblEmpleado BuscarEmpleado(TblEmpleado tbemp) {
		
		return null;
		
		
		
	}

}
