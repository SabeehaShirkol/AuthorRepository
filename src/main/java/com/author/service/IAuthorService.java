package com.author.service;

import java.util.List;
import java.util.Optional;

import com.author.model.Author;

public interface IAuthorService {
	
	public Integer saveAuthor(Author author);
	
	public List<Author> getAllAuthors();
	
	Optional<Author> getAuthor(Integer id);
	
	public Author updateAuthor(Author author, Integer id);
	
	public void deleteAuthor(Integer id);
	
	public void deleteAllAuthors();

}
