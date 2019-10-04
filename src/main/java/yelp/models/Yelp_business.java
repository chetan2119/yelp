package yelp.models;

/**
 * 
 * @author CJ
 *
 */
public class Yelp_business { 

	private String business_id;
	private String name;
	private String neighborhood;
	private int stars;
	private int reviewCount;
	private boolean is_open;
	private String category;
	
	public String getbusiness_id() {
		return business_id;
	}
	
	public void setbusiness_id(String business_id) {
		this.business_id = business_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getneighborhood() {
		return neighborhood;
	}
	
	public void setneighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	public int getStars() {
		return stars;
	}
	
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public boolean isIs_open() {
		return is_open;
	}

	public void setIs_open(boolean is_open) {
		this.is_open = is_open;
	}
	
}
