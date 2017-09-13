<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fortran Dashboard</title>
</head>
<body style="font-family: arial;">
	<h1>Fortran!</h1>
	<p>
		<a href="/m/38/0553/0733" style="color: blue">Set up</a> <b>|</b>
		<a href="/m/38/0483/0345" style="color: blue">Forms</a> <b>|</b>
		<a href="/m/38/0553/0342" style="color: blue">Cards</a> <b>|</b>
		<a href="/m/26/0553/0348" style="color: blue">Advanced</a> <b>|</b>
		<a href="/m/26/0483/2342" style="color: blue">Binary</a> <b>|</b>
		<a href="/" style="color: blue">Home</a>
	</p><br>
	<fieldset style="width: 800px; height: 200px; border: solid;">
		<p style="font-size: 50px"><c:out value="${lesson}"/></p>
	</fieldset>
</body>
</html>