package com.cl.test;

import org.apache.log4j.helpers.FormattingInfo;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.jar.JarEntry;

public class PrinmAl {
    public static void main(String[] args) {
        char[]data={'A','B','C','D','E','F','G'};
        int verxs=data.length;
        int [][]weight={
                {10000,5,7,10000,10000,10000,2},
                {5,10000,10000,9,10000,10000,3},
                {7,10000,10000,10000,8,10000,10000},
                {10000,9,10000,10000,10000,4,10000},
                {10000,10000,8,10000,10000,5,4},
                {10000,10000,10000,4,5,10000,6},
                {2,3,10000,10000,4,6,10000}};


        MGraph graph = new MGraph(verxs);

        MinTree minTree = new MinTree();

        minTree.createG(graph,verxs,data,weight);
        //minTree.showGraph(graph);
        minTree.prim(graph);


    }




}
class MinTree{
    public void createG(MGraph graph,int verxs,char[]data,int[][]weight){
        int i,j;
        for (i = 0; i < verxs; i++) {
            graph.data[i]=data[i];
            for(j=0;j<verxs;j++){
                graph.weight[i][j]=weight[i][j];
            }
        }


    }

    public void showGraph(MGraph graph){
        for(int[]a:graph.weight){
            System.out.println(Arrays.toString(a));

        }
    }
    public  void prim(MGraph graph){
        int random =(int) (Math.random()*graph.data.length);
        prim(graph,random);

    }
    public void prim(MGraph graph,int v){
          int []visited=new int[graph.verxs];
             visited[v]=1;
             int h=-1;
             int a=0;
             int minWeight=10000;
             for(int k=1;k<graph.verxs;k++){
                 for(int i=0;i<graph.verxs;i++){
                       if(visited[i]==1){
                           for(int j=0;j<graph.verxs;j++){
                               if(visited[j]==0){
                                    if(graph.weight[i][j]<minWeight){
                                   minWeight=graph.weight[i][j];
                                   h=j;

                               }


                               }
                           }
                       }


                 }
                 a+=minWeight;
                 visited[h]=1;
                 minWeight=10000;
                 System.out.println(a);

             }






    }



//    public void prim(MGraph graph,int v){
//         int[] visited= new int[graph.verxs];
//               visited[v]=1;
//               int h2=-1;
//               int a=0;
//               int minWeight=10000;
//               for(int k=1;k<graph.verxs;k++){
//                   for(int i=0;i<graph.verxs;i++){
//                       if(visited[i]==1) {
//                           for (int j = 0; j < graph.verxs; j++) {
//                               if(visited[j] == 0) {
//                                   if (graph.weight[i][j] < minWeight) {
//                                       minWeight = graph.weight[i][j];
//                                       h2 = j;
//
//
//                                   }
//                               }
//
//                           }
//                       }
//
//                   }
//                   a+=minWeight;
//                   visited[h2]=1;
//                   minWeight=10000;
//                   System.out.println(a);
//
//               }
//
//
//    }




}

class MGraph{
    int verxs;
    char[]data;
    int [][] weight;

    public MGraph(int verxs){
        this.verxs=verxs;
        data=new char[verxs];
        weight=new int[verxs][verxs];


    }

}