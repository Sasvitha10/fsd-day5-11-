package com.ex.mode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class H {

    @GetMapping("/myhtml")
    public String sayHello() {

        return "<h1 style=color:blue>Sasvitha</h1>"
                + "<img src='/img/image2.jpeg'>"
                + "<img src='/img/image4.jpeg'>";
    }
}