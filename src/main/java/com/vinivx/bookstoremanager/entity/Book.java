package com.vinivx.bookstoremanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false)
	private Integer pages;
	
	@Column(nullable = false)
	// Capitulos
	private Integer chapters;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(name = "publisher_name", nullable = false, unique = true)
	// Nome do editor 
	private String publiSherName;
	
	/*fetchType.LAZY significa que para ele fazer a consulta de um do seus autores
	 * eles precisam fazer uma consulta fazendo um join para retornar esse dado para nós, uma 
	 * estrategia como lazy, ela tem mais performarce 
	 *  */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	private Author author;

	public Book(Long id, String name, Integer pages, Integer chapters, String isbn, String publiSherName,
			Author author) {
		this.id = id;
		this.name = name;
		this.pages = pages;
		this.chapters = chapters;
		this.isbn = isbn;
		this.publiSherName = publiSherName;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getChapters() {
		return chapters;
	}

	public void setChapters(Integer chapters) {
		this.chapters = chapters;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPubliSherName() {
		return publiSherName;
	}

	public void setPubliSherName(String publiSherName) {
		this.publiSherName = publiSherName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	


}
