package com.cl.test;

public class Hero {

    int no;
    String name;
    Hero next;

    public Hero(int no,String name){
         this.no=no;
         this.name=name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println(123);
    }
}
