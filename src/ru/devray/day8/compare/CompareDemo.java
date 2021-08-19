package ru.devray.day8.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Dylan", 56));
        list.add(new Person("Bob", 560));
        list.add(new Person("Marley", 100));
        list.add(new Person("Jack", 52));

        //дефолтный
        //вызовет сортировку по умолчанию, получаемую за счет имплементации в классе интерфейса Comparable
        Collections.sort(list);

        //настраиваемый по определенному принципу
        //для настраиваемой кастомной сортировки мы реализуем наследника интерфейса Comparator
        PersonComparator pc = new PersonComparator();
        list.sort(pc);

        System.out.println(list);

    }
}
