package com.dio.project3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Document(indexName = "product", type = "catalog")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer account;
}
