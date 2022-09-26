<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Library</title>
</head>
<body>
<h1><%= "Start page" %></h1>
<hr />
<h2><%= "List of users:"%></h2>
<c:forEach var="user" items="${requestScope.users}">
    <ul>
        <li>Имя: <c:out value="${user.name}"/></li>
        <li>Фамилия: <c:out value="${user.surname}"/></li>
        <li>Возраст: <c:out value="${user.age}"/></li>
    </ul>
    <hr />

</c:forEach>

<h2><%= "Create new user:"%></h2>

<form method="post" action="">

    <label><input type="text" name="name"></label>Имя<br>

    <label><input type="text" name="surname"></label>Фамилия<br>

    <label><input type="number" name="age"></label>Возраст<br>

    <input type="submit" value="Ok" name="Ok"><br>
</form>

</body>
</html>