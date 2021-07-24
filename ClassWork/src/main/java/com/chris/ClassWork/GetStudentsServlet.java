package com.chris.ClassWork;

import com.chris.model.DatabaseConnectionStudent;
import com.chris.model.Student;
import com.chris.model.StudentServiceMethods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GetStudentsServlet", value = "/GetStudentsServlet")
public class GetStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StudentServiceMethods studentServiceMethods = new StudentServiceMethods();
        List<Student> listOfStudents = studentServiceMethods.getStudents();

        for(Student student : listOfStudents){
            response.getWriter().println(student.toString());
        }

    }
}
