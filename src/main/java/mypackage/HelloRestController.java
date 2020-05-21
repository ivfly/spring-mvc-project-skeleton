package mypackage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {
	
	@RequestMapping(value = "/api", method = RequestMethod.GET)
	public @ResponseBody String api(HttpServletRequest request) {
		System.out.println("Hello Api Requested : " + request.getRequestURI());
		
		return "{hello}";
	}
}
