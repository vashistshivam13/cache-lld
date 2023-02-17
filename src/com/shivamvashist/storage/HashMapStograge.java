package com.shivamvashist.storage;

import java.util.HashMap;

public class HashMapStograge<Key, Value> implements Storage<Key, Value> {

    HashMap<Key, Value> keyValueHashMap;
    int capacity;

    public HashMapStograge(int capacity) {
        this.keyValueHashMap = new HashMap<Key, Value>();
        this.capacity = capacity;
    }

    @Override
    public void add(Key key, Value value) {
        if (keyValueHashMap.size() == capacity) System.out.println("Capacity Full");
        else {
            keyValueHashMap.put(key,value);
            //call key accessed method
        }
    }

    @Override
    public Value get(Key key) {
        if(keyValueHashMap.get(key) == null) System.out.println("Not Found");
        else {
            //call key accessed method
            return keyValueHashMap.get(key);
        }
        return null;
    }

    @Override
    public Value remove(Key key) {
        if(keyValueHashMap.get(key) == null) System.out.println("Not Found");
        else {
            Value v = keyValueHashMap.get(key);
            //call key evict method
            keyValueHashMap.remove(key);
            //call key accessed method
            return v;
        }
        return null;
    }
}
