package ru.devray.day8.homeworkpractice;

public class Launcher {
    public static void main(String[] args) {
        String exampleInput =
                "d5f@ya.ru " +
                "45345@gfgf.com gfggd@@ " +
                "gFdg@.org " +
                "sgdfg@mail.tooloDFDSFSmain " +
                "mail@mail.ru " +
                "rerg@bk.com " +
                "text.text@email.ru";

        Validator validator = new Validator();
        System.out.println(validator.validateEmail(exampleInput.toLowerCase()));

    }
}
