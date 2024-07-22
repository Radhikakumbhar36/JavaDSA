package Hashing;

import java.util.*;

public class HashMapFinal<K, V> {
    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public HashMapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        if ((float) size / list.size() > lf) {
            reHash();
            hash = Math.abs(key.hashCode() % list.size()); // Recalculate hash after rehashing
            entities = list.get(hash);
        }

        entities.add(new Entity(key, value));
        size++;
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        Iterator<Entity> iterator = entities.iterator();
        while (iterator.hasNext()) {
            Entity entity = iterator.next();
            if (entity.key.equals(key)) {
                iterator.remove();
                size--;
                return entity.value;
            }
        }
        return null;
    }

    private void reHash() {
        System.out.println("We are now rehashing");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : old) {
            for (Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(i).append(": ");
            for (Entity entity : list.get(i)) {
                sb.append("(").append(entity.key).append(", ").append(entity.value).append(") ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashMapFinal<String, String> map = new HashMapFinal<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        System.out.println(map);

        System.out.println("Value for 'two': " + map.get("two"));

        System.out.println("Removing 'two': " + map.remove("two"));

        System.out.println(map);
    }
}
