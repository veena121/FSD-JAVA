package com.nmscinemas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmscinemas.entities.Bookings;
import com.nmscinemas.repo.BookingsRepository;

@Service
public class BookingsService {

	@Autowired
	private BookingsRepository bookingsRepository;
	
	public Bookings addBooking(Bookings booking) {
		return bookingsRepository.save(booking);
	}
	
	@SuppressWarnings("null")
	public List<Bookings> getAllBookings(int uid)
	{
		List<Bookings> allBookings = bookingsRepository.findAll();
		List<Bookings> bookingById = null;
		for(Bookings booking:allBookings)
		{
			if(booking.getUid()==uid)
			{
				bookingById.add(booking);
			}
		}
		return bookingById;
	}
	
}
