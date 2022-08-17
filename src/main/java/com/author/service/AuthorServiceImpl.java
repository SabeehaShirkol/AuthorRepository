package com.author.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
