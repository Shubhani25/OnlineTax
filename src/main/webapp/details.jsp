<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<h3>Details Submission Form</h3>
<form action="TaxProcessor">
<pre>
	Income	<input type="text" name="t1"/>
	Age   	<input type="text" name="t2"/>
	Assets	<select name="t3" size=3 multiple="multiple">
			<option>Gold</option>
			<option>Flat</option>
			<option>Car</option>
			<option>Plot</option>
			<option>Shares</option>			
			</select>
	
	<input type="submit" value="Find Tax"/>
</pre>
</form>
</body>
</html>