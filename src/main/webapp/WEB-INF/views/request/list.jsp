<%--
  Created by IntelliJ IDEA.
  User: klarnuri
  Date: 2024-08-07
  Time: 오전 1:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>견적서 리스트</title>
</head>
<body>
<h2>Request Details</h2>

<table border="1">
    <c:if test="${not empty vo.id}">
        <tr>
            <th>ID</th>
            <td>${vo.id}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.writer}">
        <tr>
            <th>Writer</th>
            <td>${vo.writer}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.regDate}">
        <tr>
            <th>Registration Date</th>
            <td>${vo.regDate}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.sort}">
        <tr>
            <th>Sort</th>
            <td>${vo.sort}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.type}">
        <tr>
            <th>Type</th>
            <td>${vo.type}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.sub}">
        <tr>
            <th>Sub</th>
            <td>${vo.sub}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.file1}">
        <tr>
            <th>File 1</th>
            <td>${vo.file1}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.file2}">
        <tr>
            <th>File 2</th>
            <td>${vo.file2}</td>
        </tr>
    </c:if>
    <c:if test="${vo.cr != null}">
        <tr>
            <th>Commercial Use</th>
            <td>${vo.cr}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.amount}">
        <tr>
            <th>Amount</th>
            <td>${vo.amount}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.addService}">
        <tr>
            <th>Additional Service</th>
            <td>${vo.addService}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.delService}">
        <tr>
            <th>Delete Service</th>
            <td>${vo.delService}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.result}">
        <tr>
            <th>Result</th>
            <td>${vo.result}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.day}">
        <tr>
            <th>Day</th>
            <td>${vo.day}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.time}">
        <tr>
            <th>Time</th>
            <td>${vo.time}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.age}">
        <tr>
            <th>Age</th>
            <td>${vo.age}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.sex}">
        <tr>
            <th>Sex</th>
            <td>${vo.sex}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.fav}">
        <tr>
            <th>Favorite</th>
            <td>${vo.fav}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.place}">
        <tr>
            <th>Place</th>
            <td>${vo.place}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.date}">
        <tr>
            <th>Date</th>
            <td>${vo.date}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.region}">
        <tr>
            <th>Region</th>
            <td>${vo.region}</td>
        </tr>
    </c:if>
    <c:if test="${not empty vo.ref}">
        <tr>
            <th>Reference</th>
            <td>${vo.ref}</td>
        </tr>
    </c:if>
</table>
</body>
<script>
    <%--const id =--%>
    <%--${result}--%>
</script>
</html>
