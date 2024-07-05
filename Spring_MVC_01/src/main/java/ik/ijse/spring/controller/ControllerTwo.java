package ik.ijse.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("customer") //Handle Mapping
public class ControllerTwo  {

    @GetMapping //Mapping Methods/Handler Methods
    public String testTwo(){
        return "customer";
    }
}
