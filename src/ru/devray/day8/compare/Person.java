package ru.devray.day8.compare;

public class Person implements Comparable{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) return 0;
        Person s = (Person) o;
        return name.compareTo(s.name);
    }
}
