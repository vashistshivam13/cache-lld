package com.shivamvashist.policy;

import com.shivamvashist.algorithm.DoublyLinkedList;
import com.shivamvashist.algorithm.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

public class LruEvictionPolicy<Key, Value> implements EvictionPolicy<Key, Value> {

    private DoublyLinkedList<Key> dll;
    private Map<Key, DoublyLinkedListNode<Key>> mapper;

    LruEvictionPolicy(){
        this.dll = new DoublyLinkedList<Key>();
        this.mapper = new HashMap<Key, DoublyLinkedListNode<Key>>();
    }

    @Override
    public void keyAccessed(Key key) {
        if(mapper.containsKey(key)){
            DoublyLinkedListNode<Key> tempNode = mapper.get(key);
            dll.detachNode(tempNode);
            dll.addNodeAtLast(tempNode);
        } else {
            DoublyLinkedListNode<Key> node = new DoublyLinkedListNode<Key>(key);
            dll.addNodeAtLast(node);
            mapper.put(key, node);
        }
    }

    @Override
    public void evictKey(Key key) {
        if(!mapper.containsKey(key)) {
            System.out.println("Key Not Found");
        }
        DoublyLinkedListNode<Key> node = mapper.get(key);
        dll.detachNode(node);
        mapper.remove(key);
    }
}
