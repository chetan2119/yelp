package yelp.models;

/**
 * 
 * @author CJ
 *
 */
public class Yelp_text {

	private String review_id;
	private String reviewText;
	
	public String getReviewText() {
		return reviewText;
	}
	
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public String getReview_id() {
		return review_id;
	}

	public void setReview_id(String review_id) {
		this.review_id = review_id;
	}
	
}
