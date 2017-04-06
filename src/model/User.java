package model;

public class User {
	private int userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String roleType;
	private int userInterest;
	private String city;
	private String state;
	private int followersNum; // Should be array of users or user id
	private int followingNum; // Should be array of users or user id
	private String imageURL;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword() {
		this.password = password;
	} 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleId(String roleType) {
		this.roleType = roleType;
	}
	public int getUserInterest() {
		return userInterest;
	}
	public void setUserInterest(int userInterest) {
		this.userInterest = userInterest;
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
	public int getFollowersNum() {
		return followersNum;
	}
	public void setFollowersNum(int followersNum) {
		this.followersNum = followersNum;
	}
	public int getFollowingNum() {
		return followingNum;
	}
	public void setFollowingNum(int followingNum) {
		this.followingNum = followingNum;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
}