package gui.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHello {
    @RequestMapping("/hello")
    String sayHello()
    {
        return "Hello";
    }
    @RequestMapping("/integer")
    Integer showNumber()
    {
        return 1;
    }
}
