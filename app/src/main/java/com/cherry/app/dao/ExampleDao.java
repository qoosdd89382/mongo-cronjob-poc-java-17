package com.cherry.app.dao;

import com.cherry.app.entity.ExamplePo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleDao extends MongoRepository<ExamplePo, String> {

}
