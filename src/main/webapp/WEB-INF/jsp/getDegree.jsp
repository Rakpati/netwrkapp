<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Degrees</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: red;">Show All Degree</h3>
	
		<table border="1">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Capacity</td>
				<td>Fees</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="degree" items="${getAllDegree}">
 
			<tr>
				<td>${degree.id}</td>
				<td>${degree.name}</td>
				<td>${degree.capacity}</td>
				<td>${degree.fees}</td>
				<td><a href="/delete/+ ${degree.id}">Delete</a></td>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
</body>
</html>