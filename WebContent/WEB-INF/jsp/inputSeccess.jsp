<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>提交成功</title>
</head>
<body>
提交成功
<table align='center' border='1' cellspacing='0'>
    <tr>
        
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
   <%
		String benchnumber = request.getParameter("benchnumber");
		out.print(benchnumber);
	%>
   
</body>
</html>