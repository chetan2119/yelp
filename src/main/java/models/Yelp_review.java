package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author CJ
 *
 */
@Entity
public class Yelp_review {
	@Id
	private String reviewId;
	private String userId;
	private String businessId;
	private String stars;
	private Date date;
	private int useful;
	private int funny;
	private int cool;
	
	public String getReviewId() {
		return reviewId;
	}
	
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBusinessId() {
		return businessId;
	}
	
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	
	public String getStars() {
		return stars;
	}
	
	public void setStars(String stars) {
		this.stars = stars;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getUseful() {
		return useful;
	}
	
	public void setUseful(int useful) {
		this.useful = useful;
	}
	
	public int getFunny() {
		return funny;
	}
	
	public void setFunny(int funny) {
		this.funny = funny;
	}
	
	public int getCool() {
		return cool;
	}
	
	public void setCool(int cool) {
		this.cool = cool;
	}
	
	
}
