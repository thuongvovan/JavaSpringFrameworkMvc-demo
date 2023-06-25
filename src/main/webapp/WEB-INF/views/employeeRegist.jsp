<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Employee Register Form</h1>
<form:form action="addEmployee" method="post" modelAttribute = "employee">
			<table style="with: 50%">
                <tr>
					<td>Id</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Department</td>
					<td><input type="text" name="department" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form:form>
</body>
</html>
