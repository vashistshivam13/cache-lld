package com.shivamvashist.policy;

public class lruEvictionPolicy<Key, Value> implements EvictionPolicy<Key, Value> {



    @Override
    public void keyAccessed(Key key) {

    }

    @Override
    public Value evictKey(Key key) {
        return null;
    }
}
