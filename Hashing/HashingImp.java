package Hashing;
//This is the own Implementation of HashMap
import java.util.*;
public class HashingImp {
    public static void main(String[] args) {
        MapUsingHash map=new MapUsingHash();
        map.put("Mango", "King of Fruits");
        map.put("Apple", "A sewwt red fruit");
        map.put("Litchi", "Fav fruit");

        System.out.println(map.get("Apple"));
    }
    
}

class MapUsingHash{
    private Entity[] entities;

    public MapUsingHash(){
        entities=new Entity[100];
    }

    public void put(String key,String value){
        int hash=Math.abs(key.hashCode()%entities.length);
        entities[hash]=new Entity(key,value); //overriding
    }

    public String get(String key1){
        int hash=Math.abs(key1.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key1.equals(key1)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key1.equals(key)){
            entities[hash]=null;
        }

    }
    private class Entity{
        String key1;
        String value;

        public Entity(String key1, String value){
            this.key1=key1;
            this.value=value;
        }  
    }
}