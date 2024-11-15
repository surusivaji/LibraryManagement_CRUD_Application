package org.jsp.library.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@NamedQuery(name="Library.findAll", query="SELECT l FROM Library l")
public class Library  {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_Id")
	private Integer bookId;
	@Column(name="Book_Author", nullable = false, length = 50)
	private String bookAuthor;
	@Column(name="Book_Name", nullable = false, length = 50)
	private String bookName;
	@Column(name="No_Of_Books", nullable = false)
	private Integer noOfBooks;
	@Column(name="Publish_Date", nullable = false)
	private Date publishdate;
	
	public Library() {
		
	}

	public Library(Integer bookId, String bookAuthor, String bookName, Integer noOfBooks, Date publishdate) {
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.bookName = bookName;
		this.noOfBooks = noOfBooks;
		this.publishdate = publishdate;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(Integer noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	public Date getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}

	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookAuthor=" + bookAuthor + ", bookName=" + bookName + ", noOfBooks="
				+ noOfBooks + ", publishdate=" + publishdate + "]";
	}

}