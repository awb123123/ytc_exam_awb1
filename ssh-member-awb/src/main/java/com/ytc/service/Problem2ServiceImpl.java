package com.ytc.service;

import com.ytc.mapper.Problem2Mapper;
import com.ytc.model.Problem2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Problem2ServiceImpl  implements Problem2Service{
    @Autowired
    private Problem2Mapper problem2Mapper;
    public List<Problem2> queryProblem2() {
        return problem2Mapper.queryProblem2() ;
    }
}
