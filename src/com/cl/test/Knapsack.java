package com.cl.test;

public class Knapsack{
    public static void main(String[] args) {
        int[]w={1,4,3};
        int[]val={1500,3000,2000};
        int m=4;
            int n=val.length;
            int[][] v=new int[n+1][m+1];
            int path[][]=new int[n+1][m+1];

            for(int i=1;i<v.length;i++){
                for(int j=1;j<v[0].length;j++){
                    if(w[i-1]>j){
                        v[i][j]=v[i-1][j];
                    }else{
                        v[i][j]=Math.max(v[i-1][j],val[i-1]+v[i-1][j-w[i-1]]);

                    }


                }

            }

            for(int i=0;i<v.length;i++){
                for(int j=0;j<v[0].length;j++){
                    System.out.print(v[i][j]+" ");
                }
                System.out.println();

        }


    }








}