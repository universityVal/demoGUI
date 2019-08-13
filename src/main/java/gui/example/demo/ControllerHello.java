package gui.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerHello {
    @RequestMapping(value = {"/","index"},method = RequestMethod.GET)
    String sayHello(Model model)
    {   String name="wWWWW";
        model.addAttribute("name",name);
        return "index";
    }
    @RequestMapping("/integer")
    Integer showNumber()
    {
        return 1;
    }
}
