<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 导入jstl标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>This is Spring MVC demo page</h2>
<c:forEach items="${users}" var="user">
    <c:out value="${user.username}" /><br/>
    <c:out value="${user.age}" /><br/>
</c:forEach>