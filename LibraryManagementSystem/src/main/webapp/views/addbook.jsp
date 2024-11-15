<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Add Book</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/addbook.css"/>"> 
	</head>
	<body>
		<a href="./displaybooks"><input type="button" value="BACK" id="back"></a>
		<div class="container">
			<h1>ADD BOOK</h1>
			<form action="savebook" method="post">
				<div class="input-control">
					<label for="bookName">Enter Book Name</label>
					<input type="text" name="bookName" id="bookName">
				</div>
				<div class="input-control">
					<label for="author">Enter Author Name</label>
					<input type="text" name="bookAuthor" id="author">
				</div>
				<div class="input-control">
					<label for="noOfBooks">Enter No Of Books</label>
					<input type="text" name="noOfBooks" id="noOfBooks">
				</div>
				<div class="input-control">
					<label for="publishdate">Publish Date</label>
					<input type="date" name="publishDate" id="publishdate">
				</div>
				<div class="button-control">
					<input type="submit" value="ADD BOOK" id="btn">
				</div>
			</form>
		</div>
	</body>
</html>