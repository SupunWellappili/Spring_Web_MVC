package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMappingController {

    //character/I123
    @GetMapping(path = "item/I???")
    public String item(){
        return "Character Mapping";
    }

    //1234/Search
    @GetMapping(path = "????/Search")
    public String item2(){
        return "Charactor Mapping-02";
    }
}
