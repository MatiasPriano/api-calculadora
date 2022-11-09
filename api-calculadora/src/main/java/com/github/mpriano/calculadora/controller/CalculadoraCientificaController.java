package com.github.mpriano.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cientifica")
public class CalculadoraCientificaController {

	public CalculadoraCientificaController() {}
	
	@RequestMapping(value = "/potencia", method = RequestMethod.GET, params = { "numero", "potencia" })
	public Integer potencia(@RequestParam("numero") Integer numero, @RequestParam("potencia") Integer potencia) {
		return (int) Math.pow(numero, potencia);
	}
	
	@RequestMapping(value = "/raizCuadrada", method = RequestMethod.GET, params = { "numero" })
	public Double raizCuadrada(@RequestParam("numero") Integer numero) {
		return Math.sqrt(numero);
	}
	
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = { "numero" })
	public Integer factorial(@RequestParam("numero") Integer numero) {
		Integer sumatoria = 1;
		for(int i=1; i<=numero; i++) 
			sumatoria *= i;
		return sumatoria;
	}
	
	@RequestMapping(value = "/primo", method = RequestMethod.GET, params = { "numero" })
	public Boolean esPrimo(@RequestParam("numero") Integer numero) {
		for(int div=2; div<=numero; div++)
			if((numero % div == 0) && (numero != div))
				return false;
		return true;
	}
}
