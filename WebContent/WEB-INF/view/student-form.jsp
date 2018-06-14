<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
	
		<form:form action="processForm" modelAttribute="student">
			First name: <form:input path="firstName"/>
			<br>
			Last name: <form:input path="lastName"/>
			
			<br><br>
			
			Country:
			<form:select path="country">			
				<form:options items="${countryOptions}"/>
			</form:select>
			
			<br><br>
			
			Favorite programming language:
			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			C++ <form:radiobutton path="favoriteLanguage" value="CPP"/>
			
			<br><br>
			Operating systems:
			Windows <form:checkbox path="operatingSystems" value="Windows"/>
			Linux <form:checkbox path="operatingSystems" value="Linux"/>
			
			<br><br>
			
			<input type="submit" value="Submit"/>
		</form:form>
		
	</body>
</html>