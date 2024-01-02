package com.example.java_start.practice;

public class Course {
    // 멤버변수들
    public String title;
    public String tutor;
    public int days;

    // 클래스와 똑같은 이름의 메소드를 생성자라 한다.
    public Course() {  // 파라미터 X : 기본 생성자
        this.tutor = "기본 변수 이름";
        this.days = 30;
    }

    public  Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }
}
