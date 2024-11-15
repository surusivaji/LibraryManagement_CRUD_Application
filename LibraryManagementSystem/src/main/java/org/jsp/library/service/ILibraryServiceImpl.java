package org.jsp.library.service;

import java.util.List;

import org.jsp.library.dao.ILibraryDao;
import org.jsp.library.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class ILibraryServiceImpl implements ILibraryService {
	
	@Autowired
	private ILibraryDao dao;

	@Override
	public void addBook(Library library) {
		dao.insertBook(library);
	}

	@Override
	public List<Library> displayAllBooks() {
		return dao.selectAllBooks();
	}

	@Override
	public Library displayBookById(int id) {
		return dao.selectBookById(id);
	}

	@Override
	public void deleteBookById(int id) {
		dao.deleteBookById(id);
	}

}
