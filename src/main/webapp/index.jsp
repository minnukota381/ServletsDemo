<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
    
    <!-- Google Font for clean typography -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
    
    <!-- Best CSS for a clean and modern look -->
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        h1 {
            color: #fff;
            font-size: 3em;
            font-weight: 600;
            background-color: #007bff;
            padding: 20px 40px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease;
        }
        h1:hover {
            transform: scale(1.05);
        }
    </style>
</head>
<body>

    <h1>Welcome, ${username}</h1>

</body>
</html>
