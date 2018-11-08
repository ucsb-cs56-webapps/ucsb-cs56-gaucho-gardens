package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

	@RequestMapping("/seasonalplants")
    public String page1() {
        return "seasonalplants";
    }

	@RequestMapping("/user_dashboard")
	public String page2() {
        return "user_dashboard";
    }

	@RequestMapping("/weather")
	public String page3() {
        return "weather";
    }


}
