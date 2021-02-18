package ar.nec.DependenciesInjection;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Soy secretario, y hago coasa de secretario";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return null;
	}

}
