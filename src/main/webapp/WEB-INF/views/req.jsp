<%--
  Created by IntelliJ IDEA.
  User: goott
  Date: 2024-08-05
  Time: 오후 3:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>고객 form 보내기 테스트</title>
</head>
<body>
<h1>고객 FORM 보내기 테스트</h1>
<form name="formSend" method="post" action="/soomgo/req">
    <div>
        <input type="checkbox" id="monday" name="date" value="monday"/>
        <label for="monday">월요일</label>
    </div>

    <div>
        <input type="checkbox" id="tuesday" name="date" value="tuesday"/>
        <label for="tuesday">화요일</label>
    </div>

    <div>
        <input type="checkbox" id="wednesday" name="date" value="wednesday"/>
        <label for="wednesday">수요일</label>
    </div>
</form>
</body>
</html>
