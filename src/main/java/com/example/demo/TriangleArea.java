package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TriangleArea implements Area {

    @Override
    public int getArea(int h , int b){
        return (h*b)/2;
    }
}
