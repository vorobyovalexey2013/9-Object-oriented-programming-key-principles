package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = "true";
        post.birthday = new FormDate();
        post.birthday.day = Integer.parseInt("13");
        post.birthday.month = Integer.parseInt("6");
        post.birthday.year = Integer.parseInt("1999");
    }
}