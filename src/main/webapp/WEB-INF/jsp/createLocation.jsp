<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Web Project | Create Location</title>
</head>
<body>
<form action="saveLoc" method="post">
    ID: <input type="text" name="id"/>
    Code: <input type="text" name="code"/>
    Name: <input type="text" name="name"/>
    Type: Urban <input type="radio" name="type" value="URBAN"/>
    Rural <input type="radio" name="type" value="RURAL"/>
    <input type="submit" value="Save"/>
</form>
${msg}

<a href="displayLocations">View All</a>
</body>
</html>
