<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New Student</h3>

	<div id="addStudent">
		<form:form action="/save_Student" method="post" modelAttribute="student">
			<p>
				<label>Name</label>
				<form:input path="name" />
			</p>
			<p>
				<label>Student Number</label>
				<form:input path="studentNo" />
			</p>
			<p>
				<label>Enroll Year</label>
				<form:input path="enrollYear" />
			</p>
			<p>
				<label>DOB</label>
				<form:input path="dob" type="date" />
			</p>
			<p>
				<label>Degree</label> 
				<form:select path="degree">
					<c:forEach items="${getAllDegree}" var="degree">
						<form:option value="${degree.name}">${degree.name}</form:option>
					</c:forEach>
				</form:select>
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
