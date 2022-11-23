package com.revature;

import io.javalin.Javalin;

public class Playground {


    public static void main(String[] args) {
        Javalin app = Javalin.create(config ->{
            config.plugins.enableDevLogging();
        });

        app.get("/add/{numOne}/{numTwo}",ctx -> {
            int numOne = Integer.parseInt(ctx.pathParam("numOne"));
            int numTwo = Integer.parseInt(ctx.pathParam("numTwo"));
            ctx.result(Integer.toString(numOne + numTwo));
        });     

        app.get("/subtract/{numOne}/{numTwo}", ctx -> {
            int numOne = Integer.parseInt(ctx.pathParam("numOne"));
            int numTwo = Integer.parseInt(ctx.pathParam("numTwo"));
            ctx.result(Integer.toString(numOne - numTwo));   
        });
        
        app.start();
    }


}
