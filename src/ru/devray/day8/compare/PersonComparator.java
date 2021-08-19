package ru.devray.day8.compare;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        if (o1.age > o2.age) return 1; //первый больше
        if (o1.age < o2.age) return -1; //первый объект меньше (т.е. будет в списке отсортирован на более раннюю позицию)
        return 0; //объекты равны
    }
}
