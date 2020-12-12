package com.cl.test;

public class ArrTree {
    int arr[];
    public ArrTree(int arr[]){
        this.arr=arr;
    }


public void pre (int index){
    System.out.println(arr[index]);
    if(index*2+1<arr.length){
        pre(index*2+1);
    }
    if(index*2+2<arr.length){
        pre(index*2+2);
    }


}


}
