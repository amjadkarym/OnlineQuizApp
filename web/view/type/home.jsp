<%--
  Created by IntelliJ IDEA.
  User: 986758
  Date: 11/14/2018
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../includes/header.jsp" %>
<select name="type">
    <option selected="selected">Select</option>
    <c:forEach var="type" items="${types}">
        <option value="${type.id}">${type.name}</option>
    </c:forEach>
</select>
<%@include file="../includes/footer.jsp" %>
