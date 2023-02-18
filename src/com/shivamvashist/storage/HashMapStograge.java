package com.shivamvashist.storage;

import com.shivamvashist.policy.LruEvictionPolicy;

import java.util.HashMap;

public class HashMapStograge<Key, Value> implements Storage<Key, Value> {

    HashMap<Key, Value> keyValueHashMap;
    int capacity;
    LruEvictionPolicy<Key, Value> lruEvictionPolicy;

    public HashMapStograge(int capacity) {
        this.keyValueHashMap = new HashMap<Key, Value>();
        this.capacity = capacity;
    }

    @Override
    public void add(Key key, Value value) {
        if (keyValueHashMap.size() == capacity) System.out.println("Capacity Full");
        else {
            keyValueHashMap.put(key,value);
            lruEvictionPolicy.keyAccessed(key);
        }
    }

    @Override
    public Value get(Key key) {
        if(keyValueHashMap.get(key) == null) System.out.println("Not Found");
        else {
            lruEvictionPolicy.keyAccessed(key);
            return keyValueHashMap.get(key);
        }
        return null;
    }

    @Override
    public Value remove(Key key) {
        if(keyValueHashMap.get(key) == null) System.out.println("Not Found");
        else {
            Value v = keyValueHashMap.get(key);
            lruEvictionPolicy.evictKey(key);
            keyValueHashMap.remove(key);
            return v;
        }
        return null;
    }
}
