package org.jsp.library.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.library.model.Library;
import org.jsp.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class ILibraryDaoImpl implements ILibraryDao {
	
	@Autowired
	private LibraryRepository libraryRepository;

	@Override
	public Library insertBook(Library library) {
		return libraryRepository.save(library);
	}

	@Override
	public List<Library> selectAllBooks() {
		return libraryRepository.findAll();
	}

	@Override
	public Library selectBookById(int id) {
		Optional<Library> optional = libraryRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public Library updateBookDetails(Library library) {
		return libraryRepository.save(library);
	}

	@Override
	public void deleteBookById(int id) {
		libraryRepository.deleteById(id);
	}
	
	

}
