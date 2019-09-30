package models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author CJ
 *
 */
@Entity
public class Yelp_business {

	@Id
	private String business_id;
	private String name;
	private String neighborhood;
	private int stars;
	private int reviewCounts;
	private boolean isOpen;
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
	
	public int getReviewCounts() {
		return reviewCounts;
	}
	
	public void setReviewCounts(int reviewCounts) {
		this.reviewCounts = reviewCounts;
	}
	public boolean isOpen() {
		return isOpen;
	}
	
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
}
