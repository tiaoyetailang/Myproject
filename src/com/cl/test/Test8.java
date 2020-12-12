//package com.cl.test;
//
//public class Test8 {
//    public static void main(String[] args) {
//        int arr[]={7,3,10,12,5,1,9};
//        Binary binary = new Binary();
//        for(int i=0;i<arr.length;i++){
//            binary.add(new Node(arr[i]));
//
//        }
//        binary.Order();
//    }
//
//
//
//}
//
//
//
//class Binary{
//    Node root;
//    public void add(Node node){
//        if(root==null){
//            root=node;
//        }else{
//            root.add(node);
//        }
//
//    }
//
//    public void Order(){
//        root.Order();
//    }
//
//    public Node search(int value){
//        if(root==null){
//            return null;
//        }
//        return root.search(value);
//
//    }
//
//    public Node searchParent(int value){
//        if(root==null){
//            return null;
//        }
//        return root.searchParent(value);
//
//    }
//
//    public int deleteRight(Node node){
//        Node temp=node;
//        while(temp.left!=null){
//            temp=temp.left;
//        }
//        delete(temp.value);
//        return temp.value;
//
//
//    }
//
//    public  void delete(int value){
//        if(root==null){
//            return;
//        }
//        Node target=search(value);
//        if(target==null){
//            return ;
//        }
//        if(root.left==null&&root.right==null){//寻找到的是头结点
//            root=null;
//            return ;
//        }
//
//        Node parent=root.searchParent(value);
//        if(target.left==null&&target.right==null){
//            if(parent.left!=null&&parent.left.value==value){
//                parent.left=null;
//            }else if(parent.right!=null&&parent.right.value==value){
//                parent.right=null;
//            }
//
//        }else if(target.left!=null&&target.right!=null){
//              int temp=deleteRight(target.right);
//              target.value=temp;
//
//
//
//        }else{
//                 if(target.left!=null){
//                          if(parent!=null){//不是头结点
//                              if(parent.left.value==value){
//                                         parent.left=target.left;
//                              }else{
//                                  parent.right=target.left;
//                              }
//                          }else{
//                               root=target.left;
//                          }
//
//                 }else{
//                     if(parent!=null){
//                         if(parent.left.value==value){
//                                    parent.left=target.right;
//                         }else{
//                                        parent.right=target.right;
//                         }
//                     }else{
//                         root=target.right;
//                     }
//                 }
//
//        }
//
//
//
//
//    }
//
//}
//
//
//
//
//
//class Node{
//    int value;
//    Node left;
//    Node right;
//
//    @Override
//    public String toString() {
//        return "Node{" +
//                "value=" + value +
//                '}';
//    }
//
//    public Node(int value) {
//        this.value = value;
//    }
//
//
//    public void add(Node node){
//        if(node==null){
//            return;
//        }
//        if(node.value<this.value){
//            if(this.left==null){
//                this.left=node;
//            }else{
//             this.left.add(node);
//            }
//
//
//        }else{
//            if(this.right==null){
//                this.right=node;
//
//            }else{
//                this.right.add(node);
//            }
//
//
//        }
//
//
//
//    }
//
//
//    public void Order(){
//
//        if(this.left!=null){
//            this.left.Order();
//        }
//        System.out.println(this);
//        if(this.right!=null){
//            this.right.Order();
//        }
//
//
//    }
//
//
//    public Node search(int value){
//        if(value==this.value){
//      return this;
//        }else if(value<this.value){
//            if(this.left==null){
//                return null;
//            }
//            return this.left.search(value);
//        }else{
//            if(this.right==null){
//                return null;
//            }
//            return this.right.search(value);
//
//        }
//
//
//    }
//
//    public Node searchParent(int value){
//         if((this.right!=null&&this.right.value==value)&&this.left!=null&&this.left.value==value){
//             return this;
//         }else{
//                     if(value<this.value&&this.left!=null){
//                          return this.left.searchParent(value);
//                     }else if(value>this.value&&this.right!=null){
//                         return this.right.searchParent(value);
//                     }else{
//                         return null;
//                     }
//
//
//         }
//
//
//
//    }
//
//
//}
