<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Page</title>

<style>
	body {
		background-color: <%=session.getAttribute("backgroundColor")%>
	}
	div {
		background-color: <%=session.getAttribute("postColor")%>
		width: 400px;
		height: 250px;
		text-align: center;
	}
	p {
		color: <%=session.getAttribute ("fontColor")%>
	}
</style>

</head>

<body>

<center>

<div>
<b>"</b>Time is your most precious gift because you only have a set amount of it.<br> 
You can make more money, but you can't make more time. <br> 
When you give someone your time, <br>
you are giving them a portion of your life <br>
that you'll never get back. <br>Your time is your life. <br>
</div>

<div>
<b>"</b>Trusting God completely means having faith<br>
 that He knows what is best for your life. <br> 
You expect Him to keep His promises, <br>
help you with problems, <br>
and do the impossible when necessary.<b>"</b> <br> 
-- Rick W., <i>The Purpose Driven Life: What on Earth Am I Here for?</i>
</div>

<a href="SetPreferences.jsp">Set Preferences</a>

</center>
</body>

</html>