package claudioteles.com.github.autenticaooauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionScope
public class HomePageController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView irHomePage() {
		ModelAndView viewIndex = new ModelAndView("index");
		return viewIndex;
	}

}
