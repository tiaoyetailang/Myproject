package com.cl.test;

public class HeroTree {


    HeroNode root;

    public HeroTree(HeroNode root){
        this.root=root;
    }



    public void pre(){
        this.root.pre();;
    }

    public static void main(String[] args) {
        HeroNode h1 = new HeroNode(1, "1");
        HeroNode h2 = new HeroNode(2, "2");
        HeroNode h3 = new HeroNode(3, "3");
        HeroNode h4 = new HeroNode(4, "4");
        HeroNode h5 = new HeroNode(5, "5");
        h1.left=h2;
        h1.right=h3;
        h3.left=h5;
        h3.right=h4;
        HeroTree root = new HeroTree(h1);
        root.pre();
    }


}
