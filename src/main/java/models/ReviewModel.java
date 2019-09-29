package models;

import java.sql.Date;

public class ReviewModel {
	private static String reviewId;
	private static String userId;
	private static String businessId;
	private static String stars;
	private static Date date;
	private static int useful;
	private static int funny;
	private static int cool;
	
	public static String getReviewId() {
		return reviewId;
	}
	
	public static void setReviewId(String reviewId) {
		ReviewModel.reviewId = reviewId;
	}
	
	public static String getUserId() {
		return userId;
	}
	
	public static void setUserId(String userId) {
		ReviewModel.userId = userId;
	}
	
	public static String getBusinessId() {
		return businessId;
	}
	
	public static void setBusinessId(String businessId) {
		ReviewModel.businessId = businessId;
	}
	
	public static String getStars() {
		return stars;
	}
	
	public static void setStars(String stars) {
		ReviewModel.stars = stars;
	}
	
	public static Date getDate() {
		return date;
	}
	
	public static void setDate(Date date) {
		ReviewModel.date = date;
	}
	
	public static int getUseful() {
		return useful;
	}
	
	public static void setUseful(int useful) {
		ReviewModel.useful = useful;
	}
	
	public static int getFunny() {
		return funny;
	}
	
	public static void setFunny(int funny) {
		ReviewModel.funny = funny;
	}
	
	public static int getCool() {
		return cool;
	}
	
	public static void setCool(int cool) {
		ReviewModel.cool = cool;
	}
	
	
}
