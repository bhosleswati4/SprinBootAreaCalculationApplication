package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaCalculation {


    @Autowired
    AreaService areaService;
    @Autowired
    TriangleArea triangleArea;

    @GetMapping("/triangle/{h}/{b}")
    public int triangle(@PathVariable int h, @PathVariable int b){
        return triangleArea.getArea(h,b);
    }

    @GetMapping("/rectangle/{h}/{b}")
    public int rectangle(@PathVariable int h, @PathVariable int b){
        return areaService.getArea(h,b);
    }
    @GetMapping("/square/{b}")
    public int square(@PathVariable int b){
        return areaService.getArea(b);
    }

    @GetMapping("/squarePerimeter/{a}")
    public int squarePerimeter(@PathVariable int a){
        return areaService.getperimeter(a);
    }
    @GetMapping("/rectanglePerimeter/{l}/{w}")
    public int rectanglePerimeter(@PathVariable int l, @PathVariable int w){
        return areaService.getperimeter(l,w);
    }

    @GetMapping("/trianglePerimeter/{a}/{b}/{c}")
    public int trianglePerimeter(@PathVariable int a, @PathVariable int b, @PathVariable int c){
        return areaService.getperimeter(a,b,c);
    }


}

