package com.nativeword.playground;

import io.javalin.Javalin;

public class App {
  public static void main(String[] args) {
      Javalin app = Javalin.create()
          .start(getHerokuAssignedPort());
      app.get("/", ctx -> ctx.result("Hello World"));
  }

  private static int getHerokuAssignedPort() {
    String herokuPort = System.getenv("PORT");
    if (herokuPort != null) {
      return Integer.parseInt(herokuPort);
    }
    return 7000;
  }
}
