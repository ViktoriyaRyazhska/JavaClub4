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
    <title>All Book</title>
</head>
<body>

<h2>All Book</h2>


<table>

    <tr>
        <th><pre>  Id  </pre></th>
        <th><pre>  Title  </pre></th>
        <th><pre>  Edition  </pre></th>
        <th><pre>  Rating  </pre></th>
    </tr>

    <c:forEach var="books" items="${modelAllBooks}">

        <tr>
            <td><pre>  ${books.id}  </pre></td>
            <td><pre>  ${books.title}  </pre></td>
            <td><pre>  ${books.edition}  </pre></td>
            <td><pre>  ${books.rating}  </pre></td>
        </tr>

    </c:forEach>
</table>



</body>
</html>
