package com.cherry.app.runner;

import com.cherry.app.dao.ExampleDao;
import com.cherry.app.entity.ExamplePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ExampleRunner implements ApplicationRunner {

    private final ExampleDao dao;

    @Autowired
    public ExampleRunner(ExampleDao dao) {
        this.dao = dao;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ExamplePo po = new ExamplePo();
        po.setName("cherry");
        po.setJob("pg");
        dao.insert(po);
    }
}
