package com.dio.shoppingcart.model;

import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@RedisHash("cart")
@Setter
public class Cart {

    @Id
    private Integer id;
    private List<Item> items;

    public Cart(){
    }

    public Cart(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public List<Item> getItems(){
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }


}
