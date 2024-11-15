package org.jsp.library.service;

import java.util.List;

import org.jsp.library.model.Library;

public interface ILibraryService {
	
	void addBook(Library library);
	List<Library> displayAllBooks();
	Library displayBookById(int id);
	void deleteBookById(int id);

}
