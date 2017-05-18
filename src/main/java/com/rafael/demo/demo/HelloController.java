package com.rafael.demo.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dim on 18/5/2017.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/say-hello", method = RequestMethod.GET)
    public ResponseEntity<String>  sayHello(@RequestParam(value = "name") String name) {
       return new ResponseEntity<>(HttpStatus.OK);
    }
}
