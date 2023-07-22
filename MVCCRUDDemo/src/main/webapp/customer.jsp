<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD - JSP DEMO - DASHBOARD</title>
<script type="text/javascript">
function readAll() 
{
	        document.forms[0].action = "MVCReadAll";
	        document.forms[0].submit();
}
function createNew() 
{
	 		document.forms[0].action = "MVCInsert";
	        document.forms[0].submit();
}
function searchUser() 
{
	        document.forms[0].action = "MVCSearch";
	        document.forms[0].submit();
}
function updateUser() 
{
	        document.forms[0].action = "MVCUpdate";
	        document.forms[0].submit();
}
function deleteUser() 
{
	        document.forms[0].action = "MVCDelete";
	        document.forms[0].submit();
}

</script>



</head>
<body>
	<%@ page import = "MVCModel.*" %>

	<H3>To Edit or Create or Delete Customers</H3>
<br/>
	
<form method ="get">
	USERNAME: <input type= "text" name = "dun" size = 20 />
	<br/><br/>
	PASSWORD: <input type= "password" name = "dpw" size = 20 />
	<br/><br/>
	<input type="button" value = "READ ALL" size = 10  onclick= "return readAll()"/>
	<input type="button" value = "CREATE" size = 10 onclick= "return createNew()" />
	<input type="button" value = "SEARCH" size = 10  onclick="return searchUser()"/>
	<input type="button" value = "UPDATE" size = 10 onclick="return updateUser()"/>
	<input type="button" value = "DELETE" size = 10  onclick="return deleteUser()"/>
	<input type="reset" value = "CLEAR TEXTBOX VALUES" size = 15 />
	<br/>
	
	</form>
	
</body>
</html>