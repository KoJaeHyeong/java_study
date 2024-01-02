package com.example.java_start.practice;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        System.out.println("안녕, 나는 재형이야!");

        int a = 1;
        float b = 1.2f;
        float c = a + b;
        String e = "자바 일주일 안에 끝낸다!";

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("E:" + e);

        int age = 31;
        boolean isAdult = age > 19;
        boolean isKid = age <= 19;

        boolean isEqual = age == 31;
        boolean isDiff = age != 31;

        System.out.println(isAdult);
        System.out.println(isKid);
        System.out.println(isEqual);
        System.out.println(isDiff);

        List<String> newList = new ArrayList<>();
        System.out.println(newList);
        newList.add("서버 개발 Spring");
        newList.add("이건 두번째 인덱스");

        System.out.println(newList);
        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        newList.remove(1);
        System.out.println(newList);

        String course1 = "나는 재형이";
        String course2 = "너는 재형이";

        List<String> nameList = new ArrayList<>();
        nameList.add(course1);
        nameList.add(course2);

        System.out.println(nameList);

        System.out.println(minus(10, 2));
    }
    public static int minus(int a, int b) {
        return a - b;
    }
}
