package ik.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/controllerOne")
public class ControllerOne {

    @GetMapping
    public void testMethod(){
        System.out.println("Request Receive");
    }


}
