package com.example.java_start.practice;

public class ClassPrac {
    public static void main(String[] args) {
//        Course course = new Course(); // 인스턴스 생성
//        course.title = "이것은 타이틀이다.";
//        course.tutor = "이건 바뀐 변수 이름";
//        System.out.println("클래스" + course);
//        System.out.println("클래스" + course.title);
//        System.out.println("클래스" + course.tutor);
//        System.out.println("클래스" + course.days);
//
//        Course course1 = new Course("이것은 생성자", "이것도 생성자", 10);
//
//        System.out.println(course1.title);
//        System.out.println(course1.tutor);
//        System.out.println(course1.days);

        Tutor tutor = new Tutor();
        tutor.setName("재형");
        System.out.println("setName" + tutor.getName());
        System.out.println();
        System.out.println(tutor.getName());

        Tutor tutor1 = new Tutor("나는 재형", 10);
        System.out.println(tutor1.getName());
        System.out.println(tutor1.getBio());
    }
}
