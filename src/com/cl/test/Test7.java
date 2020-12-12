package com.cl.test;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {

        int []arr={4,6,8,5,9,2,1,20,6};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void heapSort(int[] arr) {
        int temp=0;
        for (int i = arr.length/2; i>=0 ; i--) {
            adjust(arr,i,arr.length);
        }

        for(int j=arr.length-1;j>0;j--){
            temp=arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
         adjust(arr,0,j);

        }


    }

    public static  void adjust(int arr[],int i,int length){
        int temp=arr[i];
        for (int k = i*2+1; k < length; k=k*2+1) {
            if(k+1<length&&arr[k+1]>arr[k]){
                k++;
            }
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;

            }else{
                break;
            }
            
        }
        arr[i]=temp;
        
        
        
        
        
        
    }


//    public static  void heapSort(int arr[]){
//        int temp=0;
//           for(int i=arr.length/2-1;i>=0;i--){
//               adjust(arr,i,arr.length);
//
//           }
//
//           for(int j=arr .length-1;j>0;j--){
//             temp=arr[j];
//             arr[j]=arr[0];
//             arr[0]=temp;
//             adjust(arr,0,j);
//
//           }
//
//
//    }
//
//
//
//    public static  void adjust(int arr[],int i,int length){
//int temp=arr[i];
//
//
//for(int k=i*2+1;k<length;k=k*2+1){
//      if(k+1<length&&arr[k]<arr[k+1]){
//             k++;
//
//      }
//      if(arr[k]>temp){
//          arr[i]=arr[k];
//
//      i=k;
//
//
//      }else{
//          break;
//      }
//
//
//
//
//}
//        arr[i]=temp;
//
//
//
//
//    }

}
