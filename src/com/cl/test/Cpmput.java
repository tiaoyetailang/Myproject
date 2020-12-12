package com.cl.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Cpmput {


  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("com.cl.test.Hero");
    System.out.println(clazz);
    Field name = clazz.getField("name");
    System.out.println(name);
    Method show = clazz.getMethod("show", Hero.class);


  }







}
 class Baba implements Runnable{
  static String s1=new String("1");
  static String s2=new String("2");
  public Baba(boolean a){
    this.a=a;
  }
  boolean a;
  @Override
  public void run() {
    if(a){

      synchronized (s1){
        System.out.println(1);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (s2){
          System.out.println(2);
        }
      }
    }else{

      synchronized (s2){
        System.out.println(3);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (s1){
          System.out.println(4);
        }
      }

    }

  }
}
