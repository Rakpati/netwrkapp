<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Students</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: red;">Show All Students</h3>
	
		<table border="1">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Student No</td>
				<td>Enroll Year</td>
				<td>DOB</td>
				<td>Degree</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="student" items="${getAllStudent}">
 
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.studentNo}</td>
				<td>${student.enrollYear}</td>
				<td>${student.dob}</td>
				<td>${student.degree}</td>
						
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
</body>
</html>