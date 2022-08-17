package com.author.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String image;
	private String title;
	private String category;
	private Integer price;
	private String authorName;
	private String publisherName;
	private Date publishedDate;
	private Integer chapters;
	private String active;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public Integer getChapters() {
		return chapters;
	}
	public void setChapters(Integer chapters) {
		this.chapters = chapters;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public Author(Integer id, String image, String title, String category, Integer price, String authorName,
			String publisherName, Date publishedDate, Integer chapters, String active) {
		super();
		this.id = id;
		this.image = image;
		this.title = title;
		this.category = category;
		this.price = price;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.publishedDate = publishedDate;
		this.chapters = chapters;
		this.active = active;
	}
	
	public Author() {
		super();
	}
	
}
