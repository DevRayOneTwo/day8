package ru.devray.day8.map;

import java.util.Objects;

public class StripeCode {

    int id = 434234;
    String code = " ||  |  ||";
    String code1 = " ||  |  ||";
    int number;

    public StripeCode(String code, int number) {
        this.code = code;
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StripeCode that = (StripeCode) o;
        return number == that.number && Objects.equals(code, that.code) && Objects.equals(code1, that.code1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, number);
    }
}
