<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - BeingTech</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body {
            background-color: #f2f2f2; /* Light grey background */
            color: #1a1b1e; /* Dark text for readability */
        }
        .login-container {
            max-width: 400px;
            margin: 50px auto;
            padding: 30px;
            background-color: #ffffff; /* White background for form */
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            position: relative; /* For wave effect */
            z-index: 1; /* Position above wave */
        }
        .btn-primary {
            background-color: #006fda; /* Blue button color */
            border-color: #006fda;
        }
        .btn-primary:hover {
            background-color: #005bb5; /* Darker blue on hover */
            border-color: #005bb5;
        }
        .radio-label {
            margin-left: 5px;
        }
        .footer {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
            color: #777; /* Light grey footer text */
        }
        /* Wave Background */
        .wave {
            position: relative;
            bottom: -10px; /* Position just below the footer */
            left: 0;
            width: 100%;
            height: 100px;
            background: #d9940c; /* Wave color */
            clip-path: polygon(0 100%, 50% 0%, 100% 100%);
            z-index: 0; /* Position below form */
        }
        .header-title {
            text-align: center;
            margin-bottom: 30px;
            font-size: 24px;
            font-weight: bold;
            color: #006fda; /* Title color */
        }
        .icon {
            font-size: 20px;
            margin-right: 10px; /* Space between icon and text */
            color: #006fda; /* Icon color */
        }
    </style>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="login-container">
    <h1 class="header-title">BeingTech</h1> <!-- Website Name -->
    <h3 class="text-center">Login</h3>
    <form>
        <div class="mb-3">
            <label for="email" class="form-label">
                <i class="fa fa-envelope icon"></i>Email address
            </label>
            <input type="email" class="form-control" id="email" placeholder="Enter your email" required>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">
                <i class="fa fa-lock icon"></i>Password
            </label>
            <input type="password" class="form-control" id="password" placeholder="Enter your password" required>
        </div>
        <div class="mb-3 form-check">
            <input type="radio" class="form-check-input" id="checkMeOut" name="checkMeOut" value="yes">
            <label class="form-check-label radio-label" for="checkMeOut">Check me out</label>
        </div>
        <button type="submit" class="btn btn-primary btn-lg btn-block">Login</button>
    </form>
    <div class="footer">
        <p>&copy; 2024 BeingTech. All rights reserved.</p>
    </div>
</div>

<!-- Clippy Effect Below Footer -->
<div class="wave"></div> <!-- Wave effect -->

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"></script>
</body>
</html>
