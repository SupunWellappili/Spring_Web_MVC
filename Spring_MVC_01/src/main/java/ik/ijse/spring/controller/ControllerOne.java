package ik.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controllerOne")
public class ControllerOne {

    public ControllerOne() {
        System.out.println("ControllerOne Instantiated");
    }

    @GetMapping
    public void testMethod(){
        System.out.println("Request Receive");
    }
}
