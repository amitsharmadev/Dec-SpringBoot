<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Data Submitted</h2>

	<ul>
		<li>${product.productCode }</li>
		<li>${product.productName }</li>
		<li>${product.category }</li>
		<li>${product.price }</li>

	</ul>
</body>
</html>