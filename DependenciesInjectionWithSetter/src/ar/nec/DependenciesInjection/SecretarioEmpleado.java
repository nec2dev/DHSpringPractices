package ar.nec.DependenciesInjection;

public class SecretarioEmpleado implements Empleados {
	
	public void setNuevoInforme(CreaInformes nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	//Creación de campo tipo creaInforme (interfaz)
	private CreaInformes nuevoInforme;

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Soy secretario, y hago coasa de secretario";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el Secretario: " + nuevoInforme.getInforme();
	}

}
