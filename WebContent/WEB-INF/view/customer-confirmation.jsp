<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
	<head>
		<title>Customer confirmation</title>
	</head>
	
	<body>
		The customer is confirmed: ${customer.firstName} ${customer.lastName}
		<br>
		Postal code: ${customer.postalCode}
		<br>
		Free passes: ${customer.freePasses}
	</body>
</html>