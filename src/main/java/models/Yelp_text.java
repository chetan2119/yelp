package models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author CJ
 *
 */
@Entity
public class Yelp_text {

	@Id
	private String reviewId;
	private String reviewText;
	
	public String getReviewId() {
		return reviewId;
	}
	
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	
	public String getReviewText() {
		return reviewText;
	}
	
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	
}
