package ru.devray.day8.homeworkpractice;

import java.util.regex.Pattern;

public class Validator {

    public StringBuilder validateEmail(String rawEmail){
        String regexp = "^([a-z0-9]{1,64}@[a-z0-9]{1,32}\\.[a-z]{2,5})$";
        String[] emails = rawEmail.split(" ");

        StringBuilder sb = new StringBuilder();
        for(String email : emails){
            boolean isValid = email.matches(regexp);
            if (isValid) {
                sb.append(email+"\n");
            }
            System.out.println(String.format("%s элемент: [%s]", isValid ? "Валидный" : "Невалидный", email));
        }

        return sb;
    }

}
