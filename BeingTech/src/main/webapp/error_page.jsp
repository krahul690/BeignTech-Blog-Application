<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin-top: 50px;
        }
        .error-container {
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
            display: inline-block;
        }
        .error-code {
            font-size: 60px;
            color: #e74c3c;
        }
        .error-message {
            font-size: 24px;
            margin-bottom: 20px;
        }
        .error-details {
            font-size: 14px;
            color: #999;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <div class="error-code"> </div>
        <div class="error-message">Oops! Something went wrong.</div>
        <div class="error-details">
            <% 
                if (exception != null) {
                    out.println("Exception: " + exception.getMessage());
                }
            %>
        </div>
        <div class="error-details">
            <p>If you need help, please contact support.</p>
        </div>
    </div>
</body>
</html>
