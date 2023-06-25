<%@ page import="java.util.List" %>
<%@ page import="com.ivs.entyti" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="<c:url value="/css/employees.css" />" rel="stylesheet"></link>
</head>
<body>
<br>
<h3>Employee List</h3> 
<hr>
<a href="employee">Add New</a>

<form:form action="employees" method="get" modelAttribute = "lists">
	<table id="employees" >
           <thead>
               <tr>
                   <th> ID</th>
                   <th> Name</th>
                   <th> Address</th>
                   <th> Department</th>
                   <th> Phone</th>
                   <th> Email</th>
               </tr>
           </thead>
           <tbody >
           		<c:forEach varStatus="status" var="employee" items="${lists}">
	               <tr >
	                   <td> ${employee.id} </td>
	                   <td> ${employee.name}</td>
	                   <td> ${employee.address} </td>
	                   <td> ${employee.department} </td>
	                   <td> ${employee.phone} </td>
	                   <td> ${employee.email} </td>
	               </tr>
	               
	               <%! List<Employee> employees = (List<Employee>) request.getAttribute("employees"); %> 
	               
	               <% 
		            
		            for (String employee : employees) {
			        %>
			        <li><%= name %></li>
			        <% } %>
	               
               </c:forEach>
           </tbody>
       </table>
</form:form>
</body>
</html>
