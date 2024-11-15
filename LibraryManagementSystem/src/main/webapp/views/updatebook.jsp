<%@page import="org.jsp.library.model.Library"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>update book</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/updatebook.css"/>"/>
	</head>
	<body>
		<%
			Library library = (Library)request.getAttribute("book");
		%>
		<a href="/LibraryManagementSystem/displaybooks"><input type="button" value="BACK" id="back"></a>
		<div class="container">
			<h1>UPDATE BOOK</h1>
			<form action="/LibraryManagementSystem/update" method="post">
				<div class="input-control">
					<label for="bookName">Enter Book Name</label>
					<input type="text" name="bookId" id="bookId" value="<%= library.getBookId()%>" hidden="true">
					<input type="text" name="bookName" id="bookName" value="<%= library.getBookName()%>">
				</div>
				<div class="input-control">
					<label for="author">Enter Author Name</label>
					<input type="text" name="bookAuthor" id="author" value="<%= library.getBookAuthor()%>">
				</div>
				<div class="input-control">
					<label for="noOfBooks">Enter No Of Books</label>
					<input type="text" name="noOfBooks" id="noOfBooks" value="<%= library.getNoOfBooks()%>">
				</div>
				<div class="input-control">
					<label for="publishdate">Publish Date</label>
					<input type="date" name="publishdate" id="publishdate" value="<%= library.getPublishdate() %>">
				</div>
				<div class="button-control">
					<input type="submit" value="UPDATE BOOK" id="btn">
				</div>
			</form>
		</div>
	</body>
</html>