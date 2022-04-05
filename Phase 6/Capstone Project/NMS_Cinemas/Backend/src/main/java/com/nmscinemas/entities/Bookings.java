package com.nmscinemas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bookings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private int uid;
	private String movie_name;
	private int no_of_tickets;
	private String show_timings;
	private int bill_amount;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getNo_of_tickets() {
		return no_of_tickets;
	}
	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	public String getShow_timings() {
		return show_timings;
	}
	public void setShow_timings(String show_timings) {
		this.show_timings = show_timings;
	}
	public int getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(int bill_amount) {
		this.bill_amount = bill_amount;
	}
	public Bookings(int uid, String movie_name, int no_of_tickets, String show_timings, int bill_amount) {
		super();
		this.uid = uid;
		this.movie_name = movie_name;
		this.no_of_tickets = no_of_tickets;
		this.show_timings = show_timings;
		this.bill_amount = bill_amount;
	}
	public Bookings() {}
	@Override
	public String toString() {
		return "Bookings [bid=" + bid + ", uid=" + uid + ", movie_name=" + movie_name + ", no_of_tickets="
				+ no_of_tickets + ", show_timings=" + show_timings + ", bill_amount=" + bill_amount + "]";
	}
	
}
