package ru.devray.day8.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //штрихкоды - описание товара
        //HashSet - HashMap, LinkedHashSet - LinkedHashMap, TreeSet - TreeMap
        Map<Integer, GoodDescription> map = new HashMap<>();

        map.put(5564763, new GoodDescription("Зуб.паста", 90));
        map.put(42311, new GoodDescription("Зуб.паста", 190));
        map.put(42354675, new GoodDescription("Зуб.паста", 90));
        map.put(42354673, new GoodDescription("Зуб.паста", 92));
        map.put(null, new GoodDescription("Невалидный товар", 0));

        //получение элемента по ключу
        System.out.println(map.get(42311));

        //пример итерации
        for(Map.Entry<Integer, GoodDescription> entry : map.entrySet()){
            System.out.println("Штрих-код " + entry.getKey() + " - Название товара: " + entry.getValue());
        }

    }
}
