package com.shivamvashist.algorithm;

public class DoublyLinkedListNode<E> {

    DoublyLinkedListNode<E> prevNode;
    DoublyLinkedListNode<E> nextNode;
    E element;

    public DoublyLinkedListNode(E element){
        this.prevNode = null;
        this.nextNode=null;
        this.element = element;
    }

    public <E> E getElement() {
        return (E) this.element;
    }
}
