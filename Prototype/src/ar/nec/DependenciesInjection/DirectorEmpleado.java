package ar.nec.DependenciesInjection;

public class DirectorEmpleado implements Empleados {
	
	//Creaci�n de campo tipo creaInforme (interfaz)
	private CreaInformes nuevoInforme;
	
	//Creaci�n de constructor que inyecta la dependencia
	public DirectorEmpleado (CreaInformes nuevoInforme) {
		this.nuevoInforme=nuevoInforme;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Soy el Director, y hago cosas propias de un director";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + nuevoInforme.getInforme();
	}

}
