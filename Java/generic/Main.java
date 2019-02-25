package generic;

import generic.model.MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(2, "Rahul");
        map.put(7, "Singh");
        map.put(49, "Ajeet");
        map.put(3, "Anuj");
        map.put(4, "Anna");

        System.out.println(map.get(2));
        System.out.println(map.remove(3));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
