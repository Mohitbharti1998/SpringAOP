package org.spring.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        System.out.println("Circle setter called");
        return name;
    }
}
