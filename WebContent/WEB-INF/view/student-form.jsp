<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">

	First Name: <form:input path="firstName" />
		<br>
		<br>
	Last Name: <form:input path="lastName" />

		<br>
		<br>
	Country:
		<form:select path="country">
		
		<!-- FETCH COUNTRY FROM PROPERTIES FILE  -->
		 <form:options items="${countryOptions}" />
		
		<!-- FETCH FROM STUDENT JAVA CLASS-->
			<%-- <form:options items="${student.countryOptions}" /> --%>
			
			<!-- HARD CODED -->
			<%-- <form:option value="Germany" label="Germany" />
			<form:option value="USA" label="USA" />
			<form:option value="Canada" label="Canada" /> --%>

		</form:select>
		<br>
		<br>
		<input type="submit" value="Submit">


	</form:form>
</body>

</html>