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

    <c:forEach var="authors" items="${modelAllAuthors}">

        <tr>
            <td><pre>  ${authors.id}  </pre></td>
            <td><pre>  ${authors.name}  </pre></td>
            <td><pre>  ${authors.surname}  </pre></td>
            <td><pre>  ${authors.nationality.nationality}  </pre></td>
        </tr>

    </c:forEach>
</table>



</body>
</html>
