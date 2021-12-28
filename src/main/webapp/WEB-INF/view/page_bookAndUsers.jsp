<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kolak
  Date: 13.12.2021
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books and Users</title>
</head>
<body>
<h2>Books and Users</h2>

<table>

    <tr>
        <th><pre> Id </pre></th>
        <th><pre> User ID </pre></th>
        <th><pre> User Name   </pre></th>
        <th><pre> User Surname  </pre></th>
        <th><pre> User Age  </pre></th>
        <th><pre> User Role  </pre></th>
        <th><pre> Book ID  </pre></th>
        <th><pre> Book Title  </pre></th>
        <th><pre> Book Rating  </pre></th>
        <th><pre> Book Edition  </pre></th>
    </tr>

    <c:forEach var="booksLoans" items="${bookAndUsers}">

        <tr>
            <td><pre>  ${booksLoans.id}  </pre></td>
            <td><pre>  ${booksLoans.user.id}  </pre></td>
            <td><pre>  ${booksLoans.user.name}  </pre></td>
            <td><pre>  ${booksLoans.user.surname}  </pre></td>
            <td><pre>  ${booksLoans.user.age}  </pre></td>
            <td><pre>  ${booksLoans.user.role.name}  </pre></td>


            <td><pre>  ${booksLoans.book.id}  </pre></td>
            <td><pre>  ${booksLoans.book.title}  </pre></td>
            <td><pre>  ${booksLoans.book.rating}  </pre></td>
            <td><pre>  ${booksLoans.book.edition}  </pre></td>


        </tr>

    </c:forEach>
</table>


</body>
</html>
