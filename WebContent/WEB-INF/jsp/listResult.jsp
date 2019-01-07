<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>listResult</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>benchnumber</td>
        <td>date</td>
         <td>ca</td>
               <td>cu</td>
               <td>fe</td>
               <td>mg</td>
               <td>zn</td>
               <td>mn</td>
               <td>f</td>
    </tr>
    <c:forEach items="${rs}" var="r" varStatus="vs">
        <tr>
            <td>${r.id}</td>
            <td>${r.benchnumber}</td>
               <td>${r.date}</td>
               <td>${r.ca}</td>
               <td>${r.cu}</td>
               <td>${r.fe}</td>
               <td>${r.mg}</td>
               <td>${r.zn}</td>
               <td>${r.mn}</td>
               <td>${r.f}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>