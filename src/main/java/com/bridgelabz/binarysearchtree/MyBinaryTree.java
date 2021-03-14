package com.bridgelabz.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {

    public void add(MyBinaryNode<K> root, K key){

        if(root == null){
            new MyBinaryNode<>(key);
        }
        else if(root.key.compareTo(key) < 0){
            if(root.right == null){
                root.right =  new MyBinaryNode<>(key);
                return;
            }
            add(root.right,key);
        }else {
            if(root.left == null) {
                root.left = new MyBinaryNode<>(key);
                return;
            }
            add(root.left,key);
        }
    }

    public void inOrder(MyBinaryNode<K> root){

        if(root != null){
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }

    public int size(MyBinaryNode<K> root){

        if(root == null){
            return 0;
        }else{
            return 1 + size(root.left) + size(root.right);
        }
    }

    public boolean search(MyBinaryNode<K> root, K key){

        if(root == null){
            return false;
        }else if(root.key.compareTo(key) == 0){
            return true;
        }
        else if(root.key.compareTo(key) < 0){
            return search(root.right , key);
        }else{
            return search(root.left , key);
        }
    }
}
