package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//REST --> REpresentation State Transfer (A way of data transfer among client server apps)
@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String getAllCustomer() {
        return "Hello there";

    }
}
