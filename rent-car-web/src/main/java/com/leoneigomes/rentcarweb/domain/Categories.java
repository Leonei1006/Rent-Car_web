package com.leoneigomes.rentcarweb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "Categories")
@Entity
public class Categories implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false, length = 15)
    private String name;
    @Column(nullable = false, length = 255)
    private String description;

    @Column()
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    public Categories() {}

    public Categories(Long id, String name, String description, Date created_at) {
        Id = id;
        this.name = name;
        this.description = description;
        this.created_at = created_at;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
