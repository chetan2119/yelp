package models;

public class ReviewTextModel {

	private static String reviewId;
	private static String reviewText;
	
	public static String getReviewId() {
		return reviewId;
	}
	
	public static void setReviewId(String reviewId) {
		ReviewTextModel.reviewId = reviewId;
	}
	
	public static String getReviewText() {
		return reviewText;
	}
	
	public static void setReviewText(String reviewText) {
		ReviewTextModel.reviewText = reviewText;
	}
	
}
