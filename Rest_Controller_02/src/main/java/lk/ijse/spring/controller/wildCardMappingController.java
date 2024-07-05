package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildCardMappingController")
public class wildCardMappingController {

    @GetMapping(path = "test/*/hello")
    public String order(){
        return "Order Mapping";
    }

    @GetMapping(path = "test/*/*")
    public String order2(){
        return "Order Mapping";
    }
}
