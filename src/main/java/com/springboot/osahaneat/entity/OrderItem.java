package com.springboot.osahaneat.entity;

import com.springboot.osahaneat.entity.key.KeyOrderItem;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "OrderItem")
public class OrderItem {
    public KeyOrderItem getKeyOrderItem() {
        return keyOrderItem;
    }

    public void setKeyOrderItem(KeyOrderItem keyOrderItem) {
        this.keyOrderItem = keyOrderItem;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @EmbeddedId
    KeyOrderItem keyOrderItem;

    @ManyToOne
    @JoinColumn(name = "order_id",insertable = false,updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "food_id",insertable = false,updatable = false)
    private Food food;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "create_date")
    private Date createDate;
}
