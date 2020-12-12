package com.cl.test;

public class Emp {
    int id;
    String name;
    Emp next;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
