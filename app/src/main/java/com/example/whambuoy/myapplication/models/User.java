package com.example.whambuoy.myapplication.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "Users")

public class User extends Model {

    public User(String fullname, String phone, String password, String email) {
        this.fullname = fullname;
        this.phone = phone;
        this.password = password;
        this.email = email;
    }

    //fullname
    @Column(name = "fullname")
    private String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    //phone
    @Column(name = "phone")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    //password
    @Column(name = "password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //email
    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //returns llist of User objects
    //This is constructed by returning new object using select class and using teh builder pattern to call subsquent methods
    // ....on that in order to construct filters on objects that come back. In this case we want to get all the objects so this will be very short
    public static List<User>getAllLocations(){
        return new Select().from(User.class).execute();
    }

    public User(){
        super();
    }
}
