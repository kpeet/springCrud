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
  
       
    <h3>Products</h3>
    <a href="<c:url value="locationinsert.htm"/>">Increase Prices</a> 
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