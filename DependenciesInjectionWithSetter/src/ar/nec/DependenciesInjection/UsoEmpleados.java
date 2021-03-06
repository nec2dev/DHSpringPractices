package ar.nec.DependenciesInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creaci�n de objetos de tipo Empleado de la manera sin IoC
		
		/*Empleados Empleado1=new JefeEmpleado();
		Empleados Empleado2=new SecretarioEmpleado();
		Empleados Empleado3=new DirectorEmpleado();*/
		
		//Uso de objetos creados
		
		/*System.out.println(Empleado1.getTareas());
		System.out.println(Empleado2.getTareas());
		System.out.println(Empleado3.getTareas());*/
		
		//Crear un contexto, cargar archivo Xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pedir el Bean
		//Empleados nahuel=contexto.getBean("miEmpleado", Empleados.class);
		
		//Usar el Bean
		//System.out.println(nahuel.getTareas());
		//System.out.println(nahuel.getInformes());
		
		Empleados mayra=contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(mayra.getTareas());
		System.out.println(mayra.getInformes());
		
		//Cerrar el contexto, el Xml
		contexto.close();
		
		//En este caso no tocamos c�digo de ninguna clase, solo el archivo config, el xml
	}

}
