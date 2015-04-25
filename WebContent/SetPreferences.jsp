<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set Preferences</title>

<style>
	body {
		 background-color: "lightgreen";
	}
</style>
</head>

<body>

<center>

<h2><i>Choose your preferred theme:</i></h2> <br>

<form action="SetPreferences" method="POST">

Background color:
<select name="backgroundColor">
	<option value="black">Black</option>
	<option value="white">White</option>
	<option value="red">Red</option>
	<option value="yellow">Yellow</option>
	<option value="green">Green</option>
	<option value="blue">Blue</option>
</select>
<br> <br>

Font color:
<select name="fontColor">
	<option value="black">Black</option>
	<option value="white">White</option>
	<option value="red">Red</option>
	<option value="yellow">Yellow</option>
	<option value="green">Green</option>
	<option value="blue">Blue</option>
</select>
<br> <br>

Post color:
<select name="postColor">
	<option value="black">Black</option>
	<option value="white">White</option>
	<option value="red">Red</option>
	<option value="yellow">Yellow</option>
	<option value="green">Green</option>
	<option value="blue">Blue</option>
</select>
<br> <br>

<input type="submit" value="Submit"/>

</form>

</center>

</body>
</html>