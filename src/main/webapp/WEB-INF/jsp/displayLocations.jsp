<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Web Project | All Locations</title>
</head>
<body>
<h2>Locations:</h2>
<%--<table>--%>
<%--    <tr>--%>
<%--        <th>ID</th>--%>
<%--        <th>CODE</th>--%>
<%--        <th>NAME</th>--%>
<%--        <th>TYPE</th>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${locations}" var="location">--%>
<%--        <tr>--%>
<%--            <td>${location.id}</td>--%>
<%--            <td>${location.code}</td>--%>
<%--            <td>${location.name}</td>--%>
<%--            <td>${location.type}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>

<%--</table>--%>
${locations}
</body>
</html>