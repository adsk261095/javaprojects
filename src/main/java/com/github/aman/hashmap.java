package com.github.aman;
import com.google.common.collect.ImmutableMap;
import java.util.*;

/**
 * Hashmap"s are unsynchronized by default
 * But we can create synchronized hashmap
 * HashTables are synchronized by default
 */
public class hashmap {
    private HashMap<String, Integer> createHashMap(){
        HashMap <String, Integer> map = new HashMap<String, Integer>();
        map.put("Aman",1);
        map.put("Amol",2);
        map.put("mom",3);

        if(!map.containsKey("aman")){
            System.out.println("key not present");
        }

        System.out.println(map.get("Amol"));

        // java hashmap are mutal by default
        map.put("Amol", map.get("Amol")+100);
        System.out.println("new value for amol is : " + map.get("Amol") + " type is :" + map.get("Amol").getClass().getName());
        map.remove("Amol");
        System.out.println(map);
        System.out.println(map.size());
        return map;
    }
    private void createImmutableHashMap(){
        HashMap <String ,Integer> hm = this.createHashMap();
        ImmutableMap<String, Integer> imap = ImmutableMap.copyOf(hm);
        try{
            imap.put("Aman",100);
            hm.put("Mom", 200);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("trying to modify immutablemap");
        }
        finally {
            System.out.println(imap);
        }
    }
    public static void main(String[] args) {
        hashmap m = new hashmap();
        m.createImmutableHashMap();
//        m.createHashMap();
    }

}
