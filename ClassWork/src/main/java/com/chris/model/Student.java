package com.chris.model;

public class Student {

    private String name;
    private String regnum;
    private String phonenum;
    private String course;
    private int numOfUnits;

    public Student() {
    }

    public Student(String name, String regnum, String phonenum, String course, int numOfUnits) {
        this.name = name;
        this.regnum = regnum;
        this.phonenum = phonenum;
        this.course = course;
        this.numOfUnits = numOfUnits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNumOfUnits() {
        return numOfUnits;
    }

    public void setNumOfUnits(int numOfUnits) {
        this.numOfUnits = numOfUnits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regnum='" + regnum + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", course='" + course + '\'' +
                ", numOfUnits=" + numOfUnits +
                '}';
    }
}
