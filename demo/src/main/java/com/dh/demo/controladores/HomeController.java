package com.dh.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("view")
	public String irAlView() {
		return "./app-form/app-view";
	}
	
	@GetMapping("delete")
	public String irAlDelete() {
		return "./app-form/delete-dialog";
	}
	
	@GetMapping("editar")
	public String irAlEditar() {
		return "./app-form/editar-form";
	}
	
	@GetMapping("leer")
	public String irAlLeer() {
		return "./app-form/leer-list";
	}

}
