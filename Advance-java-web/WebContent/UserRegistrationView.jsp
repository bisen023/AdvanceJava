<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration View</title>
</head>
<body>
	<form action="Welcome.jsp" method="post">
		<table>

			<tr>
				<th>First Name:</th>
				<td><input type="text" name=firstName></td>
			</tr>


			<tr>
				<th>Last Name:</th>
				<td><input type="text" name=lastName> ></td>
			</tr>


			<tr>
				<th>LoginID</th>
				<td><input type="text" name=loginId> ></td>
			</tr>



			<tr>
				<th>Password</th>
				<td><input type="password" name=password></td>
			</tr>


			<tr>
				<th>DoB</th>
				<td><input type="date" name=dob></td>
			</tr>


			<tr>
				<th>Address</th>
				<td><input type="text" name=address></td>
			</tr>




			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>
			
			
			
		<tr>
		
		<th></th>
		<td><input type="button"></td>
		</tr>
			
			
			
			
		</table>

	</form>



</body>
</html>