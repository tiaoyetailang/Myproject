package com.cl.test;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class mYTest {

    int max=8;
    int arr[]=new int[max];
    static int count=0;
    public static void main(String[] args) {
        //System.out.println(fun(5));

//        int [][]map=new int[8][7];
//        for (int i = 0; i <7 ; i++) {
//            map[0][i]=1;
//            map[7][i]=1;
//        }
//        for (int i = 0; i <8 ; i++) {
//            map[i][0]=1;
//            map[i][6]=1;
//        }
//        map[3][1]=1;
//        map[3][2]=1;
//        setWay(map,1,1);
//        for (int i = 0; i <8 ; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print(map[i][j]);
//
//            }
//            System.out.println();
//        }
        mYTest mYTest = new mYTest();
             mYTest.check(0);
        System.out.println(count);

    }

    public void check(int n){
         if(n==max){
             print();
             return ;
         }
        for (int i = 0; i < max; i++) {
               arr[n]=i;
               if(judge(n)){
                   check(n+1);
               }
        }

    }

    private void print() {
        count++;
        System.out.println(Arrays.toString(arr));

    }


    public boolean judge(int n){
        for(int i=0;i<n;i++){
        if(arr[i]==arr[n]||Math.abs(n-i)==Math.abs(arr[n]-arr[i])){
            return false;
        }


        }

 return true;



}



    private static boolean setWay(int[][] map, int i, int j) {
            if(map[6][5]==2){
                return true;

        }else {
                if(map[i][j]==0){
                map[i][j]=2;
                     if(setWay(map,i+1,j)){
                         return true;
                     }else if(setWay(map,i,j+1)){
                         return true;
                     }else if(setWay(map,i-1,j)) {
                         return true;
                     }else if(setWay(map,i,j-1)){
                         return true;
                     }else{
                         return false;
                     }

                }else{
                    return false;


                }


            }



    }

    public static int fun(int x){
        if(x==1){
            return 1;
        }else{


            return fun(x-1)*x;
        }




    }



}


