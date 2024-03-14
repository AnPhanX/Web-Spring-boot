package com.springboot.osahaneat.entity;

import com.springboot.osahaneat.entity.key.KeyMenuRestaurant;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "MenuRestaurant")
public class MenuRestaurant {
    @EmbeddedId
    KeyMenuRestaurant key;

    @ManyToOne
    @JoinColumn(name = "cate_id",insertable = false,updatable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "res_id", insertable = false,updatable = false)
    private Restaurant restaurant;

    @Column(name = "create_date")
    private Date createDate;

    public KeyMenuRestaurant getKey() {
        return key;
    }

    public void setKey(KeyMenuRestaurant key) {
        this.key = key;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
