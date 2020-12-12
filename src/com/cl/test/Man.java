package com.cl.test;

public class Man {
    int no;
    String name;
    Man next;
    Man pre;

    public Man(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoubleLink{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
