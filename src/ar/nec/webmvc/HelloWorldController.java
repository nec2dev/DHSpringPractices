package ar.nec.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWorldController {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(){
		
		return "HelloWorldForm";
	}
	
	@RequestMapping("/procesarFormulario")
	public String ProcesarFormulario() {
		
		return "HelloWorldSpring";
		
	}
	
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		return "HelloWorldSpring";
		
	}
}
