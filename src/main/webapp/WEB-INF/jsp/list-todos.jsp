<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <title>Todo List</title>
</head>
<body>
<h1>Your Todos</h1>
<table>
    <caption>Your todos are</caption>
    <thead>
    <tr>
        <th>Description</th>
        <th>Target Date</th>
        <th>Is it Done?</th>
    </tr>
    </thead>
    <tbody>
    <%--  it is similler to --> for (Item todo : todos)  --%>
    <c:forEach items="${todos}" var="todo">
        <tr>
            <td>${todo.desc}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br/>
<a href="/add-todo">Add new Todo</a>
</body>
</html>