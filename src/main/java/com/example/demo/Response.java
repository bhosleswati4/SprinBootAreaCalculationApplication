package com.example.demo;

public class Response {

    private int h;
    private int b;

    private int result;

    public Response(int h, int b, int result) {
        this.h = h;
        this.b = b;
        this.result = result;
    }

    public int getH() {
        return h;
    }

    public int getB() {
        return b;
    }

    public int getResult() {
        return result;
    }
}
