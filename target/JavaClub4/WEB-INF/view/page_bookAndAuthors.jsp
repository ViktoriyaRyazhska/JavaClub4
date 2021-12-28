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
  <title>Books and Authors</title>
</head>
<body>

<h2>Books and Authors</h2>


<table>

  <tr>
    <th><pre> Id </pre></th>
    <th><pre> Author ID </pre></th>
    <th><pre> Author Name   </pre></th>
    <th><pre> Author Surname  </pre></th>
    <th><pre> Author Age  </pre></th>
    <th><pre> Is Co Author  </pre></th>
    <th><pre> Nationality  </pre></th>
    <th><pre> Book ID  </pre></th>
    <th><pre> Book Title  </pre></th>
    <th><pre> Book Rating  </pre></th>
    <th><pre> Book Edition  </pre></th>
  </tr>

  <c:forEach var="booksAuthors" items="${bookAndAuthors}">

    <tr>
      <td><pre>  ${booksAuthors.id}  </pre></td>
      <td><pre>  ${booksAuthors.author.id}  </pre></td>
      <td><pre>  ${booksAuthors.author.name}  </pre></td>
      <td><pre>  ${booksAuthors.author.surname}  </pre></td>
      <td><pre>  ${booksAuthors.author.age}  </pre></td>
      <td><pre>  ${booksAuthors.is_coauthor}  </pre></td>
      <td><pre>  ${booksAuthors.author.nationality.nationality}  </pre></td>

      <td><pre>  ${booksAuthors.book.id}  </pre></td>
      <td><pre>  ${booksAuthors.book.title}  </pre></td>
      <td><pre>  ${booksAuthors.book.rating}  </pre></td>
      <td><pre>  ${booksAuthors.book.edition}  </pre></td>


    </tr>

  </c:forEach>
</table>



</body>
</html>
