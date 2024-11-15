package org.jsp.library.dao;

import java.util.List;

import org.jsp.library.model.Library;

public interface ILibraryDao {
	
	Library insertBook(Library library);
	List<Library> selectAllBooks();
	Library selectBookById(int id);
	Library updateBookDetails(Library library);
	void deleteBookById(int id);

}
