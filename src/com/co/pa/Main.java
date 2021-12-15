package com.co.pa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(8);
        array.add(1);
        array.add(3);
        array.add(1);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(3);
        array.add(2);
        System.out.println(countDuplicate(array));
    }

    public static int countDuplicate(List<Integer> numbers) {
        Map<Integer, Integer> counterMap = new LinkedHashMap<>();
        int totalMoreThanOnce = 0;
        for(Integer index : numbers){
            if(counterMap.containsKey(index))counterMap.put(index, (counterMap.get(index) + 1));
            else counterMap.put(index, 1);
        }

        for(Map.Entry<Integer, Integer> index : counterMap.entrySet())
            if(index.getValue() > 1) totalMoreThanOnce++;
        return totalMoreThanOnce;
    }
}
