package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.*;


//REST --> REpresentation State Transfer (A way of data transfer among client server apps)
@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String getAllCustomer() {
        return "Hello there";
    }

    @GetMapping(params = "search")
    public String searchCustomer(){
        return "Customer Search";
    }

    @PostMapping
    public String saveCustomer(){
        return "Customer Saved and Method Invoked!";
    }

    @PutMapping
    public String updateCustomer(){
        return "Customer Updated";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return "Customer Delete";
    }
}
