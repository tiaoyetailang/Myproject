package com.cl.test;

import java.awt.*;

public class queueArray {
    int maxSize;
    int front;
    int rear;
    int []arr;

    public static void main(String[] args) {
        queueArray queueArray = new queueArray(5);
        queueArray.add(1);
        queueArray.add(2);
        queueArray.add(3);
        queueArray.add(4);
        System.out.println(queueArray.isFull());
        //queueArray.showQueue();
    }

public queueArray(int maxSize){
    this.maxSize=maxSize;
    arr=new int[maxSize];


}
public boolean isEmpty(){
    return front==rear;


}

public boolean isFull(){
    return (rear+1)%maxSize==front;


}

public void add(int a){
    if(isFull()){
        throw new RuntimeException("满了");
    }
    arr[rear]=a;
    rear=(rear+1)%maxSize;

}

public void  getQueue(){
    if(isEmpty()){
        throw new RuntimeException("空的");
    }
    System.out.println(arr[front]);
    front=(front+1)%maxSize;



}


public void showQueue(){
    for(int i=front;i<front+(rear+maxSize-front)%maxSize;i++){
        System.out.println(arr[i%maxSize]);
    }




}

//    public queueArray(int maxSize){
//        this.maxSize=maxSize;
//        arr=new int[maxSize];
//    }
//
//    public boolean isEmpty(){
//        return front==rear;
//
//    }
//
//    public boolean isFull(){
//    return (rear+1)%maxSize==front;
//
//    }
//public void add(int a){
//            if(isFull()){
//                throw  new RuntimeException("满了");
//            }
//           arr[rear]=a;
//            rear=(rear+1)%maxSize;
//
//
//
//}
//
//public void getQueue(){
//    if(isEmpty()){
//        throw  new RuntimeException("空的");
//    }
//    System.out.println(arr[front]);
//     front =(front+1)%maxSize;
//
//
//
//}
//
//public void  showQueue(){
//   for(int i=front;i<front+size();i++){
//       System.out.println(arr[i%maxSize]);
//   }
//
//
//
//
//}
//
//public int size(){
//    return  (rear+maxSize-front)%maxSize;
//
//
//
//}





}
