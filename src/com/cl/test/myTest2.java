package com.cl.test;

import java.util.Arrays;

public class myTest2 {

    public static void main(String[] args) {
    int arr[]={3,10,5,7,9,2,4,6,1,8};

  int []temp=new int[arr.length];
    // mergeSort(arr,0,arr.length-1,temp);
        jishu(arr);
        int a[]=arr;
        System.out.println(erfenSearch(a, 11));
        //System.out.println(Arrays.toString(arr));

    }
    public static int erfenSearch(int arr[],int value){
      return    erfenSearch(arr,value,0,arr.length-1);



    }

    private static int  erfenSearch(int[] arr, int value, int l, int r) {
       if(l>r){
           return -1;
       }
       int mid=(l+r)/2;
       if(value>arr[mid]){
         return   erfenSearch(arr,value,mid+1,r);
       }else if(value<arr[mid]){
           return  erfenSearch(arr,value,l,mid-1);
        }else{
          return mid;
       }




    }

    public static void jishu(int arr[]){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int length=(max+"").length();
        int [][]b=new int[10][arr.length];
        int []bs=new int[10];
        for (int i = 1,n=1; i <=length ; i++,n*=10) {
            for (int j = 0; j < arr.length; j++) {
                int p=arr[j]/n%10;
                b[p][bs[p]]=arr[j];
                bs[p]++;
            }
            int index=0;
            for (int j = 0; j <bs.length ; j++) {
                if(bs[j]!=0){
                    for (int k = 0; k < bs[j]; k++) {
                            arr[index++]=b[j][k];
                    }
                    
                }

                bs[j]=0;
            }

        }



    }

    public static void mergeSort(int arr[],int left,int right,int []temp){
        if(left<right){
            int mid=(left+right)/2;
                 mergeSort(arr,left,mid,temp);
                   mergeSort(arr,mid+1,right,temp);
                   merge(arr,left,mid,right,temp);
        }



    }

    public static void  merge(int arr[],int left,int mid,int right,int []temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
               if(arr[i]<arr[j]){
                   temp[t]=arr[i];
                   t++;
                   i++;
               }else{
                   temp[t]=arr[j];
                   t++;j++;
               }

        }
        while(i<=mid){
            temp[t]=arr[i];
            t++;
            i++;
        }
        while(j<=right){
            temp[t]=arr[j];
            t++;j++;
        }

         t=0;
        //int templeft=left;
        while(left<=right){
            arr[left++]=temp[t++];




        }




        }


    public static void kuaisu(int []arr,int left,int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
       while(l<r){
           while(arr[l]<pivot){
               l++;
           }
           while(arr[r]>pivot){
               r--;
           }
           if(l==r){
               break;
           }
           temp=arr[l];
           arr[l]=arr[r];
           arr[r]=temp;



       }
       if(l==r){
           l++;
           r--;
       }
       if(l<right){
           kuaisu(arr,l,right);
       }
     if(left<r){
         kuaisu(arr,left,r);
     }



    }

    public static void xierpaisu(int arr[]){
          for(int grap=arr.length/2;grap>0;grap/=2){
              for (int i = grap; i < arr.length; i++) {
                  int j=i;
                  int temp=arr[j];
                  if(arr[j]<arr[j-grap]){

                      while(j-grap>=0&&temp<arr[j-grap]){
                          arr[j]=arr[j-grap];
                          j-=grap;


                      }
                      arr[j]=temp;
                  }


              }
              
          }


    }

    public static void xuanze(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int minindex=i;
            int min=arr[i];
            for (int j = i+1; j <arr.length; j++) {
            if(min>arr[j]){
                min=arr[j];
                minindex=j;


            }


            }
            if(minindex!=i){
                arr[minindex]=arr[i];
                arr[i]=min;


            }

        }
        
        
        
        
    }



public static void maopao(int arr[]){
        int temp;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }



        }
    }
    


}







}
