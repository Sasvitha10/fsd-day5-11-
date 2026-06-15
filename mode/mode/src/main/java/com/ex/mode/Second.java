package com.ex.mode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Second {
    @GetMapping("/Add/{n1}/{n2}")
    public String display(@PathVariable int n1, @PathVariable int n2) {
        int c = n1 + n2;
        if (c % 2 == 0) {
            return "Even" + c;
        } else {
            return "Odd" + c;
        }
    }

//    @GetMapping("/sub/{a}/{b}")
//    public String displaydiff(@PathVariable int a,@PathVariable  int b) {
//        int diff = a - b;
//        return "Difference:" + diff;
//    }
//    @GetMapping("/mul/{a}/{b}")
//    public String displaypro(@PathVariable int a,@PathVariable  int b){
//        int product=a*b;
//        return "Product:"+ product;
//    }
//    @GetMapping("/div/{a}/{b}")
//    public String displayquo(@PathVariable int a,@PathVariable  int b){
//        int quo=a/b;
//        return "Quotient:"+ quo;
//    }


    @GetMapping("/intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name, @PathVariable String city, @PathVariable String course) {
        return "Hello,I am " + name + " from " + city + " Welcome to " + course;
    }
}
