package com.example.java_start.practice;

import java.util.ArrayList;
import java.util.List;

public class Prac1 {
    public static void main(String[] args) {
        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        for (int i = 0; i < celebs.size(); i++) {
            String name = celebs.get(i);

            System.out.println("연예인 이름은:" + name);
        }

        String fruitName = "감";
        int result = countFruit(fruitName);
        System.out.println(fruitName +"갯수 :"+ result);
    }
    public static int countFruit(String fruit) {
        int count = 0;

        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        for (int i = 0; i < fruits.size(); i++) {
            if( fruit == fruits.get(i)) {
                count += 1;
            }
        }

        return count;
    }
}
