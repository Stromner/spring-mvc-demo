<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Customer Registration Form</title>
		
		<style>
			.error {color:red}
		</style>
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="customer">
			First name: <form:input path="firstName"/>
			<br>
			Last name (*): <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/> <!-- Display error message, if it have been set -->
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>