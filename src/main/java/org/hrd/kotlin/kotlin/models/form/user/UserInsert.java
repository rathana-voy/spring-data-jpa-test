package org.hrd.kotlin.kotlin.models.form.user;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInsert {

	@JsonProperty("USER_NAME")
    private String userName;
    @JsonProperty("USER_EMAIL")
    private String userEmail;
    @JsonProperty("USER_DOB")
    private Date userDob;
    @JsonProperty("USER_PASSWORD")
    private String userPassword;
    @JsonProperty("USER_GENDER")
    private String userGender;
    
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserDob() {
		return userDob;
	}
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserImageProfile() {
		return userImageProfile;
	}
	public void setUserImageProfile(String userImageProfile) {
		this.userImageProfile = userImageProfile;
	}
	@JsonProperty("USER_IMAGE_PROFILE")
    private String userImageProfile;
    
    
}
