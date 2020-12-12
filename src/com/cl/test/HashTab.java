package com.cl.test;

public class HashTab {
    EmpLinkList[] list;
    int size;


    public HashTab(int size){
        this.size=size;
        list=new EmpLinkList[size];
        for(int i=0;i<size;i++){
            list[i]=new EmpLinkList();
        }
    }

    public void add(Emp emp){
      int num=hashFun(emp.id);
      list[num].add(emp);


    }

    public  void list(){
    for(int i=0;i<size;i++){
        list[i].list();
    }


    }

    public void find(int id){
          int num=hashFun(id);
          list[num].findEmpById(id);
    }


    public int hashFun(int id){
        return id%size;
    }





}
