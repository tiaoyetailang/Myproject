package com.cl.test;

import javafx.scene.chart.Chart;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class test {


    public static void main(String[] args) throws Exception {
        new Thread();
//        File file = new File("微信图片_20200531130908.jpg");
//        FileInputStream fs = new FileInputStream(file);
//        FileOutputStream fo = new FileOutputStream(new File("12366.jpg"));
//        byte[] cbuf=new byte[3];
//         int len;
//         while((len=fs.read(cbuf))!=-1){
//             fo.write(cbuf);
//
//         }
//
//
//        fs.close();
//         fo.close();
//        System.out.println("输入一个数字");
//        InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader bs = new BufferedReader(is);
//
//        while(true){
//            String data=bs.readLine();
//            if(data.equalsIgnoreCase("e")){
//                System.out.println("结束");
//                break;
//            }
//            String s=data.toUpperCase();
//            System.out.println(s);
//        }
//        bs.close();
//        is.close();




    }

    class myThread implements Callable{

        @Override
        public Object call() throws Exception {
            return null;
        }
    }





    @Test
    public  void abc() throws  Exception{
        FileInputStream fis = new FileInputStream(".tr78AF.tmp.24683351.trashed");
        InputStreamReader isr = new InputStreamReader(fis);
        char[] c=new char[5];
        int len;
        while((len=isr.read(c))!=-1){
            System.out.println(new String(c,0,len));


        }
          isr.close();
        fis.close();
        System.gc();

    }

    @Test
    public  void dabc() throws  Exception{
        FileInputStream fis = new FileInputStream("微信图片_20200531130908.jpg");
        InputStreamReader isr = new InputStreamReader(fis);
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("6666.jpg"));
        char[] c=new char[5];
        int len;
        while((len=isr.read(c))!=-1){
            os.write(c);


        }
        isr.close();
        fis.close();
        os.close();

    }

    @Test
    public void adas() throws Exception{
        System.out.println("输入一个数字");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bs = new BufferedReader(is);

        while(true){
            String data=bs.readLine();
            if(data.equalsIgnoreCase("e")){
                System.out.println("结束");
                break;
            }
      String s=data.toUpperCase();
            System.out.println(s);
        }
     bs.close();
        is.close();


    }

    @Test
    public void bbadas() throws Exception{
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("爸爸.txt"));
//        oos.writeObject(new String("爸爸"));
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("爸爸.txt"));
        Object o = oos.readObject();
        System.out.println(o);


        oos.close();

    }





}

//class Man implements Callable<Integer>{
//
//
//    @Override
//    public Integer call() throws Exception {
//        return 1;
//    }
//}

//        new Thread(){
//            @Override
//            public void run() {
//                synchronized (s1){
//                    s1.append("a");
//                    s2.append("1");
//                    try {
//                        sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    synchronized (s2){
//                        s1.append("b");
//                        s2.append("2");
//
//
//                        System.out.println(s1);
//                        System.out.println(s2);
//
//                    }
//
//
//                }
//            }
//        }.start();
//
//         new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 synchronized (s2){
//                     s1.append("c");
//                     s2.append("3");
//                     try {
//                        Thread.sleep(100);
//                     } catch (InterruptedException e) {
//                         e.printStackTrace();
//                     }
//                     synchronized (s1){
//                         s1.append("d");
//                         s2.append("4");
//
//
//                         System.out.println(s1);
//                         System.out.println(s2);
//
//                     }
//
//
//                 }
//
//
//
//             }
//         }).start();

//
//         new Thread(){
//             @Override
//             public void run() {
//                 try{
//                     lock.lock();
//                     System.out.println("哈哈");
//
//                 }finally {
//                     lock.unlock();
//                 }
//             }
//         }.start();


abstract class aasda{
    public void add(){
        System.out.println(123);
    }


        }




