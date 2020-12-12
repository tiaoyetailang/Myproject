package com.cl.test;

public class HeroNode {
    int no;
    String name;
    HeroNode left;
    HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }


    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public void pre(){
        System.out.println(this);
          if(this.left!=null){
              this.left.pre();
        }
          if(this.right!=null){
              this.right.pre();
          }

    }

    public HeroNode preSerach(int no){
        if(this.no==no){
             return this;
        }

        HeroNode temp=null;
        if(this.left!=null){
            temp=this.left.preSerach(no);


        }
        if(temp!=null){
            return temp;
        }
       if(this.right!=null){
            temp=this.right.preSerach(no);
       }
        return temp;


    }

    public void delete(int no){
        if(this.left!=null&&this.left.no==no){
            this.left=null;
            return ;
        }
        if(this.right!=null&&this.right.no==no){
            this.right=null;
            return;
        }
     if(this.left!=null){
         this.left.delete(no);
     }
     if(this.right!=null){
         this.right.delete(no);
     }

    }


}
