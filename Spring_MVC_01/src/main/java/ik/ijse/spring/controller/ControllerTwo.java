package ik.ijse.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/two") //Handle Mapping
public class ControllerTwo  {

    @GetMapping //Mapping Methods/Handler Methods
    public String testTwo(){
        return "Hello Spring";
    }


}
