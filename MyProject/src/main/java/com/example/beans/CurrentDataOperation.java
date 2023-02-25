package com.example.beans;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "current_date_operation")
public class CurrentDataOperation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "date_id")
	private long DateId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "show_date")
	private Date showDate;
	
	@Column(name = "show_time")
	private String showTime;
	
	@OneToMany(mappedBy = "operation", fetch = FetchType.EAGER)
	private List<Seat> seat;

	public long getDateId() {
		return DateId;
	}

	public void setDateId(long dateId) {
		DateId = dateId;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public List<Seat> getSeat() {
		return seat;
	}

	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

	public CurrentDataOperation(Date showDate, String showTime, List<Seat> seat) {
		super();
		this.showDate = showDate;
		this.showTime = showTime;
		this.seat = seat;
	}

	public CurrentDataOperation(long dateId, Date showDate, String showTime, List<Seat> seat) {
		super();
		DateId = dateId;
		this.showDate = showDate;
		this.showTime = showTime;
		this.seat = seat;
	}

	public CurrentDataOperation() {
		super();
	}

	@Override
	public String toString() {
		return "CurrentDataOperation [DateId=" + DateId + ", showDate=" + showDate + ", showTime=" + showTime
				+ ", seat=" + seat + "]";
	}

	

}