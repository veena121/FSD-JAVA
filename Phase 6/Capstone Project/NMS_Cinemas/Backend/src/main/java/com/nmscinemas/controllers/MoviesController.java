package com.nmscinemas.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nmscinemas.entities.Movies;
import com.nmscinemas.services.MoviesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/myapi/movies")
public class MoviesController {
	
	@Autowired
	private MoviesService moviesService;
	
	@GetMapping("/")
	public List<Movies> getMovies()
	{
		List<Movies> movies = moviesService.getAllMovies();
		return movies;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Movies> addNewMovie (@RequestBody Movies object)
	{
		Movies result= moviesService.addMovie(object);
		if(result==null)
			return new ResponseEntity<Movies>(result,HttpStatus.INTERNAL_SERVER_ERROR);
		else
			return new ResponseEntity<Movies>(result,HttpStatus.CREATED);
	}
	
	@PostMapping("/add/Image")
	public ResponseEntity<Movies> addImage(@RequestParam("imageFile") MultipartFile file) throws IOException
	{
		byte[] imageBytes = file.getBytes();
		System.out.println(file.getOriginalFilename());
		Movies result = moviesService.addImage(imageBytes, file.getOriginalFilename());
		if(result==null)
			return new ResponseEntity<Movies>(result,HttpStatus.INTERNAL_SERVER_ERROR);
		else
			return new ResponseEntity<Movies>(result,HttpStatus.CREATED);
	}
	
	
	@PostMapping("/update")
	public void updateMovie(@RequestBody Movies entity)
	{
		moviesService.updateMovie(entity);
	}
	
	@PostMapping("/delete")
	public void deleteMovie(@RequestBody int id)
	{
		moviesService.deleteMovie(id);
	}

}
