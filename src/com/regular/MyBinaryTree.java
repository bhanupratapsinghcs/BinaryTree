package com.regular;

public class MyBinaryTree {
    Node root;

    public Node getRoot(){
        return root;
    }
    public void insert(int data){
        Node node = new Node(data);
        if (root==null){
            root=node;
        }
        else {
            Node temp =root;
            Node parent = null;
            while (temp!=null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
                if(node.getData()<=parent.getData()){
                    parent.setLeft(node);
                }
                else {
                    parent.setRight(node);
                }

        }
    }
//    tree search function
    public boolean search(int data){
        boolean responce = false;
        Node temp = root;
        while (temp!=null) {
            if (temp.getData() == data) {
                responce = true;
                break;
            }
            else {
                if (data <=temp.getData()){
                    temp = temp.getLeft();
                }
                else {
                    temp = temp.getRight();
                }
            }
        }
        return responce;
    }
    public void treversePreOrder(Node node){
        if (node!=null){
            System.out.print(node.getData()+", ");
            treversePreOrder(node.getLeft());
            treversePreOrder(node.getRight());
        }
    }
    public void treverseInOrder(Node node){
        if (node!=null){
            treverseInOrder(node.getLeft());
            System.out.print(node.getData()+" ,");
            treverseInOrder(node.getRight());
        }
    }
    public void treversePostOrder(Node node){
        if (node!=null){
            treversePostOrder(node.getLeft());
            treversePostOrder(node.getRight());
            System.out.print(node.getData()+", ");
        }
    }

}
