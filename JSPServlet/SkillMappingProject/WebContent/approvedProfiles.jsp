<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>profiles</title>
</head>
<body>
<form  method="post" action="SearchServlet">
<div align="center">

		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Employees</h2>
			</caption>
			<input type="search" id="mySearch" name="searchKey">
    <button>Search</button>
			<tr>
				<th>EmpID</th>
				<th>Contact No</th>
				<th>SupervisorName</th>
				<th>BusinessUnitName</th>
				
			</tr>
			<c:forEach var="profile" items="${profilelist1}">
				<tr>
					<td><c:out value="${profile.empId}" /></td>
					<td><c:out value="${profile.contactNo}" /></td>
					<td><c:out value="${profile.supervisorName}" /></td>
					<td><c:out value="${profile.businessUnitName}" /></td>
		
				</tr>
			</c:forEach>
		</table>
	</div>
	</form>
</body>
</html>