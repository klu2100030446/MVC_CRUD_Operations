<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC READ ALL</title>
</head>
<body>

<br/>
<%@ page import="MVCModel.*,java.util.*" %>
	<table border="1">
		<tr>
			<th>UserName</th>
			<th>Password</th>
			
		</tr>
		<% 
		@SuppressWarnings("unchecked")
		List<MVCData> LD = (List<MVCData>)request.getAttribute("res2");
 
	    for(MVCData B : LD)
	    {%>
	        <tr>
	        	<td><%= B.getUsername() %></td>
	        	<td><%= B.getPassword() %></td>
	        	
	        </tr>
	    <%}%>
	</table>
	<a href="customer.jsp"> Click here to Go Back </a>
</body>
</html>