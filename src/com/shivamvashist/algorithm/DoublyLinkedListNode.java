package com.shivamvashist.algorithm;

public class DoublyLinkedListNode<E> {

    DoublyLinkedListNode<E> prevNode;
    DoublyLinkedListNode<E> nextNode;
    E element;

    DoublyLinkedListNode(E element){
        this.prevNode = null;
        this.nextNode=null;
        this.element = element;
    }

}
