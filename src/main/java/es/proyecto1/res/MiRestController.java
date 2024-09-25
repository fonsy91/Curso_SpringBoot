package es.proyecto1.res;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiRestController {

	@GetMapping("/")
	public String saludo() {
		
		// Hacemos que devuelva nuestra plantilla HTML nombre de la plantilla entre comillas
		// http://localhost:8081/
		return "index";
	}
}
