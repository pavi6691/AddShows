package com.example.entity;

import java.util.Date;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
@Table(value = "Shows")
public class Show {

	@PrimaryKey
	private int showId;
	private int screenId;
	private String movieName;	
	private Date showStartDateTime;
	private Date showEndDateTime;
	private int price;
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getShowStartDateTime() {
		return showStartDateTime;
	}
	public void setShowStartDateTime(Date showStartDateTime) {
		this.showStartDateTime = showStartDateTime;
	}
	public Date getShowEndDateTime() {
		return showEndDateTime;
	}
	public void setShowEndDateTime(Date showEndDateTime) {
		this.showEndDateTime = showEndDateTime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
