package com.cl.test;

public class EmpLinkList {
    private  Emp head;

    public void add(Emp emp){
        if(head==null){
            head=emp;
            return ;
        }
        Emp temp=head;
        while(true){
            if(temp.next==null){

                break;

            }
              temp=temp.next;


        }
        temp.next=emp;

    }

    public void list(){
        if(head==null){
            throw  new RuntimeException("空的");
        }
Emp temp=head;
        while(true){
            System.out.println(temp);
         if(temp.next==null){
             break;
         }
       temp=temp.next;
        }


    }


    public Emp findEmpById(int id){
        if(head==null){
            throw new  RuntimeException("空等");
        }
        Emp temp=head;
        while(true){
            if(temp.id==id){
                break;
            }
              if(temp.next==null){
                  throw  new RuntimeException("空的");
              }
              temp=temp.next;

        }


    return temp;

    }




}
