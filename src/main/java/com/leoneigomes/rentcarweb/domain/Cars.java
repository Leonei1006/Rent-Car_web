package com.leoneigomes.rentcarweb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "cars")
@Entity
public class Cars implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, length = 8)
    private double daily_rate;

    @Column(nullable = false)
    private boolean avaliable;

    @Column(nullable = false, unique = true, length = 8)
    private String license_plate;

    @JoinColumn(nullable = false, unique = true)
    @ManyToOne
    private Brand brand_id;

    @JoinColumn(nullable = false, unique = true)
    @ManyToOne
    private Brand category_id;

    @Column(nullable = false, length = 20)
    private String color;

    @Column(nullable = false)
    private Date created_at;

    public Cars() {
    }

    public Cars(Long id, String name, String description, double daily_rate, boolean avaliable,
                String license_plate, Brand brand_id, Brand category_id, String color, Date created_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.daily_rate = daily_rate;
        this.avaliable = avaliable;
        this.license_plate = license_plate;
        this.brand_id = brand_id;
        this.category_id = category_id;
        this.color = color;
        this.created_at = created_at;
    }

    public Brand getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Brand category_id) {
        this.category_id = category_id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDaily_rate() {
        return daily_rate;
    }

    public void setDaily_rate(double daily_rate) {
        this.daily_rate = daily_rate;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public Brand getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Brand brand_id) {
        this.brand_id = brand_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", daily_rate=" + daily_rate +
                ", avaliable=" + avaliable +
                ", license_plate='" + license_plate + '\'' +
                ", brand_id=" + brand_id +
                ", category_id=" + category_id +
                ", color='" + color + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
