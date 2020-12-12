package com.cl.test;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Test10 {
    public static void main(String[] args) {
        int n=5;
        String value[]={"A","B","C","D","E"};
        Graph graph = new Graph(n);
        for(String v:value){
            graph.insert(v);
        }
        graph.insertEdge(0,1, 1);
        graph.insertEdge(0,2, 1);
        graph.insertEdge(1,2, 1);
        graph.insertEdge(1,3, 1);
        graph.insertEdge(1,4, 1);
        graph.bfs();

    }




}
class Graph{
   boolean[] isVisited;
    ArrayList<String> list;
    int [][]edges;

    int num;

    public  Graph(int n){
         isVisited=new boolean[n];
          edges= new int[n][n];
          list=new ArrayList<>(n);
          num=0;

    }

    public int getFirst(int index){
        for(int j=0;j<list.size();j++){
            if(edges[index][j]>0){
                return j;
            }
        }

        return -1;
    }

    public int getNext(int v1,int v2){
            for(int j=v2+1;j<list.size();j++){
                if(edges[v1][j]>0){
                    return j;
                }

            }

return -1;
    }

//    public void dfs(){
//        isVisited=new boolean[list.size()];
//        for(int i=0;i<list.size();i++){
//            if(!isVisited[i]){
//                dfs(isVisited,i);
//            }
//        }
//
//
//
//    }
    public void dfs(boolean[]isVisited,int i){
        System.out.println(getIndex(i));
        int w=getFirst(i);
        isVisited[i]=true;
        while(w!=-1){
            if(!isVisited[w]){
                dfs(isVisited,w);
            }else{
               w=getNext(i,w);
            }

        }


    }

//    public void dfs(boolean[]isVisited, int i){
//        System.out.println(getIndex(i));
//        int w=getFirst(i);
//        isVisited[i]=true;
//       while(w!=-1){
//           if(!isVisited[w]){
//               dfs(isVisited,w);
//           }else {
//               w = getNext(i, w);
//           }
//       }
//    }

    public  void bfs(boolean[]isVisited, int i){
        int u;
        int w;
        LinkedList<Object> linkedList = new LinkedList<>();
        System.out.println(getIndex(i));
        isVisited[i]=true;
        linkedList.add(i);
        while(!linkedList.isEmpty()){
            u= (int) linkedList.removeFirst();
            w=getFirst(u);
            while(w!=-1){
                if(!isVisited[w]){
                    System.out.println(getIndex(w));
                    isVisited[w]=true;
                    linkedList.addLast(w);
                }
               w= getNext(u,w);


            }
        }


    }



//    public  void bfs(boolean []isVisited,int i){
//
//         int u;
//       int w;
//        LinkedList queue = new LinkedList<Integer>();
//        System.out.println(getIndex(i));
//        isVisited[i]=true;
//        queue.add(i);
//        while(!queue.isEmpty()){
//            u= (int)queue.removeFirst();
//            w=getFirst(u);
//            while(w!=-1){
//                if(!isVisited[w]){
//                    System.out.println(getIndex(w));
//                    isVisited[w]=true;
//                    queue.addLast(w);
//                }
//                w=getNext(u,w);
//            }
//
//
//        }
//    }

    public void bfs(){
        isVisited=new boolean[list.size()];
        for(int i=0;i<list.size();i++){
            if(!isVisited[i]){
                bfs(isVisited,i);
            }
        }



    }




//    public void dfs(boolean[] isVisited,int i){
//        System.out.println(getIndex(i));
//        isVisited[i]=true;
//        int w=getFirst(i);
//            while(w!=-1){
//                if(!isVisited[w]){
//                    dfs(isVisited,w);
//                }
//               w=getNext(i,w);
//            }
//
//
//    }



    public void insert(String s){
        list.add(s);


    }

    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2]=weight;
        edges[v2][v1]=weight;
        num++;
    }

    public int getSize(){
        return list.size();

    }

    public int getNum(){
        return num;

    }
    public  String getIndex(int i){
        return list.get(i);
    }

    public int getweight(int v1,int v2){
         return edges[v1][v2];
    }

    public void show(){
        for(int[] i:edges){
            System.out.println(Arrays.toString(i));

        }



    }







}