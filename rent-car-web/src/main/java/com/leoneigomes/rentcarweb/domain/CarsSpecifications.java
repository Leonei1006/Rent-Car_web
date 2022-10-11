package com.leoneigomes.rentcarweb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "Cars_Specifications")
@Entity
public class CarsSpecifications implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long car_id;
    @Column(nullable = false, unique = true)

    private Long specification_id;

    public CarsSpecifications() {
    }

    public CarsSpecifications(Long id, Long car_id, Long specification_id) {
        this.id = id;
        this.car_id = car_id;
        this.specification_id = specification_id;
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

    public Long getSpecification_id() {
        return specification_id;
    }

    public void setSpecification_id(Long specification_id) {
        this.specification_id = specification_id;
    }

    @Override
    public String toString() {
        return "Cars_Specifications{" +
                "id=" + id +
                ", car_id=" + car_id +
                ", specification_id=" + specification_id +
                '}';
    }
}