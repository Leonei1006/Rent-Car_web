package com.leoneigomes.rentcarweb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "Customers")
@Entity
public class Customers implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false)
    private Date birth_date;
    @Column(nullable = false, unique = true, length = 50)
    private String email;
    @Column(nullable = false, unique = true, length = 15)
    private String driver_licence;
    @Column(nullable = false, length = 80)
    private String adress;
    @Column(nullable = false, unique = true, length = 11)
    private String phone_number;
    @Column(nullable = false)
    private Date created_at;
    @Column(nullable = false)
    private Date update_at;

    public Customers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriver_licence() {
        return driver_licence;
    }

    public void setDriver_licence(String driver_licence) {
        this.driver_licence = driver_licence;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth_date=" + birth_date +
                ", email='" + email + '\'' +
                ", driver_licence='" + driver_licence + '\'' +
                ", adress='" + adress + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", created_at=" + created_at +
                ", update_at=" + update_at +
                '}';
    }
}
