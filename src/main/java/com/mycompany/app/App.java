package com.mycompany.app;

/**
 * Hello DEVOPPS!
 */
public class App
{

    private final String message = "Hello DEVOPPS!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
