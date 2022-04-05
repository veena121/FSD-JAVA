package com.nmscinemas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmscinemas.entities.Movies;
import com.nmscinemas.repo.MoviesRepository;

@Service
public class MoviesService {

	@Autowired
	private MoviesRepository moviesRepository;
	
	public List<Movies> getAllMovies()
	{
		return moviesRepository.findAll();
	}
	
	public Movies addMovie(Movies movie)
	{
		return moviesRepository.save(movie);
	}
	
	public Movies addImage(byte[] image, String movieName)
	{
		Movies movie = new Movies();
		List<Movies> allMovies = moviesRepository.findAll();
		for(Movies m:allMovies)
		{
			if(m.getName().equals(movieName))
			{
				movie=m;
				break;
			}
		}
		movie.setImage(image);
		return moviesRepository.save(movie);
	}
	
	public void deleteMovie(int id)
	{
		moviesRepository.deleteById(id);
	}
	
	public Boolean updateMovie(Movies newMovie)
	{
		int id = newMovie.getMid();
		Movies oldMovie = moviesRepository.getById(id);
		if(oldMovie.getMid()==0)
		{
			return false;
		}
		else
		{
			oldMovie = newMovie;
			moviesRepository.save(oldMovie);
			return true;
		}
	}
}
