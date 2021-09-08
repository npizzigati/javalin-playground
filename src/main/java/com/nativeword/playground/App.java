package com.nativeword.playground;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
        app.get("/toolong", ctx -> ctx.result("Gawd this took way too long."));
    }
}
