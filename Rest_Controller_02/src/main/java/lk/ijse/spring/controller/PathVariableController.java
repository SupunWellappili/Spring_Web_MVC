package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PathVariable")
public class PathVariableController {

    @GetMapping(path = "{id}")
    public String delivery(@PathVariable("id") String itemCode){
        return itemCode;
    }

    @GetMapping(path = "{id}/{name}")
    public String delivery02(@PathVariable String id, @PathVariable String name){
        return id +" : "+ name;
    }

 //alies add --> same name nethi witadii kiyala denna ona add krna aka.
    @GetMapping(path = "{customerID}/{customerName}")
    public String delivery03(@PathVariable("customerID") String id, @PathVariable("customerName") String name){
        return id +" : "+ name;
    }
}
