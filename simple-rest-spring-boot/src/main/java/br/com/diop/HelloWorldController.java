package br.com.diop;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Aqui será o nosso endpoint, responsável por receber as requisições Rest
@RestController
public class HelloWorldController {
	private static final String msg = "Hello, %s!";
	private final AtomicLong count = new AtomicLong();
	
	@RequestMapping("/hello")
	public HelloWorld hello(@RequestParam(value="name", defaultValue="World") String name){
		return new HelloWorld(count.incrementAndGet(),String.format(msg, name));
	}
}

