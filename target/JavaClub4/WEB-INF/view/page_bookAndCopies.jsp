<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kolak
  Date: 13.12.2021
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books and copies</title>
</head>
<body>
<h2>Books and copies</h2>
<table>

    <tr>
        <th><pre> Book ID  </pre></th>
        <th><pre> Book Title  </pre></th>
        <th><pre> Book Rating  </pre></th>
        <th><pre> Book Edition  </pre></th>
        <th><pre> Book Copy ID  </pre></th>
        <th><pre> Is available  </pre></th>
    </tr>

    <c:forEach var="booksCopies" items="${bookAndCopies}">

        <tr>

            <td><pre>  ${booksCopies.book.id}  </pre></td>
            <td><pre>  ${booksCopies.book.title}  </pre></td>
            <td><pre>  ${booksCopies.book.rating}  </pre></td>
            <td><pre>  ${booksCopies.book.edition}  </pre></td>

            <td><pre>  ${booksCopies.id}  </pre></td>
            <td><pre>  ${booksCopies.is_available}  </pre></td>



        </tr>

    </c:forEach>
</table>

</body>
</html>
