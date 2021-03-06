package com.javarush.test.level29.lesson15.big01.human;

public class Teacher extends UniversityPerson {
    private int numberOfStudents;
    private University university;

    public Teacher(String name, int age, int numberOfStudents) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;
    }

    public void live() {
        teach();
    }

    public void teach() {
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void printData() {
        System.out.println("Преподаватель: " + name);
    }
}
