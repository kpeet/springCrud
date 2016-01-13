<%@ include file="/WEB-INF/views/include.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello :: Spring Application</title>
</head>
 <body>
    <h1><fmt:message key="heading"/></h1>
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