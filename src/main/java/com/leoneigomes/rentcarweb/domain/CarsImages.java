package com.leoneigomes.rentcarweb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "carsImages")
@Entity
public class CarsImages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column( nullable = false)
    private Long car_id;

    @Column(nullable = false)
    private byte image;

    @Column(nullable = false)
    private Date created_at;
    
    public CarsImages() {}
    
    public CarsImages(Long id, Long car_id, byte image, Date created_at) {
        this.id = id;
        this.car_id = car_id;
        this.image = image;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCar_id() {
        return car_id;
    }

    public void setCar_id(Long car_id) {
        this.car_id = car_id;
    }

    public byte getImage() {
        return image;
    }

    public void setImage(byte image) {
        this.image = image;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Cars_Images{" +
                "id=" + id +
                ", car_id=" + car_id +
                ", image=" + image +
                ", created_at=" + created_at +
                '}';
    }
}
