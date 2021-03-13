package com.evan.mygradution.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    String username;
    String passwd;
    String email;
    Date date;
    Date birthday;
    String telephone;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getBirth() {
        return birthday;
    }

    public Date getDate() {
        return date;
    }

    public String getEamil() {
        return email;
    }

    public String getTele() {
        return telephone;
    }

    public void setBirth(Date birthday) {
        this.birthday = birthday;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEamil(String eamil) {
        this.email = eamil;
    }

    public void setTele(String tele) {
        this.telephone = tele;
    }
}
