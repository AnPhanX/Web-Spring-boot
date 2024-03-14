package com.springboot.osahaneat.entity.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class KeyOrderItem implements Serializable {

    @Column(name = "order_id")
    private int oderId;

    public int getOderId() {
        return oderId;
    }

    public void setOderId(int oderId) {
        this.oderId = oderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Column(name = "food_id")
    private int foodId;

    public KeyOrderItem(){}

    public KeyOrderItem(int orderId, int foodId){
        this.foodId=foodId;
        this.oderId=orderId;
    }
}
