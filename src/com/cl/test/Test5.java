package com.cl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
   static int a[]={3,2,5,6,4,9,8,10};
   static int arr[]={1,2,3,4,5,6,7,8,9,9};
   static int temp[]=new int[a.length];

    public static void main(String[] args) {
        //System.out.println(Search(arr, 0, arr.length-1, 11));
        jishu(a);
        System.out.println(Arrays.toString(a));


    }
    public static void jishu(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        int maxsize=(max+"").length();

        int[][]bucket=new int[10][arr.length];
        int []buckets=new int[10];

        for(int i=0,n=1;i<maxsize;i++,n*=10){

            for(int j=0;j<arr.length;j++){
                int num=arr[j]/n%10;
                bucket[num][buckets[num]]=arr[j];

                buckets[num]++;

            }
            int index=0;
            for(int k=0;k<buckets.length;k++){
                if(buckets[k]!=0){
                    for(int l=0;l<buckets[k];l++){
                        arr[index++]=bucket[k][l];


                    }


                }
                buckets[k]=0;

            }



        }







    }

    public static List<Integer> Search(int arr[],int left,int ringht,int find){
        if(left>ringht){
       List list=  new ArrayList<Integer>();
          list.add(-1);
          return list;

        }
        int mid=(left+ringht)/2;
        int midva=arr[mid];
        if(find<midva){
            return Search(arr,left,mid-1,find);
        }else if(find>midva){
            return Search(arr,mid+1,ringht,find);
        }else{
            List list=new ArrayList<Integer>();
            int temp=mid-1;
            while(true){
                if(temp<0||arr[temp]!=find){
                    break;

                }
                list.add(temp);
                temp--;
            }
            list.add(mid);
            temp=mid+1;
            while(true){
                if(temp>arr.length-1||arr[temp]!=find){
                    break;

                }
                list.add(temp);
                temp++;
            }
            return list;
        }

    }


    public static int erfenchazhao(int arr[],int left,int ringht,int find){
         if(left>ringht){
             return -1;

         }
int mid=(left+ringht)/2;
         int midva=arr[mid];

         if(find<midva){
              return erfenchazhao(arr,left,mid-1,find);
         }else if(find>midva){
             return erfenchazhao(arr,mid,ringht,find);
         }else{
             return mid;
         }




    }






    public static void maopao(int []arr){
        int temp;
                for(int i=0;i<arr.length-1;i++){
                    for(int j=0;j<arr.length-1-i;j++){
                        if(arr[j]>arr[j+1]){
                             temp=arr[j];
                             arr[j]=arr[j+1];
                             arr[j+1]=temp;


                        }

                    }


                }

    }

    public static void xuanze(int []arr){

        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int num=i;


            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>min){
                    min=arr[j];
                    num=j;


                }

            }
            if(num!=i){
                arr[num]=arr[i];
                arr[i]=min;

            }

        }

    }


    public static void charu(int []arr){
        int temp=0;
        int num=0;
        for(int i=1;i<arr.length;i++){
              temp=arr[i];
              num=i-1;
                   while(num>=0&&arr[num]>temp){
                        arr[num+1]=arr[num];
                        num--;


                   }
              if((num+1)!=i){
                  arr[num+1]=temp;

              }


            }


        }

    public static void xier(int []arr){

        for(int gap=arr.length/2;gap>0;gap/=2){
                   for(int i=gap;i<arr.length;i++){
                       int j=i;
                       int temp=arr[j];

                           while (j-gap>=0&&temp<arr[j-gap]){
                                      arr[j]=arr[j-gap];
                                      j-=gap;




                       }
                            a[j]=temp;

                   }


        }


    }


    public static void kuaisu(int []arr,int left,int right){
     int l=left;
     int r=right;
     int pivot=arr[(left+right)/2];
     int temp=0;
       while(l<r){
           while(arr[l]<pivot){
               l+=1;
           }
           while(arr[r]>pivot){
              r-=1;
           }
            if(l>=r){
                break;
            }
           temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;


            if(arr[l]==pivot){

                l++;
            }
           if(arr[r]==pivot){
               r--;
           }
       }
       if(l==r){
           l++;
           r--;

       }
       if(left<r){
           kuaisu(arr,left,r);
       }

        if(right>l){
            kuaisu(arr,l,right);
        }



    }
    public static  void fenzi(int arr[],int left,int right,int []temp){
            if(left<right){
                int mid=(left+right)/2;
                fenzi(arr,left,mid,temp);
               fenzi(arr,mid+1,right,temp);
               hebin(arr,left,mid,right,temp);



            }



    }



 public  static void hebin(int arr[],int left,int mid,int right,int[]temp){
 int i=left;

 int j=mid+1;
 int t=0;
 while(i<=mid&&j<=right){
     if(arr[i]<=arr[j]){
         temp[t]=arr[i];
         t++;
         i++;


     }else{
         temp[t]=arr[j];
         j++;
         t++;
     }
 }
 while(i<=mid){
     temp[t]=arr[i];
     t++;
     i++;


 }
while (j<=right){
    temp[t]=arr[j];
    j++;
    t++;
}

t=0;
int num=left;
while(num<=right){
    arr[num]=temp[t];
    t++;
    num++;
}
//for(int a=0,num=left;a<left;a++,num++){
//    arr[num]=temp[a];
//}




 }



}
