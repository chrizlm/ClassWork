package com.chris.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceMethods {

    public void createStudent(String name,
                              String regNum,
                              String phoneNum,
                              String course,
                              int numOfUnits){

        try {
            Connection connection = DatabaseConnectionStudent.initializeDataBase();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student_table values(?,?,?,?,?)");

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, regNum);
            preparedStatement.setString(3, "+254" + phoneNum);
            preparedStatement.setString(4, course);
            preparedStatement.setInt(5, numOfUnits);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }







    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();

        try {
            Connection connection = DatabaseConnectionStudent.initializeDataBase();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student_table");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                String regNum = resultSet.getString(2);
                String phoneNum = resultSet.getString(3);
                String course = resultSet.getString(4);
                int numOfUnits = resultSet.getInt(5);

                Student student = new Student(name, regNum, phoneNum, course, numOfUnits);
                studentList.add(student);
            }

            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }




    public Student getStudent(String regNum){
        try {
           Connection connection = DatabaseConnectionStudent.initializeDataBase();
           PreparedStatement preparedStatement = connection.prepareStatement("select * from student_table where regnum=?");

           preparedStatement.setString(1,regNum);
           ResultSet resultSet = preparedStatement.executeQuery();

           resultSet.next();
           String name = resultSet.getString(1);
           String studentRegNum = resultSet.getString(2);
           String phonenum = resultSet.getString(3);
           String course = resultSet.getString(4);
           int numOfUnits = resultSet.getInt(5);

           preparedStatement.close();
           connection.close();

           Student student = new Student(name, studentRegNum, phonenum, course, numOfUnits);

           return student;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public void deleteStudent(String regNum){
        try {
            Connection connection = DatabaseConnectionStudent.initializeDataBase();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from student_table where regnum=?");
            preparedStatement.setString(1,regNum);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student){

        String name = student.getName();
        String regNum = student.getRegnum();
        String phoneNum = student.getPhonenum();
        String course = student.getCourse();
        int numOfUnits = student.getNumOfUnits();

        try{
            Connection connection = DatabaseConnectionStudent.initializeDataBase();
            PreparedStatement preparedStatement = connection.prepareStatement("update student_table set name=?, regnum=?, phonenum=?, course=?, numofunits=?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, regNum);
            preparedStatement.setString(3, phoneNum);
            preparedStatement.setString(4, course);
            preparedStatement.setInt(5,numOfUnits);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }




}


