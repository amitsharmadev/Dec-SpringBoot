<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Form</h1>
<form:form action="/product" method="post" modelAttribute="product" >
	<table>
		<tr>
			<td>Product Code</td>
			<td><form:input path="productCode" /></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><form:input  path="productName" /></td>
		</tr>
		<tr>
			<td>Product Category</td>
			<td><form:input path="category" /></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><form:input path="price" /></td>
		</tr>
			<tr>
			<td></td>
			<td><form:button >Submit</form:button></td>
		</tr>
	
	</table>
</form:form>
</body>
</html>