package ru.devray.day8.map;

public class GoodDescription {
    String name;
    int price;

    public GoodDescription(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return  String.format("%s [цена:%d Руб.]", this.name, this.price);
    }
}
