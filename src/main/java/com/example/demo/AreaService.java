package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AreaService {

    public int getArea(int h){
        return h*h;
    }

    public int getArea(int h , int b){
        return h+b;
    }
    public int getperimeter(int a, int b, int c){
        return a+b+c;
    }
    public int getperimeter(int l, int w){
        return 2*(l+w);
    }
    public int getperimeter(int a){
        return 4*a;
    }




}
