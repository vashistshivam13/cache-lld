package com.shivamvashist.algorithm;

public class DoublyLinkedList<E> {

    DoublyLinkedListNode<E> head;
    DoublyLinkedListNode<E> tail;

    DoublyLinkedList(){

        head = new DoublyLinkedListNode<E>(null);
        tail = new DoublyLinkedListNode<E>(null);


        head.nextNode = tail;
        tail.prevNode=head;
    }

    //TODO: add condition of first, last element in list
    public void detachNode(DoublyLinkedListNode<E> node){
        if(node!=null){
            node.prevNode.nextNode = node.nextNode;
            node.nextNode.prevNode = node.prevNode;
        }
    }

    public void addNodeAtLast(DoublyLinkedListNode<E> node){
        if(node!=null){
            tail.nextNode = node;
            node.prevNode = tail;
            tail = node;
        }
    }


}
