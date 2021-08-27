package com.dio.shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RedisHash("item")
public class Item {

    @Id
    private Integer productId;
    private Integer amount;
}
