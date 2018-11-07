package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

	@RequestMapping("/vegetables")
    public String page1() {
        return "vegetables";
    }

	@RequestMapping("/calendar")
	public String page2() {
        return "calendar";
    }

	@RequestMapping("/weather")
	public String page3() {
        return "weather";
    }


}
