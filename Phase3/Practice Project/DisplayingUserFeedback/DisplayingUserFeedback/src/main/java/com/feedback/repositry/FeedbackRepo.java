package com.feedback.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.feedback.entity.Feedback;

@Repository
public class FeedbackRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int saveFeedback(Feedback feedback)
	{
		return jdbcTemplate.update("Insert into feedback (id,uname,rating,message) values (?,?,?,?)", 
				new Object[] {feedback.getId(), feedback.getUname(), feedback.getRating(), feedback.getMessage()});
	}
	
	public List<Feedback> fetchFeedback()
	{
		return jdbcTemplate.query("select * from feedback", 
				new RowMapper<Feedback>() {

					public Feedback mapRow(ResultSet rs, int rowNum) throws SQLException {
						Feedback fd = new Feedback();
						fd.setId(rs.getInt(1));
						fd.setUname(rs.getString(2));
						fd.setRating(rs.getInt(3));
						fd.setMessage(rs.getString(4));
						return fd;
					}
		});
	}
}