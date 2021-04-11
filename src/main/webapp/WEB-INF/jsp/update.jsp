<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New Degree</h3>

	<div id="updateDegree">
		<form:form action="/save_degree" method="post" modelAttribute="degree">
			<p>
				<label>Name</label>
				<form:input path="name" />
			</p>
			<p>
				<label>Capacity</label>
				<form:input path="capacity" />
			</p>
			<p>
				<label>Fees</label>
				<form:input path="fees" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
