package com.author.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.exception.RecordNotFoundException;
import com.author.model.Author;

@Service
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	IAuthorRepository authorRepository;
	
	@Override
	public Integer saveAuthor(Author author) {
		Author savedAuthor = authorRepository.save(author);
		return savedAuthor.getId();
	}

	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	@Override
	public Optional<Author> getAuthor(Integer id) {
		return authorRepository.findById(id);
	}

	@Override
	public Author updateAuthor(Author author, Integer id) {
		//we will check whether the employee exists with the given id or not
		Author existingAuthor = authorRepository.findById(id).orElseThrow(
				()-> new RecordNotFoundException("Author", "id", id));
		existingAuthor.setLogo(author.getLogo());
		existingAuthor.setPrice(author.getPrice());
		existingAuthor.setActive(author.getActive());
	
		//we will update the value and then save the updated value
		authorRepository.save(existingAuthor);
		return existingAuthor;

	}

	@Override
	public void deleteAuthor(Integer id) {
		authorRepository.deleteById(id);
		
	}

	@Override
	public void deleteAllAuthors() {
		 authorRepository.deleteAll();
	}

}
