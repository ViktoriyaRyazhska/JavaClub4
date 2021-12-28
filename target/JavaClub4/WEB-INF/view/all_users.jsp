<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 38096
  Date: 10.12.2021
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Users</title>
</head>
<body>

<h2>All Users</h2>


<table>

    <tr>
        <th><pre> Id  </pre></th>
        <th><pre> Name  </pre></th>
        <th><pre> Surname  </pre></th>
        <th><pre> Role   </pre></th>
        <th><pre> Age  </pre></th>

    </tr>

    <c:forEach var="users" items="${modelAllUsers}">

    <tr>
        <td><pre>  ${users.id}  </pre></td>
        <td><pre>  ${users.name}  </pre></td>
        <td><pre>  ${users.surname}  </pre></td>
        <td><pre>  ${users.role.name}  </pre></td>
        <td><pre>  ${users.age}  </pre></td>
    </tr>

    </c:forEach>
</table>



</body>
</html>
