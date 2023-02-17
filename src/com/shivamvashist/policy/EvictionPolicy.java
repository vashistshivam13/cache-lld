package com.shivamvashist.policy;

public interface EvictionPolicy<Key, Value> {

    public void keyAccessed(Key key);

    public Value evictKey(Key key);

}
