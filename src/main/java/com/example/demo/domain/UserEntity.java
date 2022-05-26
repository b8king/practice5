package com.example.demo.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "users", catalog = "")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userd_id")
    private long userdId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "pass")
    private String pass;
    @Basic
    @Column(name = "mail")
    private String mail;
    @Basic
    @Column(name = "profile")
    private String profile;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "birthday")
    private String birthday;

    public long getUserdId() {
        return userdId;
    }

    public void setUserdId(int userdId) {
        this.userdId = userdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public UserEntity() {

    }

    public UserEntity(String name, String pass, String mail, String city, String profile, String birthday) {
        this.name = name;
        this.pass = pass;
        this.mail = mail;
        this.city = city;
        this.profile = profile;
        this.birthday = birthday;

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UserEntity that = (UserEntity) o;
//        return userdId == that.userdId && Objects.equals(name, that.name) && Objects.equals(pass, that.pass) && Objects.equals(mail, that.mail) && Objects.equals(profile, that.profile) && Objects.equals(city, that.city) && Objects.equals(birthday, that.birthday);
//    }
//
//
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(userdId, name, pass, mail, profile, city, birthday);
//    }
}
