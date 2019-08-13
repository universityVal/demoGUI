package gui.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ControllerHello {

    List<Student> students= new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Name",1),
                    new Student(2,"2",1),
                    new Student(3,"3",2),
                    new Student(4,"4",3)
            )
    );

    @RequestMapping(value = {"/","index"},method = RequestMethod.GET)
    String sayHello(Model model)
    {   String name="wWWWW";
        model.addAttribute("name",name);
        return "index";
    }
    @RequestMapping(value = {"/students"},method = RequestMethod.GET)
    String showStudents(Model model)
    {
        model.addAttribute("students",students);
        return "students";
    }
    @RequestMapping(value = { "/student/delete/{id}"},
            method = RequestMethod.GET)
    String del(Model model, @PathVariable("id") int id) {

        List<Student> listOfStudentsAfterDeletion
                = students.stream().filter(student -> student.getId() != id)
                .collect(Collectors.toList());
        students = listOfStudentsAfterDeletion;

        model.addAttribute("students", students);
        return "students";
    }
    @RequestMapping("/integer")
    Integer showNumber()
    {
        return 1;
    }
}
