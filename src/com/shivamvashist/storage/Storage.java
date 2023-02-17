package com.shivamvashist.storage;

public interface Storage<Key, Value> {

    public void add(Key key, Value value);
    public Value get(Key key);
    public Value remove(Key key);

}
