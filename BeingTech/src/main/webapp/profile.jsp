<%@page import="com.BeingTech.Dto.UsersDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<%
    UsersDto user = (UsersDto) session.getAttribute("currentUser");

    if (user == null) {
        response.sendRedirect("login_page.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Panel - BeingTech</title>
    <!-- Bootstrap CSS -->
</head>
<body>
<%@ include file="function.html" %>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">BeingTech Admin</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Java</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">SQL</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Python</a>
                    </li>
                </ul>
                <!-- Username and Logout Button Aligned Right -->
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <span class="navbar-text text-light fa fa-user-circle">
                            <%= user.getName() %> <!-- Print Username -->
                        </span>
                    </li>
                    <li class="nav-item">
                        <a class="btn btn-danger ml-3" href="logoutServlet">Logout</a> <!-- Logout Button -->
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- End Navigation Bar -->
    
<!--  profile model started-->


<!--  profile model end-->
</body>
</html>
