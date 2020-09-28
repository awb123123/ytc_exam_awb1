package com.ytc.service;

import com.ytc.mapper.Problem3Mapper;
import com.ytc.model.Problem3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Problem3ServiceImpl implements Problem3Service{
    @Autowired
   private Problem3Mapper problem3Mapper;
    public List<Problem3> queryProblem3() {
        return problem3Mapper.queryProblem3();
    }
}
