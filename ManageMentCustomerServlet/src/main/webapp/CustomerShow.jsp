
<%--
  Created by IntelliJ IDEA.
  User: DUONG TIEU
  Date: 2/9/2023
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
   <h1 align="center">Danh sach khach hang</h1>
   <div>
       <br>
       <ul class="list-group">
           <li class="list-group-item active">
               <p>Full Name</p>
               <p>Birth day</p>
               <p>Address</p>
               <p>picture</p>
           </li>
         <c:forEach items="$(customers)" var="customer">
             <li class="main">
                 <p><c:out value="${customer.getName()}"></c:out></p>
                 <p><c:out value="${customer.getBirthday()}"></c:out></p>
                 <p><c:out value="${customer.getAddress()}"></c:out></p>
                 <p class="image">
                     <img src="<c:out value="${customer.getPicture()}"></c:out> ">
                 </p>
             </li>
         </c:forEach>
       </ul>
   </div>
</body>
</html>
