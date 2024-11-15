<%@page import="org.jsp.library.model.Library"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>display all books</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/displaybooks.css"/>"/>
	</head>
	<body>
		<%
			List<Library> books = (List<Library>) request.getAttribute("books");
		%>
		<h1>LIBRARY MANAGEMENT SYSTEM</h1>
		<a href="./addbook"><input type="button" value="ADD BOOK" id="add"></a>
		<table border="2">
			<thead>
				<tr>
					<th>Book Name</th>
					<th>Book Author</th>
					<th>No of Books</th>
					<th>Publish Date</th>
					<th colspan="2">Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (Library library : books)
					{%>
						<tr>
							<td><%= library.getBookName() %></td>
							<td><%= library.getBookAuthor() %></td>
							<td><%= library.getNoOfBooks() %></td>
							<td id="date"><%= library.getPublishdate() %></td>
							<td><a href="./updatebook/<%= library.getBookId()%>"><input type="button" value="update" id="update"/></a>
							<td><a href="./delete/<%= library.getBookId() %>"><input type="button" value="delete" id="delete"/></a>
						</tr>
					<%}
				%>
			</tbody>
		</table>
	</body>
</html>