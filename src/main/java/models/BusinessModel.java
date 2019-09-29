package models;

public class BusinessModel {

	private static String businessId;
	private static String name;
	private static String neighbour;
	private static int stars;
	private static int reviewCounts;
	private static boolean isOpen;
	private static String category;
	
	public static String getBusinessId() {
		return businessId;
	}
	
	public static void setBusinessId(String businessId) {
		BusinessModel.businessId = businessId;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		BusinessModel.name = name;
	}
	
	public static String getNeighbour() {
		return neighbour;
	}
	
	public static void setNeighbour(String neighbour) {
		BusinessModel.neighbour = neighbour;
	}
	
	public static int getStars() {
		return stars;
	}
	
	public static void setStars(int stars) {
		BusinessModel.stars = stars;
	}
	
	public static int getReviewCounts() {
		return reviewCounts;
	}
	
	public static void setReviewCounts(int reviewCounts) {
		BusinessModel.reviewCounts = reviewCounts;
	}
	public static boolean isOpen() {
		return isOpen;
	}
	
	public static void setOpen(boolean isOpen) {
		BusinessModel.isOpen = isOpen;
	}
	
	public static String getCategory() {
		return category;
	}
	
	public static void setCategory(String category) {
		BusinessModel.category = category;
	}
	
}
