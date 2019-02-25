package generic.model;

import java.util.ArrayList;

public class MyHashMap<K, V> {
    private ArrayList<MyEntry<K, V>> elements;

    public MyHashMap() {
        elements = new ArrayList<>();
    }

    public void put(K key, V value) {
        elements.add(new MyEntry<>(key, value));
    }

    public V get(K key) {
        for (MyEntry<K, V> element : elements) {
            if (element.getKey().equals(key)) {
                return element.getValue();
            }
        }
        return null;
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public V remove(K key) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getKey().equals(key)) {
                elements.remove(i);
                return elements.get(i).getValue();
            }
        }
        return null;
    }
}