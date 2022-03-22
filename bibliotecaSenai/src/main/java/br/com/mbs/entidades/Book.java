package br.com.mbs.entidades;

public class Book {
	private  Integer id, numPage, yearBook;
//	private String title, author, synopsis;
	
	public Book(Integer id, Integer numPage, Integer yearBook) {
		super();
		this.id = id;
		this.numPage = numPage;
		this.yearBook = yearBook;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumPage() {
		return numPage;
	}

	public void setNumPage(Integer numPage) {
		this.numPage = numPage;
	}

	public Integer getYearBook() {
		return yearBook;
	}

	public void setYearBook(Integer yearBook) {
		this.yearBook = yearBook;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", numPage=" + numPage + ", yearBook=" + yearBook + "]";
	}

//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public String getSynopsis() {
//		return synopsis;
//	}
//
//	public void setSynopsis(String synopsis) {
//		this.synopsis = synopsis;
//	}
//	
//	
	
	
	
	
}
