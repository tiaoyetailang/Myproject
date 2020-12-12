package com.cl.test;

public class doubleLink {

Man head=new Man(0,"");

public void list(){
    if(head.next==null){
        throw  new RuntimeException("空的");


    }

    Man temp=head.next;
    while(true){
        if(temp==null){
            break;
        }

        System.out.println(temp);

        temp=temp.next;

    }




}







}
