package co.develhope.interceptorsmiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("time")
public class BasicController {

    @GetMapping("")
    public Date getData(){
        Date today = new Date();
        return today;
    }


}