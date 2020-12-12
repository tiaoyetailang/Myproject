package com.cl.test;

import java.util.Arrays;

public class myStack {
    int arr[];
    int maxSize;
    int top=-1;

    public static void main(String[] args) {
        myStack stack = new myStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.list();




    }


public myStack(int maxSize){
    this.maxSize=maxSize;
    arr=new int[maxSize];

}


public boolean full(){
    return top==maxSize-1;



}

public boolean isEmpty(){
    return top==-1;



}

public void push(int value){
    if(full()){
        throw  new RuntimeException("满了");
    }
    arr[++top]=value;


}

public int pop(){
    if(isEmpty()){
        throw  new RuntimeException("空的");
    }
    return arr[top--];

}

public void list(){
    for(int i=top;i>=0;i--){
        System.out.println(arr[i]);
    }

}


}
