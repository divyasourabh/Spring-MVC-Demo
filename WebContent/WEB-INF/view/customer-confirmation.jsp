<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Customer Confirmation</title>
</head>

<body>
	The Customer is Confirmed: ${customer.firstName} ${customer.lastName}
	<br>
	<br> Free Passes ${customer.freePasses}
	<br>
	<br> Postal Code ${customer.postalCode}
	<br>
	<br> Course Code ${customer.courseCode}

</body>

</html>