package models;

public class LocationModel {

	private static int locationId;
	private static String businessId;
	private static String address;
	private static String city;
	private static String state;
	private static int postal;
	private static int lattitude;
	private static int longitude;
	
	
	public static int getLocationId() {
		return locationId;
	}
	
	public static void setLocationId(int locationId) {
		LocationModel.locationId = locationId;
	}
	
	public static String getBusinessId() {
		return businessId;
	}
	
	public static void setBusinessId(String businessId) {
		LocationModel.businessId = businessId;
	}
	
	public static String getAddress() {
		return address;
	}
	
	public static void setAddress(String address) {
		LocationModel.address = address;
	}
	
	public static String getCity() {
		return city;
	}
	
	public static void setCity(String city) {
		LocationModel.city = city;
	}
	
	public static String getState() {
		return state;
	}
	
	public static void setState(String state) {
		LocationModel.state = state;
	}
	
	public static int getPostal() {
		return postal;
	}
	
	public static void setPostal(int postal) {
		LocationModel.postal = postal;
	}
	
	public static int getLattitude() {
		return lattitude;
	}
	
	public static void setLattitude(int lattitude) {
		LocationModel.lattitude = lattitude;
	}
	
	public static int getLongitude() {
		return longitude;
	}
	
	public static void setLongitude(int longitude) {
		LocationModel.longitude = longitude;
	}
	
}
