package com.chris.ClassWork;

import com.chris.model.DatabaseConnectionStudent;
import com.chris.model.Student;
import com.chris.model.StudentServiceMethods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet(name = "CreateStudentServlet", value = "/CreateStudentServlet")
public class CreateStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String regNum = request.getParameter("id");
        String phonenum = request.getParameter("phone");
        String course = request.getParameter("course");
        int numOfUnits = Integer.parseInt(request.getParameter("unit_no"));

        Student student = new Student(name, regNum,phonenum, course, numOfUnits);

        response.getWriter().println(student);

        StudentServiceMethods studentServiceMethods = new StudentServiceMethods();
        studentServiceMethods.createStudent(name, regNum, phonenum, course, numOfUnits);

        /*
        try{
            Connection connection = DatabaseConnectionStudent.initializeDataBase();
            PreparedStatement statement = connection.prepareStatement("insert into student_table values(?,?,?,?,?)");

            statement.setString(1, name);
            statement.setString(2, regNum);
            statement.setString(3, "+254" + phonenum);
            statement.setString(4, course);
            statement.setInt(5, numOfUnits);

            statement.executeUpdate();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
         */

        /*
        *  Connection connection = DataBConnect.initializeDatabase();
            PreparedStatement statement = connection.prepareStatement("insert into detail_table values (?)");

            statement.setString(1, name);
            statement.executeUpdate();
            statement.close();
            connection.close();
        * */
    }


}
