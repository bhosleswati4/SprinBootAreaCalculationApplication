package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaCalculation {


    @GetMapping("/triangle/{h}/{b}")
    public Response triangle(@PathVariable int h, @PathVariable int b){
        return new Response(h,b, (h*b)/2);
    }

    @GetMapping("/rectangle/{h}/{b}")
    public Response rectangle(@PathVariable int h, @PathVariable int b){
        return new Response(h,b, h*b);
    }
    @GetMapping("/square/{b}/{b}")
    public Response square(@PathVariable int b){
        return new Response(b,b, b*b);
    }


}

