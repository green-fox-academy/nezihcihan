package com.greenfox.nezih.rest.controller;

import com.greenfox.nezih.rest.model.*;
import com.greenfox.nezih.rest.model.Number;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ControllerTwo {

    @ExceptionHandler({MissingServletRequestParameterException.class,})
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
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public String handleMyException2() {
        return "Please provide a number!";
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

    @RequestMapping(value = "/appenda/{appendable}", method = GET)
    public AppendA append(@PathVariable("appendable") String appendable ) {
        AppendA appendA = new AppendA(appendable);
        return appendA;
    }
    @RequestMapping(value = "/dountil/{what}", method = POST)
    public Result doUntil(@PathVariable("what") String what, @RequestBody DoUntil doUntil) {
        Result result = new Result();
        if(what.equals("sum")) {
            int temp = 0;
            for (int i = 1; i <= doUntil.getUntil() ; i++) {
                temp = temp + i;
            }
            result.setResult(temp);
        }
        else if(what.equals("factor")) {
            int temp = 1;
            for (int i = 1; i <= doUntil.getUntil(); i++) {
                temp = temp * i;
            }
            result.setResult(temp);
        }
        return result;
    }

    @RequestMapping(value = "/arrays", method = POST)
    public Result arrayHandler(@RequestBody ArrayHandler arrayHandler) {
        Result result = new Result();
        if(arrayHandler.getWhat().equals("sum")) {
            int temp = 0;
            for (int i = 0; i < arrayHandler.getNumbers().size() ; i++) {
                temp = temp + arrayHandler.getNumbers().get(i);
            }
            result.setResult(temp);
        }
        else if(arrayHandler.getWhat().equals("multiply")) {
            int temp = 1;
            for (int i = 0; i < arrayHandler.getNumbers().size(); i++) {
                temp = temp * arrayHandler.getNumbers().get(i);
            }
            result.setResult(temp);
        }
        else if(arrayHandler.getWhat().equals("double")) {
            for (int i = 0; i < arrayHandler.getNumbers().size(); i++) {
                result.getResultList().add(arrayHandler.getNumbers().get(i)*2);
            }
        }
        return result;
    }
}
