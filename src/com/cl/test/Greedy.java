package com.cl.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Greedy {
    public static void main(String[] args) {
        Map<String, HashSet<Integer>> b=new HashMap<String, HashSet<Integer>>();
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(1);
        h1.add(2);
        h1.add(3);

        HashSet<Integer> h2 = new HashSet<>();
        h2.add(4);
        h2.add(1);
        h2.add(5);


        HashSet<Integer> h3 = new HashSet<>();
        h3.add(6);

        h3.add(7);

        HashSet<Integer> h4 = new HashSet<>();

        h4.add(2);
        h4.add(3);
        HashSet<Integer> h5 = new HashSet<>();
        h5.add(7);
        h5.add(8);

        b.put("K1",h1);
        b.put("K2",h2);
        b.put("K3",h3);
        b.put("K4",h4);
          b.put("K5",h5);

        HashSet<Integer> allAreas = new HashSet<>();
        for (int i = 1; i <=8; i++) {
            allAreas.add(i);
        }
        ArrayList<String> list = new ArrayList<>();

        HashSet<Integer> tempSet = new HashSet<>();
        while(allAreas.size()!=0){
            String maxkey=null;
            int size=0;
            for(String key:b.keySet()){
                tempSet.clear();
                tempSet.addAll(b.get(key));
                tempSet.retainAll(allAreas);
                if(tempSet.size()>size){
                    maxkey=key;
                    size=tempSet.size();
                }


            }
            if(maxkey!=null){
                list.add(maxkey);
                allAreas.removeAll(b.get(maxkey));
                System.out.println(allAreas);

            }


        }




//        while(allAreas.size()!=0){
//            String maxkey=null;
//            int size=0;
//            for(String key:b.keySet()){
//                tempSet.clear();
//                      tempSet.addAll(b.get(key));
//                      tempSet.retainAll(allAreas);
//                if((maxkey==null||tempSet.size()>size)){
//                    maxkey=key;
//                    size=tempSet.size();
//                }
//
//            }
//              if(maxkey!=null){
//                  list.add(maxkey);
//                  allAreas.removeAll(b.get(maxkey));
//                  System.out.println(allAreas);
//              }
//
//
//        }

//        while(allAreas.size()!=0){
//                 String     maxKey=null;
//
//            for(String key:b.keySet()){
//                    tempSet.clear();
//                HashSet<Integer> areas = b.get(key);
//                tempSet.addAll(areas);
//                tempSet.retainAll(allAreas);
//                if(tempSet.size()>0&&(maxKey==null||tempSet.size()>b.get(maxKey).size())){
//                      maxKey=key;
//
//                }
//            }
//                if(maxKey!=null){
//                    list.add(maxKey);
//                    allAreas.removeAll(b.get(maxKey));
//                    System.out.println(allAreas);
//
//
//                }
//
//        }





        System.out.println(list);
    }
}
