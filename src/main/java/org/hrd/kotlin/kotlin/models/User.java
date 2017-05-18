package org.hrd.kotlin.kotlin.models;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by RATHANA on 18-May-17.
 */
@Entity
@Table(name="tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String useEmail;
    private Date userDob;
    private String userPassword;
    private String userHash;
    private String userGender;
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

    public String getUseEmail() {
        return useEmail;
    }

    public void setUseEmail(String useEmail) {
        this.useEmail = useEmail;
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
