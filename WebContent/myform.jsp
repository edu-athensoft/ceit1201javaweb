<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>My Form</title>
</head>
<body>
	<div>
		<h2>My Form</h2>
	</div>
	
	<div>
		<form action="formresult" method="get">
			UserName: <input type="text" name="username"/> <br/>
			Password: <input type="text" name="password"/> <br/>
			<input type="submit" value="Submit"/>
		</form>
	</div>
</body>
</html>