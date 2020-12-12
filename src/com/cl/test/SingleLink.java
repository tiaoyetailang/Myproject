package com.cl.test;

public class SingleLink {

    Hero head = new Hero(0, "");

    public static void main(String[] args) {
        SingleLink link = new SingleLink();
        link.add(new Hero(1,"1"));
        link.add(new Hero(3,"3"));
        link.add(new Hero(2,"2"));
        link.add(new Hero(4,"4"));
        link.add(new Hero(5,"5"));
        link.fanzhuan();
        link.list();

    }


    public void list(){
        Hero temp=head.next;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.next;
        }



    }


    public void add(Hero hero){
        Hero temp=head;
        boolean flag=false;
        while (true){
            if(temp.next==null){
                break;
            }
            if(temp.next.no>hero.no){
                break;


            }
            if(temp.next.no==hero.no){
                flag=true;
                break;
            }
            temp=temp.next;


        }
        if(flag){
            throw new RuntimeException("已经存在");
        }

        hero.next=temp.next;
        temp.next=hero;



  }









//    public void add(Hero hero){
//        Hero temp=head;
//        boolean flag=false;
//        while(true){
//            if(temp.next==null){
//                break;
//            }
//            if(temp.next.no>hero.no){
//                break;
//            }else if(temp.next.no==hero.no){
//                flag=true;
//                break;
//            }
//                  temp=temp.next;
//
//
//        }
//        if(flag){
//            throw  new RuntimeException("已经存在的");
//        }
//
//      ;
//        hero.next=temp.next;
//        temp.next=hero ;
//
//
//    }
public void update(Hero hero){
    if(head.next==null){
        throw new RuntimeException("空的");

    }
    Hero temp=head.next;
    boolean flag=false;
    while(true){
        if(temp==null){
            break;
        }
        if(temp.no==hero.no){
            flag=true;
            break;
        }

        temp=temp.next;

    }
    if(flag){
        temp.name=hero.name;
    }else{
        throw new RuntimeException("找不到");
    }


}



//
//    public void update(Hero hero){
//        if(head.next==null){
//            throw new RuntimeException("空的");
//        }
//       Hero temp=head.next;
//            boolean flag=false;
//            while(true){
//                if(temp==null) {
//                    break;
//                }
//                if(temp.no==hero.no){
//                    flag=true;
//                    break;
//                }
//             temp=temp.next;
//            }
//
//            if(flag){
//                temp.name=hero.name;
//
//            }else{
//                throw new RuntimeException("没匹配到");
//
//            }
//
//
//
//    }

    public void delete(int number){
         Hero temp=head;
         boolean flag=false;
//         while(true){
//             if(temp.next==null){
//                 break;
//             }
//             if(temp.no==number){
//                 flag=true;
//                 break;
//             }
//             temp=temp.next;
//
//
//         }
        while(temp!=null){
            if(temp.next.no==number){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;

        }



    }


//
//    public void delete(int number){
//        Hero temp=head;
//        boolean flag=false;
//        while(true) {
//            if (temp.next == null) {
//                break;
//            }
//            if(temp.no==number){
//                flag=true;
//                break;
//            }
//
//               temp=temp.next;
//        }
//        if(flag){
//            temp.next=temp.next.next;
//
//
//        }else{
//         throw  new RuntimeException("找不到");
//        }
//
//    }
//
//    public void list(){
//        if(head.next==null){
//            throw  new RuntimeException("空的");
//
//        }
//        Hero temp=head.next;
//        while (true){
//                if(temp==null){
//                    break;
//                }
//            System.out.println(temp);
//                temp=temp.next;
//
//        }
//
//
//
//    }


    public void fanzhuan(){
        if(head.next==null||head.next.next==null){
            return ;
        }

        Hero temp=head.next;
        Hero next=null;
        Hero hero=new Hero(0,"");

        while (temp!=null){
            next=temp.next;
            temp.next=hero.next;
            hero.next=temp;

            temp=temp.next;



        }
        head.next=hero.next;

    }
//
//    public void fanzhuan(){
//     if(head.next==null||head.next.next==null){
//         return ;
//     }
//
//
//      Hero temp=head.next;
//     Hero next=null;
//     Hero hero=new Hero(0,"");
//
//
//     while(temp!=null){
//         next=temp.next;
//         temp.next=hero.next;
//         hero.next=temp;
//         temp=next;
//
//
//
//     }
//
//head.next=hero.next;
//
//    }
//
//
//}
}