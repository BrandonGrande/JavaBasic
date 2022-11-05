package com.basicjava.staticexample;

import com.basicjava.Main;

public class StaticExample {

    static{
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }

    public void executeExample() {
        Main t = new Main();
        Main t2 = new Main();
    }
}
