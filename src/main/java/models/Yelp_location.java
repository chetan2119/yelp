package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author CJ
 *
 */
@Entity
public class Yelp_location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;
	private String businessId;
	private String address;
	private String city;
	private String state;
	private int postal;
	private int lattitude;
	private int longitude;
	
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public String getBusinessId() {
		return businessId;
	}
	
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getPostal() {
		return postal;
	}
	
	public void setPostal(int postal) {
		this.postal = postal;
	}
	
	public int getLattitude() {
		return lattitude;
	}
	
	public void setLattitude(int lattitude) {
		this.lattitude = lattitude;
	}
	
	public int getLongitude() {
		return longitude;
	}
	
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
}
