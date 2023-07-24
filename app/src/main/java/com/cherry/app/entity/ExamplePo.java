package com.cherry.app.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "test_collection")
public class ExamplePo {

    @Id
    private String id;
    private String name;
    private String job;

}
