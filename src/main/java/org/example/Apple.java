//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package org.example;
import java.io.PrintStream;

public class Apple extends Food {
    private String size;

    public Apple() {
        super("Apple");
    }

    public void consume() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this);
        var10000.println(var10001 + " " + this.size + " съедено");
    }

    public void setParam(String param) {
        this.size = param;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
