package com.skilldistillery.foodtruck;

public class FoodTruck {

	private static int nextTruckID = 1;
	private int truckUniqueID;
	private String truckName;
	private String foodType; 
	private int rating;

	 

	public FoodTruck(String truckName, String foodType, int rating) {
		this();
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	public FoodTruck() {
		truckUniqueID = nextTruckID;
		nextTruckID ++;
	}


	public int getTruckUniqueID() {
		return truckUniqueID;
	}

	public void setTruckUniqueID(int truckUniqueID) {
		this.truckUniqueID = truckUniqueID;
	}

	public String getTruckName() {
		return truckName;
	}
 
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String toString() {
		return "FoodTruck [truckUniqueID=" + truckUniqueID + ", truckName=" + truckName + ", foodType=" + foodType
				+ ", rating=" + rating + "]";
	}
	//public void listAllTrucksByName() {
	//	String truckInfo = toString();
	//	System.out.println(truckInfo);
		
	//}
}
