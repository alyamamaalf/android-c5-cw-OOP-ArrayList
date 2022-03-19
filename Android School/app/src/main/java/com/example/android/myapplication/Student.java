package com.example.android.myapplication;

public class Student {
    private String studentName;
    private int studentGrade;
    private int studentAge;
    private int studentImg;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(int studentImg) {
        this.studentImg = studentImg;
    }

    public Student(String studentName, int studentGrade, int studentAge, int studentImg) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentAge = studentAge;
        this.studentImg = studentImg;
    }
}
