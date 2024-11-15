package org.jsp.library.controllers;

import java.sql.Date;
import java.util.List;

import org.jsp.library.model.Library;
import org.jsp.library.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{	
	
	@Autowired
	private ILibraryService service;
	
	@RequestMapping("/")
	public String display()
	{
		return "redirect:/displaybooks";
	}
	
	@RequestMapping("/addbook")
	public String addBook()
	{
		return "addbook";
	}
	
	@RequestMapping(value="/savebook", method=RequestMethod.POST)
	public String saveBook(Library library, @RequestParam("publishDate") String date)
	{
		library.setPublishdate(Date.valueOf(date));
		service.addBook(library);
		return "redirect:/displaybooks";
	}
	
	@RequestMapping("/displaybooks")
	public String displayBooks(Model model)
	{
		List<Library> books = service.displayAllBooks();
		model.addAttribute("books",books);
		return "displaybooks";
	}
	
	@RequestMapping("/updatebook/{bookId}")
	public String updateBook(Model model, @PathVariable("bookId") int bookId)
	{
		Library library = service.displayBookById(bookId);
		model.addAttribute("book", library);
		return "updatebook";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updation(@ModelAttribute("library") Library library)
	{
		service.addBook(library);
		return "redirect:/displaybooks";
	}
	
	@RequestMapping("/delete/{bookId}")
	public String deleteBook(@PathVariable("bookId") int bookId)
	{
		service.deleteBookById(bookId);
		return "redirect:/displaybooks";
	}
}
