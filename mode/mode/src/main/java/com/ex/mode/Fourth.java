package com.ex.mode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fourth {
    @GetMapping("/name/{NAME}")
    public String Name(@PathVariable String NAME){
        String n = NAME.toLowerCase();
        if(n.equals("sasvitha")){
             return "This is my name";
        }
        else{
            return "This is not my Name";
        }
    }

    @GetMapping("/climate/{c}")
    public String Climate(@PathVariable int c){
        if(c<0){
            return "Shivering";
        }
        else if(c>=0 && c<24){
            return "chill";
        }
        else if(c>=24 && c<30){
            return "Toward hot";
        }
        else if(c>=30 && c<32){
            return "Hotter";
        }
        else{
            return "omg";
        }
    }
}
