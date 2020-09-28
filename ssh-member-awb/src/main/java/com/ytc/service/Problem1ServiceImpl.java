package com.ytc.service;

import com.ytc.mapper.Problem1Mapper;
import com.ytc.model.Problem1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Problem1ServiceImpl implements Problem1Service{
    @Autowired
    private Problem1Mapper problem1Mapper;
    public List<Problem1> queryProblem1() {
        return problem1Mapper.queryProblem1();
    }
}
