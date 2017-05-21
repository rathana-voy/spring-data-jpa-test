package org.hrd.kotlin.kotlin.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

/**
 * Created by RATHANA on 18-May-17.
 */
@Entity
@Table(name="tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty("USER_ID")
    private int userId;
    @JsonProperty("USER_NAME")
    private String userName;
    @JsonProperty("USER_EMAIL")
    private String userEmail;
    @JsonProperty("USER_DOB")
    private Date userDob;
    @JsonProperty("USER_PASSWORD")
    private String userPassword;
    @JsonProperty("USER_HASH")
    private String userHash;
    @JsonProperty("USER_GENDER")
    private String userGender;
    @JsonProperty("USER_IMAGE_PROFILE")
    private String userImageProfile;

    public User(){}
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String getUserHash() {
        return userHash;
    }

    public void setUserHash(String userHash) {
        this.userHash = userHash;
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
}
