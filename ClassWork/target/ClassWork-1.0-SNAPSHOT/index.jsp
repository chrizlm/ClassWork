<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="CreateStudentServlet" method="post">
    Name<input type="text" name="name"><br>
    student Reg no. <input type="text" name="id"><br>
    Phone num <input type="text" name="phone"><br>
    Course<input type="text" name="course"><br>
    no.of units<input type="number" name="unit_no"><br>
    <input type="submit">
</form>
<br>
<a href="GetStudentsServlet">list of students</a>
<br>
Find a student
<form action="GetStudentServlet" method="post">
    Enter registration number:<input type="text" name="regNumber"><br>
    <input type="submit" value="find">
</form>
</body>
</html>