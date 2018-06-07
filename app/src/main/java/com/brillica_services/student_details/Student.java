package com.brillica_services.student_details;

public class Student {
    String name;
    String course;
    double fees;
    public Student(String name,String course,double fees){
        this.name=name;
        this.course=course;
        this.fees=fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
