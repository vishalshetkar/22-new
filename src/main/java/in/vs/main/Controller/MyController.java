package in.vs.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/home")
	public String show() {
		return "/view/home.jsp";
	}

}
