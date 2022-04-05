package com.nmscinemas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nmscinemas.entities.Bookings;
import com.nmscinemas.services.BookingsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/myapi/bookings")
public class BookingsController {

	@Autowired
	private BookingsService bookingsService;
	
	@PostMapping("/add")
	public ResponseEntity<Bookings> addNewBooking(@RequestBody Bookings object)
	{
		System.out.println(object);
		Bookings result= bookingsService.addBooking(object);
		if(result==null)
			return new ResponseEntity<Bookings>(result,HttpStatus.INTERNAL_SERVER_ERROR);
		else
			return new ResponseEntity<Bookings>(result,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public List<Bookings> getBookingById(@PathVariable("id")int id)
	{
		return bookingsService.getAllBookings(id);
	}
}
