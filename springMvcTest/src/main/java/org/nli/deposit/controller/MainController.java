package org.nli.deposit.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("spring")
public class MainController {

	@RequestMapping(value = "{jspFile}")
	public String map(@PathVariable String jspFile) throws IOException {
		return jspFile;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String map1() throws IOException {
		return "index";
	}

}
