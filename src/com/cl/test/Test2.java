package com.cl.test;

import java.util.concurrent.*;

public class Test2 {
    private static  ThreadLocal<Long> threadLocal=new ThreadLocal<Long>();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton2 instance = Singleton2.getInstance();
//        System.out.println(instance.getClass().getClassLoader());
//        Callable<Singleton2> callable = new Callable<>() {
//            @Override
//            public Singleton2 call() throws Exception {
//                return Singleton2.getInstance();
//            }
//        };
//        ExecutorService service = Executors.newFixedThreadPool(2);
//        Future<Singleton2> s1 = service.submit(callable);
//        Future<Singleton2> s2 = service.submit(callable);
//        System.out.println(s1.get() == s2.get());
//      service.shutdown();
//        String s3= new String("1");
//        String s4=new String("2");
//        String s1=new String("1")+"2";
//        s1.intern();
//         String s2="12";
//        System.out.println(s1 == s2);
        //String s=new String("计算机软件");
//        String str1 = new StringBuilder("计算机").append("软件").toString();
//       str1.intern();
//        String str2 ="计算机软件";
//                System.out.println(str1==str2);

        System.out.println(fun(4));


    }

    public static int fun(int n) {
        if (n < 0) {
            throw new RuntimeException("输入有误");
        }
        else {
            if (n == 1 || n == 2) {
                return n;

            } else {
                return fun(n - 1) + fun(n - 2);
            }


        }
    }
//f3+f2=f2+f1+f2=2+1+2

}
// class Singleton{
//private String s;
//
//  public static final Singleton SINGLETON;
//private  Singleton(String s){
//this.s=s;
//}
//
//static {
//    SINGLETON=new Singleton("");
//
//
//}
//
//
// }

class Singleton2{
  private static Singleton2 singleton2;

 private Singleton2(){}


 public static Singleton2 getInstance(){
     if(singleton2==null){
         singleton2=new Singleton2();
         return singleton2;
     }else{
         return  singleton2;
     }


 }

}
