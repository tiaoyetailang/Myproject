package com.cl.test;

public class Test4 {
    public static void main(String[] args) {
        int[][] map = new int[8][7];

        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;

        }
        for(int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;

        }
        map[3][1]=1;
        map[3][2]=1;
        map[1][2]=1;
        map[2][2]=1;

        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");


            }
            System.out.println();
        }

    }

public static  boolean setWay(int [][]map,int i,int j){
    if(map[i][j]==2){
        return true;
    }
return false;





}
}
class ABC{
    public void add(){
        int a=5;




    }
    public void show(){

    }


}