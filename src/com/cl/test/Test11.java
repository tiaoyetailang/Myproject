package com.cl.test;

import java.util.*;

public class Test11 {



    public static void main(String[] args) {
        int i=1;
        i=++i;
        System.out.println(i);
    String s1="12";
    String []s={"A","B"};
        Arrays.sort(s);




    }

    }


class  Person extends Thread{

    @Override
    public void run() {
        System.out.println(123);
    }
}








//    public  static  void haniTower(int num,char a,char b,char c){
//
//         i++;
//          if(num==1){
//              System.out.println("第一个盘从"+a+"->"+c);
//          }else{
//              haniTower(num-1,a,c,b);
//              System.out.println("第"+num+"个盘从"+a+"->"+c);
//               haniTower(num-1,b,a,c);;
//
//          }
//
//
//
//
//        }



//
//    public static int erfenchazhao(int arr[],int left,int ringht,int find){
//        if(left>ringht){
//            return -1;
//
//        }
//        int mid=(left+ringht)/2;
//        int midva=arr[mid];
//
//        if(find<midva){
//            return erfenchazhao(arr,left,mid-1,find);
//        }else if(find>midva){
//            return erfenchazhao(arr,mid+1,ringht,find);
//        }else{
//            return mid;
//        }
//
//
//
//
//    }
//
//    public static int erfen(int arr[],int find){
//      int left=0;
//      int right=arr.length-1;
//      while(left<=right){
//          int mid=(left+right)/2;
//          if(arr[mid]==find){
//              return mid;
//          }else if(arr[mid]<find){
//              left=mid+1;
//
//          }else{
//              right=mid-1;
//
//          }
//
//
//
//      }
//return -1;
//
//
//
//    }
//}
