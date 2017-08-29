package com.shechaoqun.index.service;

import com.shechaoqun.index.dao.TestDao;
import com.shechaoqun.index.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chaoqunshe on 8/29/17.
 */
@Service
@Transactional(readOnly = true)
public class TestSevice {

    @Autowired
    private TestDao testDao;

    @Transactional(readOnly = true)
    public List<Test> queryAll() {
        return this.testDao.query();
    }
}
