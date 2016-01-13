<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello :: Spring Application</title>
 <style>
    .error { color: red; }
  </style>  
</head>
 <body>
    <h1><fmt:message key="heading"/></h1>
        <h1>Ingresar una nueva locación</h1>
<form:form method="post" commandName="priceIncrease">
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="20%">Increase (%):</td>
        <td width="20%">
          <form:input path="percentage"/>
        </td>
        <td width="60%">
          <form:errors path="percentage" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
  <input type="submit" align="center" value="Execute">
</form:form>
    
    <h3>Products</h3>
    <a href="<c:url value="priceincrease.htm"/>">Increase Prices</a> 
    //////////////////////////////////////////////////////
    <c:out value="${model.results.toString()}"/>
    ////////////////////////////////////////////////////////
    <c:forEach items="${model.location}" var="loc">
      <c:out value="${loc.address}"/>
<%--        <i>$<c:out value="${loc.route}"/></i><br><br> --%>
    </c:forEach>
     <br>
    
    <br>
  </body>
</html>