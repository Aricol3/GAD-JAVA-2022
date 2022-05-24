package Lab6Collections.Ch7;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K, V> implements MyHashTable<K, V> {
    List<K> keys;
    List<V> values;

    HashTable() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void put(K key, V value) {

    }

    @Override
    public void remove(K key) {

    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public int size() {
        return 3;
    }

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.put("key2", "value2");
        myHashTable.put("key3", "value3");
        System.out.println(myHashTable.size());
    }
}