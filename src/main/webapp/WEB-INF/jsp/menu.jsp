<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="${pageContext.request.contextPath}/welcome">Home</a> | &nbsp;

	<a href="${pageContext.request.contextPath}/addDegree">Add Degree</a> |   
	<a href="${pageContext.request.contextPath}/getDegree">Show Degree</a> |   
	<a href="${pageContext.request.contextPath}/addStudents">Add Student</a> |   
    <a href="${pageContext.request.contextPath}/getStudents">Show Students</a> |   
    <h2 style="color: red;">
       	<a onclick="document.forms['logoutForm'].submit()">Logout</a>
    </h2>
    <form id="logoutForm" method="POST" action="${contextPath}/logout">
    </form>

</div>