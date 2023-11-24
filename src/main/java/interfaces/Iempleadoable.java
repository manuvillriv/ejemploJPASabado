package interfaces;

import java.util.List;

import modelo.TblEmpleado;

public interface Iempleadoable {
	// DECLARAMOS LOS METODOS...
	public void RegistrarEmpleado(TblEmpleado tbemp);
	public void ActualizarEmpleado(TblEmpleado tbemp);
	public void EliminarEmpleado(TblEmpleado tbemp);
	public List<TblEmpleado> ListadoEmpleado();
	public TblEmpleado BuscarEmpleado(TblEmpleado tbemp);
	
}	// FIN DE LA INTERFACE...
		