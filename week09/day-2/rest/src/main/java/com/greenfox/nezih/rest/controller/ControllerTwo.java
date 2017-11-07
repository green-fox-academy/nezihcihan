package com.greenfox.nezih.rest.controller;

import com.greenfox.nezih.rest.model.ErrorHandling;
import com.greenfox.nezih.rest.model.Greeter;
import com.greenfox.nezih.rest.model.Number;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ControllerTwo {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ErrorHandling handleMyException(MissingServletRequestParameterException missingParam) {
        ErrorHandling errorHandling = new ErrorHandling();
        if(missingParam.getParameterName().equals("input")) {
            errorHandling.setError("Please provide an input!");
        }
        else if (missingParam.getParameterName().equals("name")) {
            errorHandling.setError("Please provide a name!");
        }
        else if (missingParam.getParameterName().equals("title")) {
            errorHandling.setError("Please provide a title!");

        }
        return errorHandling;
    }
    @RequestMapping(value = "/doubling", method = GET)
    public Number doubleByTwo(@RequestParam("input") int received) {
        Number number = new Number(received);
        return number;
    }

    @RequestMapping(value = "/greeter", method = GET)
    public Greeter greet(@RequestParam("name") String name, @RequestParam("title") String title) {
        Greeter greeter = new Greeter(name,title);
        return greeter;
    }
}
