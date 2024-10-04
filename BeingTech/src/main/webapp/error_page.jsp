<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Occurred</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #e0f7fa; /* Light blue background */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .error-container {
            background-color: #ffffff;
            border-radius: 10px;
            padding: 40px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            text-align: center;
        }
        .error-code {
            font-size: 100px;
            color: #0077b6; /* Ocean blue color */
            margin: 0;
        }
        .error-message {
            font-size: 24px;
            color: #0077b6;
            margin: 20px 0;
        }
        .error-description {
            font-size: 18px;
            color: #004c8c;
            margin-bottom: 30px;
        }
        .error-details {
            font-size: 14px;
            color: #999;
            margin-top: 20px;
        }
        a {
            text-decoration: none;
            color: #0288d1;
            border: 2px solid #0288d1;
            padding: 10px 20px;
            border-radius: 8px;
            font-size: 16px;
            transition: background-color 0.3s, color 0.3s;
        }
        a:hover {
            background-color: #0288d1;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <div class="error-code">Oops!</div>
        <div class="error-message">Something went wrong.</div>
        <div class="error-description">
            We're sorry for the inconvenience. Please try again later or contact support.
        </div>
        <a href="index.jsp">Go Back to Home</a>
        <div class="error-details">
            <% if (exception != null) { %>
                <p><b>Error Details:</b> <%= exception.getMessage() %></p>
            <% } %>
        </div>
    </div>
</body>
</html>
    