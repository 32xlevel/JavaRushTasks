package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ilkaev", 50000);
        map.put("Ponomarev", 5000);
        map.put("Fedotov", 30000);
        map.put("Kazaev", 20000);
        map.put("Ovchinikov", 100);
        map.put("Lepixin", 499);
        map.put("Zotova", 40000);
        map.put("Nikitina", 10000);
        map.put("Naev", 123);
        map.put("Sinichin", 321);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Map<String, Integer> mapCopy = new HashMap<>(map);
        for(Map.Entry<String, Integer> tmp : mapCopy.entrySet()) {
            if(tmp.getValue() < 500) {
                map.remove(tmp.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}