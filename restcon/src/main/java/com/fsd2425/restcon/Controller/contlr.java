  package com.fsd2425.restcon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2425.restcon.Service.shapeservice;



@RestController
public class contlr {
	@Autowired
	private shapeservice s;
	@GetMapping("/")
	public String disp() {
		return "welcome to cie 4 ";
		}
	

	@GetMapping("/circle/{r}")
    public String circle(@PathVariable float r) {
        return s.circle_service(r); 
	}
	@GetMapping("/rectangle/{l}/{b}")
	public String rectangle(@PathVariable float l,@PathVariable float b) {
		return s.rectangle_service(l, b);
	}
}
