package katahistogram;

import java.lang.Integer;import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram <T>{

    private Map<T, Integer> map;

    public Histogram() {
        map = new HashMap<T, Integer>();
    }

    public Set<T> keySet() {
        return map.keySet();
    }

    public Integer get(T key) {
        return map.get(key);
    }

    public void increment(T key){
        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
}
