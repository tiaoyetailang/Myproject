package com.cl.test;

public class Test6 {
    static int s1=0;


    public static void main(String[] args) {
        new Thread(){
            @Override
            public synchronized void run() {


                        if(s1>20){
                   try {
                       wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                        }else{
                            notify();
                            s1++;
                            System.out.println("加了"+s1);
                        }




            }
        }.start();
        new Thread(){
            @Override
            public synchronized void run() {


                    if(s1<0){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        notify();
                        s1--;
                        System.out.println("减了"+s1);
                    }



            }
        }.start();

    }



}

class Dog implements Runnable{


    @Override
    public  void run() {
        synchronized (Dog.class){
            this.notify();
            System.out.println(123);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Cat.class){
                System.out.println(456);
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }





    }




}
    class Cat implements Runnable{


        @Override
        public  void run() {
            synchronized (Cat.class){
               this. notify();
                System.out.println(666);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Dog.class){
                    System.out.println(47756);
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }





        }




    }


