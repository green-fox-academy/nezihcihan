package com.greenfox.nezih.guardians.controller;

import com.greenfox.nezih.guardians.model.ErrorHandling;
import com.greenfox.nezih.guardians.model.Groot;
import com.greenfox.nezih.guardians.model.Yondu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping({"/" , ""})
@RestController
public class GuardianController {

    @GetMapping("/groot")
    public Object grootMsg(@RequestParam(value = "message", required = false) String message) {
        Groot groot = new Groot(message);
        if (message == null) {
            ErrorHandling errorHandling = new ErrorHandling();
            errorHandling.setError("I am Groot!");
            return errorHandling;
        }
        return groot;
    }

    @GetMapping("/yondu")
    public Object yondu(@RequestParam(value = "distance", required = false) double distance,
                        @RequestParam(value = "time", required = false) double time) {
        Yondu yondu = new Yondu(distance,time);
        ErrorHandling errorHandling = new ErrorHandling();
        if (time == 0) {
            errorHandling.setError("Time can not be zero!");
            return errorHandling;
        }
        return yondu;
    }
}
