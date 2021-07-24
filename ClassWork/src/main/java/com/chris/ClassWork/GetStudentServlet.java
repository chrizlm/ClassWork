package com.chris.ClassWork;

import com.chris.model.Student;
import com.chris.model.StudentServiceMethods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GetStudentServlet", value = "/GetStudentServlet")
public class GetStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentServiceMethods studentServiceMethods = new StudentServiceMethods();

        String stuRegNum = request.getParameter("regNumber");
        Student student = studentServiceMethods.getStudent(stuRegNum);

        response.getWriter().println(student.toString());
    }
}
