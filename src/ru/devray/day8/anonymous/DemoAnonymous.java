package ru.devray.day8.anonymous;

import ru.devray.day8.compare.Person;
import ru.devray.day8.compare.PersonComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoAnonymous {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Dylan", 56));
        list.add(new Person("Bob", 560));
        list.add(new Person("Marley", 100));
        list.add(new Person("Jack", 52));

        Collections.sort(list);

        //Вариант 1. создание экземпляра своего компаратора через объявление целого
        //отдельного класса PersonComparator
        Comparator<Person> pc = new PersonComparator();

        //Вариант 2. создание своего компаратора через объявление анонимного класса
        //на базе интерфейса Comparator с определением реализации всех абстрактных методов
        pc = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        };

        //Вариант 3. создание своего компаратора через лямбду
        //лямбда - это синтаксис для создания анонимного класса на базе функционального
        //интерфейса - в данном случае компаратора.
        pc = (p1, p2) -> {
            return p1.age - p2.age;
        };

        //Вариант 4. более короткая запись лямбды
        pc = (p1, p2) -> p1.age - p2.age;

        //Вариант 5. использование одного из готовых компараторов для примитивов
        pc = Comparator.comparingInt(p -> p.age);

        //финальный вызов нашего компаратора
        pc.compare(list.get(0), list.get(1));

        list.sort(pc);

        System.out.println(list);

        //пример создания анонимного класса на основе абстрактного класса
        ExampleAbstractClass e = new ExampleAbstractClass() {
            @Override
            void printMyself() {

            }
        };

        //пример создания анонимного класса на основе интерфейса (не функционального!)
        //поскольку функц. интерфейсы имеют только один абстрактный метод без реализации, а тут их два.
        MyHappyInterface i = new MyHappyInterface() {
            @Override
            public void doStuff() {

            }

            @Override
            public void print() {

            }
        };
    }
}
