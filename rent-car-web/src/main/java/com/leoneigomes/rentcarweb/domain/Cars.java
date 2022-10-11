package com.leoneigomes.rentcarweb.domain;

import org.hibernate.annotations.Cascade;

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

    @Column( unique = true, length = 7)
    private String license_plate;

    @JoinColumn(nullable = true, unique = true)
    @ManyToOne( cascade = CascadeType.ALL)
    private Brand brand_id;

    @JoinColumn(nullable = true, unique = true)
    @ManyToOne( cascade = CascadeType.ALL)
    private Categories category_id;

    @Column(nullable = false, length = 20)
    private String color;

    @Column()
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    public Cars() {}



    public Cars ( String name, String description, double daily_rate, boolean avaliable,
             Brand brand_id, Categories category_id, String color, String license_plate) {
        this.name = name;
        this.description = description;
        this.daily_rate = daily_rate;
        this.avaliable = avaliable;
        this.brand_id = brand_id;
        this.category_id = category_id;
        this.color = color;
        this.license_plate = license_plate;
    }

    public Categories getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Categories category_id) {
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
