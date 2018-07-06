package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity sayHello(@RequestParam(value = "name", required = false, defaultValue = "Dim Team") String firstName){
        return ResponseEntity.ok("Hello "+ firstName + "!");
    }
}
