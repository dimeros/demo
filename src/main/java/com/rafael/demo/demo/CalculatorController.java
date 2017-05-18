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
public class CalculatorController {

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public Integer calculate(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        Integer result = a + b;
        return result;

    }

    public int multiply(int a, int b) {
        return 0;
    }
}
