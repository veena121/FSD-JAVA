package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.entity.Feedback;
import com.feedback.repositry.FeedbackRepo;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackRepo fr;
	
	@PostMapping("/feedback")
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback)
	{
		int x = fr.saveFeedback(feedback);
		if(x>0)
		{
			return new ResponseEntity<Feedback>(feedback,HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getfeedback")
	public List<Feedback> getFeedback()
	{
		List<Feedback> feedbacks = fr.fetchFeedback();
		return feedbacks;
	}
}
