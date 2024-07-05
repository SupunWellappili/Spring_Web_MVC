package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exact")
public class ExactMappingController {

    //Exact Mapping
    @GetMapping(path = "it/test1")
    public String getItem(){
       return "Get Items";
    }

    @GetMapping(path = "it/test2/order")
    public String getItem2(){
        return "Get Item2";
    }
}
