package com.nmscinemas.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String name;
	private int price;
	private String language;
	private String genre;
	private String description;
	private String show_timings;
	@Column(length = 1000)
	private byte[] image;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShow_timings() {
		return show_timings;
	}
	public void setShow_timings(String show_timings) {
		this.show_timings = show_timings;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Movies(String name, int price, String language, String genre, String description, String show_timings,
			byte[] image) {
		super();
		this.name = name;
		this.price = price;
		this.language = language;
		this.genre = genre;
		this.description = description;
		this.show_timings = show_timings;
		this.image = image;
	}
	
	public Movies() {}
	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", name=" + name + ", price=" + price + ", language=" + language + ", genre="
				+ genre + ", description=" + description + ", show_timings=" + show_timings + ", image="
				+ Arrays.toString(image) + "]";
	}
	
}
